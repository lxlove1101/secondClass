package com.zw.admin.server.factorty.strategies;



import com.zw.admin.server.dto.ActivityCreateDto;
import com.zw.admin.server.enums.worktype.TeacherTypeEnum;
import com.zw.admin.server.utils.WorkloadUtil;

import java.util.Map;

public class ClassStrategy implements WorkloadStrategy {

    @Override
    public Map<String, Double> calWorkload(ActivityCreateDto dto, double allWorkload, double coefficient) {
        //课时*课堂人数系数*老师职称*系数
        double workload = dto.getClassTime() * WorkloadUtil.getCoefficientByNumber(dto.getNumber())
                * TeacherTypeEnum.getCoefficientByCode(dto.getTeacherType()) * coefficient;
        return WorkloadUtil.getResultMapOne(workload, allWorkload);
    }


}
