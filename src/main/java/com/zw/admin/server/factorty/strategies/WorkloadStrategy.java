package com.zw.admin.server.factorty.strategies;

import com.zw.admin.server.dto.ActivityCreateDto;

import java.util.Map;

public interface WorkloadStrategy {
    /**
     * 计算工作量
     *
     * @return 工作量
     */
    Map<String,Double> calWorkload(ActivityCreateDto dto, double allWorkload, double coefficient);
}
