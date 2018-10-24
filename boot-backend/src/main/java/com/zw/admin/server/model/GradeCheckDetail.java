package com.zw.admin.server.model;

import com.zw.admin.server.dto.GradeDto;
import lombok.Data;

import java.util.Date;

/**
 * GRADE_CHECK_DETAIL
 * 
 * @author 
 * @version 1.0.0 2018-10-13
 */
@Data
public class GradeCheckDetail implements java.io.Serializable, BaseGradeEntity {
    /** 版本号 */
    private static final long serialVersionUID = 6491433630230876456L;

    /** id */
    private Integer id;

    /** userId */
    private Long userId;

    /** userName */
    private String userName;

    /** state */
    private Integer state;

    /** createTime */
    private Date createTime;

    /** modifyTime */
    private Date modifyTime;

    /** smallTypeId */
    private String smallTypeId;

    /** type1Name */
    private String type1Name;

    /** type2Name */
    private String type2Name;

    /** type3Name */
    private String type3Name;

    /** name */
    private String name;

    public GradeCheckDetail(){

    }
    public GradeCheckDetail(GradeDto gradeDto){
        this.name = gradeDto.getName();
        this.smallTypeId = gradeDto.getSmallTypeId();
        this.type1Name = gradeDto.getType1Name();
        this.type2Name = gradeDto.getType2Name();
        this.type3Name = gradeDto.getType3Name();
    }

}