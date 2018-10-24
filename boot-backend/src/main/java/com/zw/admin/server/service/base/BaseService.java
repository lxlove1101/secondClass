package com.zw.admin.server.service.base;


import com.zw.admin.server.dto.BaseDto;
import com.zw.admin.server.model.Base.Response;

public interface BaseService {

    /**
     * 申请
     * @param baseDto 申请的参数
     * @return
     */
    Response apply(BaseDto baseDto);
}
