package com.zw.admin.server.factorty.strategies;


import com.zw.admin.server.dto.ActivityCreateDto;
import com.zw.admin.server.utils.WorkloadUtil;

import java.util.Map;

public class OtherStrategy implements WorkloadStrategy {


    @Override
    public Map<String, Double> calWorkload(ActivityCreateDto dto, double allWorkload, double coefficient) {
        //课时*活动级别系数
        double workload = dto.getClassTime() * coefficient;
        return WorkloadUtil.getResultMapTwo(workload, allWorkload);
    }
}
