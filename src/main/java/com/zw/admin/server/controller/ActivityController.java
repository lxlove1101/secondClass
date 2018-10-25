package com.zw.admin.server.controller;


import com.zw.admin.server.dto.ActivityCreateDto;
import com.zw.admin.server.dto.ActivityTimeDto;
import com.zw.admin.server.model.Activity;
import com.zw.admin.server.model.Base.Response;
import com.zw.admin.server.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping(value = "/apply")
    public Response applyActivity(ActivityCreateDto activityCreateDto) {
        return activityService.apply(activityCreateDto);
    }

    @GetMapping(value = "/apply")
    public Response<List<Activity>> getAllActivity(){
        return activityService.getAllApply();
    }
    @GetMapping(value = "/apply/{status}")
    public Response<List<Activity>> getAllBeginActivity(@PathVariable Integer status){
        return activityService.getApplyByStatus(status);
    }

    @PostMapping(value = "/apply")
    public Response<List<Activity>> getAllActivityInTime(ActivityTimeDto activityTimeDto){
        return activityService.getActivityInTime(activityTimeDto);
    }
}
