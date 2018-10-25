package com.zw.admin.server.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ActivityCreateDto extends BaseDto {

    /** 版本号 */
    private static final long serialVersionUID = -3877552715999204025L;

    /** 主键id */
    private Integer id;

    /** 老师id */
    private Integer teacherId;

    /** 老师级别 */
    private String teacherType;

    /** 工作类型大类号码 */
    private String worktypeCode;

    /** 工作类型名称 */
    private String worktypeName;

    /** 工作类型细节码 */
    private String worktypeDetailCode;

    /** 工作类型详情名称 */
    private String worktypeDetailName;

    /** 活动详情 */
    private String activityDetail;

    /** 学生数量/社团学生数量/参与人数 */
    private Integer number;

    /** 指导人数 */
    private Integer guideNumber;

    /** 工作量 */
    private Double workload;

    /** 活动开始时间 */
    private Date startTime;

    /** 课时 */
    private Integer classTime;

    /** 状态 */
    private Integer status;

    /** createTime */
    private Date createTime;

    /** updateTime */
    private Date updateTime;
}
