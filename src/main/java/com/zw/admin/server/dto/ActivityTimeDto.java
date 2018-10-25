package com.zw.admin.server.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ActivityTimeDto {

    private Integer offset;
    private Integer size;
    private Integer status;
    private Date startTime;
    private Date endTime;
}
