package com.zw.admin.server.model;
import lombok.Data;

import java.util.Date;

@Data
public class Worktype implements java.io.Serializable {

    private Integer id;

    private String typeCode;

    private String typeName;

    private Integer sort;

    private Integer status;

    private Date createTime;

    private Date updateTime;


}