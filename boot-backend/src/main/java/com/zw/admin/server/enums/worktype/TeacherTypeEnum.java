package com.zw.admin.server.enums.worktype;

import lombok.Getter;

@Getter
public enum TeacherTypeEnum {
    LECTURER(1.0, "01", "讲师,科级"),
    PROFESSOR(2.0, "02", "教授,处级"),
    OTHER(3.0, "03", "教授以上,处级以上");
    private Double coefficient;
    private String code;
    private String msg;

    TeacherTypeEnum(Double coefficient, String code, String msg) {
        this.coefficient = coefficient;
        this.code = code;
        this.msg = msg;
    }

    public static double getCoefficientByCode(String code) {
        for (TeacherTypeEnum teacherTypeEnum : TeacherTypeEnum.values()) {
            if (teacherTypeEnum.getCode() == code) {
                return teacherTypeEnum.getCoefficient();
            }
        }

        return 1.0;
    }
}
