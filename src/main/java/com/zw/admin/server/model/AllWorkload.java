package com.zw.admin.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class AllWorkload {
    private Integer id;
    private Integer teacherId;
    private String worktypeCode;
    /** 工作总量 */
    private Double allWorkload;
    /** 年份 */
    private String inYear;
    private Date createTime;
    private Date updateTime;
}
