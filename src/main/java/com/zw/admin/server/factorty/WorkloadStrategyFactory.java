package com.zw.admin.server.factorty;


import com.zw.admin.server.factorty.strategies.ClassStrategy;
import com.zw.admin.server.factorty.strategies.WorkloadStrategy;

public class WorkloadStrategyFactory {

    private static final String CLASS_CODE = "01";
    private static final String LEARNING_CODE = "02";
    private static final String SOCIETY_CODE = "03";
    private static final String INNOVATE_CODE = "04";
    private static final String ASSN_CODE = "05";
    private static final String OTHER_CODE = "06";

    public static WorkloadStrategy create(String code) {
        switch (code) {
            case CLASS_CODE:
                return new ClassStrategy();
            case LEARNING_CODE:
                return new ClassStrategy();
            case SOCIETY_CODE:
                return new ClassStrategy();
            case INNOVATE_CODE:
                return new ClassStrategy();
            case ASSN_CODE:
                return new ClassStrategy();
            case OTHER_CODE:
                return new ClassStrategy();
        }
        throw new RuntimeException();
    }
}
