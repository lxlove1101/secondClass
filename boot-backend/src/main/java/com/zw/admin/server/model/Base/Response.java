package com.zw.admin.server.model.Base;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private static final int SUCCESS = 200;
    private static final int FAIL = 400;

    private Integer code;
    private String error;
    private T data;

    public static <T> Response<T> ok(T data) {
        Response<T> resp = new Response();
        resp.data = data;
        resp.code = SUCCESS;
        return resp;
    }

    public static <T> Response<T> fail(String msg) {
        Response<T> resp = new Response();
        resp.code = FAIL;
        resp.error = msg;
        return resp;
    }

}
