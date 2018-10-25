package com.zw.admin.server.model;

import lombok.Data;

import java.util.Date;

/**
 * SPECIFIC_ITEMS
 * 
 * @author
 */
@Data
public class SpecificItems implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4770337450421653956L;

    /** id */
    private Long id;

    /** name */
    private String name;

    /** details */
    private String details;

    /** smallTypeId */
    private String smallTypeId;

    /** score */
    private Integer score;

    /** status */
    private Integer status;

    /** auditPerson */
    private Long auditPerson;

    /** createTime */
    private Date createTime;

    /** endTime */
    private Date endTime;

    /** modifyTime */
    private Date modifyTime;
}