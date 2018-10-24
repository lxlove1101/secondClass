package com.zw.admin.server.service;

import com.google.common.collect.ImmutableMap;

import com.zw.admin.server.dao.AllWorkloadDao;
import com.zw.admin.server.model.AllWorkload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllWorkService {

    @Autowired
    private AllWorkloadDao allWorkloadDao;

    public AllWorkload getThisYearWorkloadByTidAndWorkType(Integer tid, String code, String year) {
        List<AllWorkload> list = allWorkloadDao.list(ImmutableMap.of("teacherId", tid, "worktype_code", code, "inYear", year));
        if (list == null && list.size() <= 0) {
            AllWorkload allWorkload = new AllWorkload();
            allWorkload.setAllWorkload(0.0);
            allWorkload.setInYear(year);
            allWorkload.setTeacherId(tid);
            allWorkload.setWorktypeCode(code);
            try {
                int i = allWorkloadDao.create(allWorkload);

                return allWorkload;
            } catch (Exception e) {
                throw new RuntimeException("allworkload创建失败");
            }
        } else {
            return list.get(0);
        }
    }
}
