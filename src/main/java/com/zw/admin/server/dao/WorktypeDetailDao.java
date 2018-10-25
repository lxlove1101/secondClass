package com.zw.admin.server.dao;

import com.zw.admin.server.model.WorktypeDetali;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Component
@Mapper
public interface WorktypeDetailDao extends BaseDao<WorktypeDetali> {
}
