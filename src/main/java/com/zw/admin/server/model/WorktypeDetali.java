package com.zw.admin.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class WorktypeDetali implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -535819918272629622L;

    /** id */
    private Integer id;

    /** typeCode */
    private String typeCode;

    /** typeName */
    private String typeName;

    /** worktyepCode */
    private String worktypeCode;

    /** coefficient */
    private Double coefficient;

    /** isDelete */
    private Integer isDelete;

    /** createTime */
    private Date createTime;

    /** updateTime */
    private Date updateTime;


}