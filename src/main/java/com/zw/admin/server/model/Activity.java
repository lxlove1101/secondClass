package com.zw.admin.server.model;

import com.zw.admin.server.dto.ActivityCreateDto;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
public class Activity implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = -3877552715999204029L;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 老师id
     */
    private Integer teacherId;

    /**
     * 工作类型大类号码
     */
    private String worktypeCode;

    /**
     * 工作类型名称
     */
    private String worktypeName;

    /**
     * 工作类型细节码
     */
    private String worktypeDetailCode;

    /**
     * 工作类型详情名称
     */
    private String worktypeDetailName;

    /**
     * 活动详情
     */
    private String activityDetail;

    /**
     * 学生数量/社团学生数量/参与人数
     */
    private Integer number;

    /**
     * 指导人数
     */
    private Integer guideNumber;

    /**
     * 工作量
     */
    private String workload;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 课时
     */
    private Date classTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * createTime
     */
    private Date createTime;

    /**
     * updateTime
     */
    private Date updateTime;

    public Activity(ActivityCreateDto activityCreateDto) {
        BeanUtils.copyProperties(activityCreateDto, this, "id");
    }


}