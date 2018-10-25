package com.zw.admin.server.controller;


import com.zw.admin.server.model.Base.Response;
import com.zw.admin.server.model.Worktype;
import com.zw.admin.server.model.WorktypeDetali;
import com.zw.admin.server.service.WorkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/worktype")
public class WorkTypeController {

    @Autowired
    private WorkTypeService workTypeService;

    @GetMapping(value = "/listType")
    public Response<List<Worktype>> listType(){
        return workTypeService.listType();
    }

    @GetMapping(value = "/detail/{code}")
    public Response<List<WorktypeDetali>> listDetailWorkCode(@PathVariable("code") String code){
        return workTypeService.listTypeDetailByWorkTypeCode(code);
    }
}
