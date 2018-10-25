package com.zw.admin.server.service.base;


import com.zw.admin.server.model.Base.Response;

public interface UserService {


    Response<Boolean> login();
    Response<Boolean> logout();

}
