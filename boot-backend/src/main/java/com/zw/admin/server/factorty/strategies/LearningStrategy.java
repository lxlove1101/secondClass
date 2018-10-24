package com.zw.admin.server.factorty.strategies;


import com.zw.admin.server.dto.ActivityCreateDto;
import com.zw.admin.server.utils.WorkloadUtil;

import java.util.Map;

public class LearningStrategy implements WorkloadStrategy {


    @Override
    public Map<String, Double> calWorkload(ActivityCreateDto dto, double allWorkload, double coefficient) {
        //课时*对应奖项系数
        double workload = dto.getClassTime() * coefficient;
        return  WorkloadUtil.getResultMapOne(workload,allWorkload);
    }
}
