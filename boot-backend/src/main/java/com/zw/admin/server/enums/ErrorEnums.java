package com.zw.admin.server.enums;


import lombok.Getter;

@Getter
public enum  ErrorEnums {
    //example  FAILED_PARAM_INVALID("param.invalid"), /* 参数不合法 */
    ;
    private String msg;

    ErrorEnums( String msg) {
        this.msg = msg;
    }
}
