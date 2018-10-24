package com.zw.admin.server.service;

import com.zw.admin.server.model.Permission;

import java.util.List;

public interface PermissionService {

	void save(Permission permission);

	void update(Permission permission);

	void delete(Long id);

	List<Permission> permissionsCurrent();
}
