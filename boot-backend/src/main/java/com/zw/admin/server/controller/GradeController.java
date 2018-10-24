package com.zw.admin.server.controller;

import com.zw.admin.server.dto.GradeDto;
import com.zw.admin.server.dto.SpecificItemsDto;
import com.zw.admin.server.model.GradeCheckDetail;
import com.zw.admin.server.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "/grade_main")
    public List<SpecificItemsDto> gradeMain(){
        return gradeService.getAllFormDetail();
    }

    /**
     * 用户提交的第二学分详细信息
     * @param gradeDtos
     */
    @RequestMapping(value = "/grade_detail")
    public void gradeDetail(List<GradeDto> gradeDtos){
        if (null != gradeDtos && gradeDtos.size() != 0) {
            List<GradeCheckDetail> gradeCheckDetails = new ArrayList<>();
            for (GradeDto gradeDto : gradeDtos) {
                GradeCheckDetail gradeCheckDetail = new GradeCheckDetail(gradeDto);
                //获取提交表单的用户
                //gradeCheckDetail.setUserId();
                //gradeCheckDetail.setUserName();
                gradeCheckDetail.setCreateTime(new Date());
                gradeCheckDetail.setModifyTime(new Date());
                gradeCheckDetails.add(gradeCheckDetail);
            }
            gradeService.insertAllInitForm(gradeCheckDetails);
        }
    }
}
