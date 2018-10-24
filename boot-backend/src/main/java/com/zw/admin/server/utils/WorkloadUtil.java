package com.zw.admin.server.utils;


import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class WorkloadUtil {

    public static double getCoefficientByNumber(Integer number) {
        if (number < 25) {
            throw new RuntimeException("开班人数未达要求");
        } else if (number >= 25 && number <= 65) {
            return 1.0;
        } else if (number > 65) {
            int var1 = (number - 65) / 20;
            double sum = 1;
            while (var1 > 0) {
                sum = sum * 1.1;
                var1--;
            }
            if (sum > 2) {
                return 2.0;
            }
            return sum;
        } else {
            throw new RuntimeException();
        }
    }

    public static double getCoefficientByNumberAssn(Integer number) {
        if (number < 30) {
            return 1.0;
        } else if (number >= 30 && number <= 100) {
            return 1.5;
        } else {
            return 2.0;
        }
    }

    public static double getCoefficientByNumberAssnGuide(Integer guideNumber) {
        double sum = 0;
        while (guideNumber > 0) {
            sum += 0.5;
            guideNumber--;
        }
        if (sum > 3.0) {
            sum = 3.0;
        }
        return sum;

    }


    public static Map<String, Double> getResultMapOne(Double workload, Double allWorkload) {
        if (allWorkload > 120) {
            return getResultMap(workload, 0.0);
        } else if (allWorkload + workload > 120) {
            return getResultMap(workload, 120 - allWorkload);
        } else {
            return getResultMap(workload, workload);
        }
    }

    public static Map<String, Double> getResultMapTwo(Double workload, Double allWorkload) {
        if (allWorkload > 60) {
            return getResultMap(workload, 0.0);
        } else if (allWorkload + workload > 60) {
            return getResultMap(workload, 60 - allWorkload);
        } else {
            return getResultMap(workload, workload);
        }
    }

    /**
     * 封装两个工作量，一个是计算的一个是有效的
     *
     * @param workload
     * @param effectiveWorkload
     * @return
     */
    public static Map<String, Double> getResultMap(Double workload, Double effectiveWorkload) {
        return ImmutableMap.of("workload", workload, "effectiveWorkload", effectiveWorkload);
    }

}
