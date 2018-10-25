package com.zw.admin.server.service.impl;

import com.zw.admin.server.model.User;
import com.zw.admin.server.utils.UserUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zw.admin.server.dao.PermissionDao;
import com.zw.admin.server.model.Permission;
import com.zw.admin.server.service.PermissionService;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;
@Slf4j
@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionDao permissionDao;

	public List<Permission> permissionsCurrent() {
		List<Permission> list = UserUtil.getCurrentPermissions();
		if (list == null) {
			User user = UserUtil.getCurrentUser();
			list = permissionDao.listByUserId(user.getId());
			UserUtil.setPermissionSession(list);
		}
		final List<Permission> permissions = list.stream().filter(l -> l.getType().equals(1))
				.collect(Collectors.toList());
		//拿到第0级的所有全选
		List<Permission> firstLevel = permissions.stream().filter(p -> p.getParentId().equals(0L)).collect(Collectors.toList());
		//设置子菜单
		firstLevel.parallelStream().forEach(p -> {
			setChild(p, permissions);
		});
		return firstLevel;
	}

	@Override
	public void save(Permission permission) {
		permissionDao.save(permission);

		log.debug("新增菜单{}", permission.getName());
	}

	@Override
	public void update(Permission permission) {
		permissionDao.update(permission);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		permissionDao.deleteRolePermission(id);
		permissionDao.delete(id);
		permissionDao.deleteByParentId(id);

		log.debug("删除菜单id:{}", id);
	}

	/**
	 * 设置子元素
	 * @param p
	 * @param permissions
	 */
	private void setChild(Permission p, List<Permission> permissions) {
		//根据0级id找到所有子节点,
		List<Permission> child = permissions.parallelStream().filter(a -> a.getParentId().equals(p.getId())).collect(Collectors.toList());
		p.setChild(child);
		//递归设置，直到没有子节点
		if (!CollectionUtils.isEmpty(child)) {
			child.parallelStream().forEach(c -> {
				//递归设置子元素，多级菜单支持
				setChild(c, permissions);
			});
		}
	}

}
