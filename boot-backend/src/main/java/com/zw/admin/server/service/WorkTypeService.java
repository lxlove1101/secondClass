package com.zw.admin.server.service;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.zw.admin.server.dao.WorktypeDao;
import com.zw.admin.server.dao.WorktypeDetailDao;
import com.zw.admin.server.model.Base.Response;
import com.zw.admin.server.model.Worktype;
import com.zw.admin.server.model.WorktypeDetali;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTypeService {

    @Autowired
    private WorktypeDao worktypeDao;
    @Autowired
    private WorktypeDetailDao worktypeDetailDao;

    public Response<List<Worktype>> listType() {
        return Response.ok(worktypeDao.getAll());
    }

    public Response<List<WorktypeDetali>> listTypeDetailByWorkTypeCode(String code) {
        return Response.ok(worktypeDetailDao.list(ImmutableBiMap.of("worktypeCode", code)));
    }

    public double getCoefficientByDetailCode(String code) {
        List<WorktypeDetali> worktypeDetalis = worktypeDetailDao.list(ImmutableMap.of("typeCode", code));
        if (worktypeDetalis == null && worktypeDetalis.size() <= 0){
            throw new RuntimeException("根据此code没有查询到对应类型");
        }
        return worktypeDetalis.get(0).getCoefficient();
    }


}
