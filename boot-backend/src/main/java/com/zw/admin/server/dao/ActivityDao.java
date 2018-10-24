package com.zw.admin.server.dao;

import com.zw.admin.server.model.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ActivityDao extends BaseDao<Activity> {
}
