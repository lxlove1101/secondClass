package com.zw.admin.server.dao;

import com.zw.admin.server.dto.SpecificItemsDto;
import com.zw.admin.server.model.GradeCheckDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface GradeDao extends BaseDao<GradeCheckDetail>  {
    List<SpecificItemsDto> getAllGradeDetail();
}
