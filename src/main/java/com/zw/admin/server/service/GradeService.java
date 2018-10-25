package com.zw.admin.server.service;

import com.zw.admin.server.dao.GradeDao;
import com.zw.admin.server.dto.SpecificItemsDto;
import com.zw.admin.server.model.GradeCheckDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    private GradeDao gradeDao;

    /**
     * 获取学生填写的所有数据
     * @return
     */
    public List<SpecificItemsDto> getAllFormDetail(){
        return gradeDao.getAllGradeDetail();
    }

    public void insertAllInitForm(List<GradeCheckDetail> gradeCheckDetails){
        if (null != gradeCheckDetails && gradeCheckDetails.size() != 0) {
            gradeDao.creates(gradeCheckDetails);
        }
    }


}
