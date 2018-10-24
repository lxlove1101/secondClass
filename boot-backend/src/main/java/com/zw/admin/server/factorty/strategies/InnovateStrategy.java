package com.zw.admin.server.factorty.strategies;


import com.zw.admin.server.dto.ActivityCreateDto;
import com.zw.admin.server.enums.worktype.TeacherTypeEnum;
import com.zw.admin.server.utils.WorkloadUtil;

import java.util.Map;

public class InnovateStrategy implements WorkloadStrategy {


    @Override
    public Map<String, Double> calWorkload(ActivityCreateDto dto, double allWorkload, double coefficient) {
        //课时*老师职称*双创类别系数
        double workload = dto.getClassTime() * TeacherTypeEnum.getCoefficientByCode(dto.getTeacherType()) * coefficient;
        return WorkloadUtil.getResultMapTwo(workload,allWorkload);
    }
}
