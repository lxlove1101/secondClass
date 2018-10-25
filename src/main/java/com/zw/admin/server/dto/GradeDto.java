package com.zw.admin.server.dto;

import lombok.Data;

/**
 * @author DoctorFive
 * 用来接收学生填写的第二课堂信息
 */
@Data
public class GradeDto extends BaseDto {
    /** smallTypeId */
    private String smallTypeId;

    /** type1Name */
    private String type1Name;

    /** type2Name */
    private String type2Name;

    /** type3Name */
    private String type3Name;

    /** name */
    private String name;
}
