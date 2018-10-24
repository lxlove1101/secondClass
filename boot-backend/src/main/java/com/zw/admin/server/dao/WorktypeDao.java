package com.zw.admin.server.dao;

import com.zw.admin.server.model.Worktype;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface WorktypeDao extends BaseDao<Worktype> {
}
