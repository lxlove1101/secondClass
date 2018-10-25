package com.zw.admin.server.service;

import com.google.common.collect.ImmutableMap;
import com.zw.admin.server.dao.ActivityDao;
import com.zw.admin.server.dao.AllWorkloadDao;
import com.zw.admin.server.dto.ActivityCreateDto;
import com.zw.admin.server.dto.ActivityTimeDto;
import com.zw.admin.server.dto.BaseDto;
import com.zw.admin.server.factorty.WorkloadStrategyFactory;
import com.zw.admin.server.factorty.strategies.WorkloadStrategy;
import com.zw.admin.server.model.Activity;
import com.zw.admin.server.model.AllWorkload;
import com.zw.admin.server.model.Base.Response;
import com.zw.admin.server.service.base.BaseService;
import com.zw.admin.server.utils.BeanUtil;
import com.zw.admin.server.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ActivityService implements BaseService {

    @Autowired
    private ActivityDao activityDao;
    @Autowired
    private AllWorkloadDao allWorkloadDao;
    @Autowired
    private WorkTypeService workTypeService;
    @Autowired
    private AllWorkService allWorkService;

    @Override
    public Response apply(BaseDto baseDto) {
        ActivityCreateDto dto = (ActivityCreateDto) baseDto;
        String code = dto.getWorktypeCode();
        try {
            //根据code拿到对应计算规则
            WorkloadStrategy strategy = WorkloadStrategyFactory.create(code);
            //获取此用户今年所有的工作量
            String thisYear = DateUtil.getThisYear(dto.getStartTime());
            AllWorkload allWorkload = allWorkService.getThisYearWorkloadByTidAndWorkType(dto.getTeacherId(),
                    dto.getWorktypeCode(), thisYear);
            double coefficient = workTypeService.getCoefficientByDetailCode(dto.getWorktypeDetailCode());
            //计算此次提交的任务量
            Map<String, Double> result = strategy.calWorkload(dto, allWorkload.getAllWorkload(), coefficient);
            //插入此活动
            dto.setWorkload(result.get("effectiveWorkload"));
            int i = activityDao.create(new Activity(dto));
            allWorkload.setAllWorkload(result.get("workload") + allWorkload.getAllWorkload());
            int update = allWorkloadDao.update(allWorkload);
            if (i != 1 || update != 1) {
                throw new RuntimeException("申请出错");
            }
        } catch (Exception e) {
            Response.fail(e.getMessage());
        }
        return Response.ok(true);
    }

    public Response<List<Activity>> getAllApply() {
        return Response.ok(activityDao.getAll());
    }

    public Response<List<Activity>> getApplyByStatus(Integer status) {
        return Response.ok(activityDao.list(ImmutableMap.of("status", status)));
    }

    public Response<List<Activity>> getActivityInTime(ActivityTimeDto timeDto) {
        return Response.ok(activityDao.paging(BeanUtil.ConvertObjToMap(timeDto)));
    }

}
