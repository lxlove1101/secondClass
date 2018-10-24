package com.zw.admin.server.enums;

import lombok.Getter;

@Getter
public enum  ApplyStatusEnums {
    APPLY(0,"审核中"),
    APPLY_PASS(1,"审核通过"),
    APPLY_NOT_PASS(2,"审核未通过"),
    ;

    private Integer key;
    private String msg;

    ApplyStatusEnums(Integer key, String msg) {
        this.key = key;
        this.msg = msg;
    }
}
