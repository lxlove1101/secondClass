package com.zw.admin.server.factorty.strategies;


import com.zw.admin.server.dto.ActivityCreateDto;
import com.zw.admin.server.enums.worktype.TeacherTypeEnum;
import com.zw.admin.server.utils.WorkloadUtil;

import java.util.Map;

public class AssnStrategy implements WorkloadStrategy {


    @Override
    public Map<String, Double> calWorkload(ActivityCreateDto dto, double allWorkload, double coefficient) {
        dto.getGuideNumber();
        double workload = dto.getClassTime() * WorkloadUtil.getCoefficientByNumberAssn(dto.getNumber())
                * TeacherTypeEnum.getCoefficientByCode(dto.getTeacherType()) * WorkloadUtil.getCoefficientByNumberAssnGuide(dto.getGuideNumber());
        return WorkloadUtil.getResultMapTwo(workload,allWorkload);
    }
}
