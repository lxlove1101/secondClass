package com.zw.admin.server.dao;

import com.zw.admin.server.model.AllWorkload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AllWorkloadDao extends BaseDao<AllWorkload> {
    AllWorkload getThisYearWorkloadByTidAndWorkType(@Param("teacherId") Integer teacherId,
                                                    @Param("worktypeCode") String typeCode, @Param("inYear") String year);
}
