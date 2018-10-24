package com.zw.admin.server.utils;

import com.zw.admin.server.model.BaseGradeEntity;

public class GradeUtil {
    private GradeUtil(){}

    /**
     * 思想成长-->学术讲座分数计算
     * @param entity
     * @return 分数
     */
    public static int xueShuJiangZuoGrade(BaseGradeEntity entity){
        //在校期间参加校、院举办的学术讲座
        int count1 = 0;
        //应学院、学校要求面向校内外听众开设讲座
        int count2 = 0;
        int grade;

        grade = count1 / 2 + count2 / 2;
        if (grade >= 10){
            grade = 10;
        }
        return grade;
    }

    /**
     * 思想成长-->新生导航课
     * @param entity
     * @return 分数
     */
    public static int xinShengDaoHangKeGrade(BaseGradeEntity entity){
        int count = 0;
        int grade;

        grade = count / 2;
        if (grade >= 2){
            grade = 2;
        }
        return grade;
    }

    /**
     * 实践实习-->日常实践活动
     * @param entity
     * @return 分数
     */
    public static int riChangShiJianHuoDong(BaseGradeEntity entity){
        //参与日常社会实践活动
        int count1 = 0;
        //参与日常社会实践活动且获得学校、省级、国家级表彰
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        //策划组织日常社会实践活动

        int count2 = 0;
        //策划组织日常社会实践活动且获得学校、省级、国家级表彰
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade;
        grade = (count1 >= 5 ? 1 : 0) + count1_1 * 1 + count2 * 2 + count1_2 * 2 + count1_3 * 3 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;
        return grade;
    }

    /**
     * 志愿公益-->假期社会实践
     * @param entity
     * @return 分数
     */
    public static int jiaQiSheHuiShiJian(BaseGradeEntity entity){
        //参与学校、学院组队的社会实践
        int count1 = 0;
        //参与学校、学院组队的社会实践且获得学院、学校、省级、国家级表彰
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int count1_4 = 0;
        //个人主动联系社会实践地点

        int count2 = 0;
        //个人主动联系社会实践地点且获得学院、学校、省级、国家级表彰
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int count2_4 = 0;
        //参与省级以上组织组队的社会实践

        int count3 = 0;
        //参与省级以上组织组队的社会实践且获得省级以上表彰
        int count3_1 = 0;
        int count3_2 = 0;
        int grade;
        grade = count1 * 8 + count1_1 * 1 + count1_2 * 2+ count1_3 * 3+ count1_4 * 1 + count2 * 5 + count2_1 * 1 + count2_2 * 2+ count2_3 * 3+ count2_4 * 4  + count3 * 10 + count3_1 * 2 + count3_2 * 4;
        return grade;
    }

    /**
     * 志愿公益-->公益社会实践
     * @param entity
     * @return 分数
     */
    public static int gongYiSheHuiShiJian(BaseGradeEntity entity){
        //参与学校后勤公司组织的校内劳动周劳动
        int count1 = 0;
        //参与学院组织的社会公益活动或青年志愿者服务

        int count2 = 0;
        //参与学院组织的社会公益活动或青年志愿者服务且获得学校、省级、国家级表彰
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        //积极参与学校和省市级单位组织的社会公益活动或青年志愿者服务

        int count3 = 0;
        //积极参与学校和省市级单位组织的社会公益活动或青年志愿者服务且获得学校、省级、国家级表彰
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        //学生利用自身的专业特长辅导其他专业的学生
        int count4 = 0;
        int grade;

        grade = count1 * 5 + (count2 >= 2 ? 1 : 0) + count2_1 * 2 + count2_2 * 4+ count2_3 * 6 + count3 * 1 + count3_1 * 1 + count3_2 * 2 + count3_3 * 3 + count4 * 5;
        return grade;
    }

    /**
     * 创新创业-->学术课题
     * @param entity
     * @return 分数
     */
    public static int xueShuKeTi(BaseGradeEntity entity){
        //申报校级学生学术课题
        int count1_1 = 0;
        //课题经审批立项
        int count1_2 = 0;
        //课题结题
        int count1_3 = 0;
        //申报或参与校级以上课题校级、省级、国家级、世界级

        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int grade;

        grade = (count1_1 >= 3 ? 3 : count1_1) * 1 + count1_2 * 3 + count1_3 * 10 + count2 * 1 + count3 * 2 + count4 * 3 + count5 * 4;
        return grade;
    }

    /**
     * 创新创业-->学术论文
     * @param entity
     * @return 分数
     */
    public static int xueShuLunWen(BaseGradeEntity entity){
        //参与学院组织的学术论文竞赛交流活动
        int count1 = 0;
        //参与学院组织的学术论文竞赛交流活动且获得三等奖、二等奖、一等奖
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 1 + count1_1 * 1 + count1_2 * 2 + count1_3 * 3;
        //经学院选拔参与学校组织的校内学术论文竞赛交流活动
        int count2 = 0;
        //经学院选拔参与学校组织的校内学术论文竞赛交流活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 2 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;

        //代表学校参与省级或省级以上学术论文竞赛交流活动
        int count3 = 0;
        //代表学校参与省级或省级以上学术论文竞赛交流活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 5 + count3_1 * 3 + count3_2 * 6 + count3_3 * 9;

        //以个人名义参与省级或省级以上学术论文竞赛交流活动
        int count4 = 0;
        //以个人名义参与省级或省级以上学术论文竞赛交流活动且获得三等奖、二等奖、一等奖
        int count4_1 = 0;
        int count4_2 = 0;
        int count4_3 = 0;
        int grade4 = count4 * 3 + count4_1 * 3 + count4_2 * 6 + count4_3 * 9;

        //学生在省级以上公开发表学术论文省级、国家级、世界级
        int count5_1 = 0;
        int count5_2 = 0;
        int count5_3 = 0;
        int grade5 = count5_1 * 5 + count5_2 * 10 + count5_3 * 15;

        int grade;
        grade = grade1 <=5 ? grade1 : 5 + grade2 <=10 ? grade2 : 10 + grade3 <=10 ? grade3 : 10 + grade4 <=9 ? grade4 : 9 + grade5;
        return grade;
    }

    /**
     * 创新创业-->科技制作
     * @param entity
     * @return 分数
     */
    public static int keJiZhiZuo(BaseGradeEntity entity){
        //参与学院组织的科技制作活动
        int count1 = 0;
        //参与学院组织的科技制作活动且获得三等奖、二等奖、一等奖
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 2 + count1_1 * 1 + count1_2 * 2 + count1_3 *3;

        //经学院选拔参与学校组织的校内科技制作活动
        int count2 = 0;
        //经学院选拔参与学校组织的校内科技制作活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 3 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;

        //代表学校参与省级或省级以上科技制作活动
        int count3 = 0;
        //代表学校参与省级或省级以上科技制作活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 5 + count3_1 * 3 + count3_2 * 6 + count3_3 * 9;

        //以个人名义参与省级或省级以上科技制作活动
        int count4 = 0;
        //以个人名义参与省级或省级以上科技制作活动且获得三等奖、二等奖、一等奖
        int count4_1 = 0;
        int count4_2 = 0;
        int count4_3 = 0;
        int grade4 = count4 * 3 + count4_1 * 3 + count4_2 * 6 + count4_3 * 9;

        //发明申请专利获得批准
        int count5 = 0;
        int grade5 = count5 * 10;
        int grade = grade1 <= 10 ? grade1 : 10 + grade2 <= 9 ? grade2 : 9 + grade3 <= 10 ? grade3 : 10 + grade4 <= 8 ? grade4 : 8 + grade5;
        return grade;
    }

    /**
     * 创新创业-->调查报告
     * @param entity
     * @return 分数
     */
    public static int diaoChaBaoGao(BaseGradeEntity entity){
        //参与学院组织的社会调查活动
        int count1 = 0;
        //参与学院组织的社会调查活动且获得三等奖、二等奖、一等奖
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 2 + count1_1 * 1 + count1_2 * 2 + count1_3 *3;

        //经学院选拔参与学校组织的调查活动
        int count2 = 0;
        //经学院选拔参与学校组织的调查活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 3 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;

        //代表学校参与省级或省级以上社会调查活动
        int count3 = 0;
        //代表学校参与省级或省级以上社会调查活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 3 + count3_1 * 3 + count3_2 * 6 + count3_3 * 9;

        int grade = grade1 <= 5 ? grade1 : 5 + grade2 <= 10 ? grade2 : 10 + grade3 <= 9 ? grade3 : 9;
        return grade;
    }

    /**
     * 创新创业-->创业实践
     * @param entity
     * @return 分数
     */
    public static int chuangYeShiJian(BaseGradeEntity entity){
        //参与学院组织的创业设计大赛活动
        int count1 = 0;
        //参与学院组织的创业设计大赛活动且获得三等奖、二等奖、一等奖
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 2 + count1_1 * 1 + count1_2 * 2 + count1_3 *3;

        //经学院选拔参与学校组织的创业设计大赛活动
        int count2 = 0;
        //经学院选拔参与学校组织的创业设计大赛活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 4 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;

        //代表学校参与省级或省级以上创业设计大赛活动
        int count3 = 0;
        //代表学校参与省级或省级以上创业设计大赛活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 6 + count3_1 * 3 + count3_2 * 6 + count3_3 * 9;

        //以团队或个人名义开展创业实践活动
        int count4 = 0;
        //拥有自己的创业公司或持续创业达半年以上
        int count4_1 = 0;
        int grade4 = count4 * 2 + count4_1 * 10;

        int grade = grade1 <= 5 ? grade1 : 5 + grade2 <= 10 ? grade2 : 10 + grade3 <= 10 ? grade3 : 10 + grade4;
        return grade;
    }

    /**
     * 创新创业-->其它项目创新
     * @param entity
     * @return
     */
    public static int qiTaXiangMuChuangXin(BaseGradeEntity entity){
        //参与经学院或有关职能部门认可，认为确实具有创新的活动项目
        int count = 0;
        int grade = count;
        return grade <= 10 ? grade : 10;
    }

    /**
     * 文体活动-->艺术活动
     * @return
     */
    public static int yiShuHuoDong(){
        //参与学院大学生素质拓展艺术团体训练
        int count1 = 0;
        //参与校级以上艺术团体训练
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 3 + count1_1 * 2 + count1_2 * 4 + count1_3 * 6;

        //参与学院组织的艺术教育类实践活动
        int count2 = 0;
        //参与学院组织的艺术教育类实践活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 1 + count2_1 * 1 + count2_2 * 2 + count2_3 * 3;

        //参与学校组织的艺术教育类实践活动
        int count3 = 0;
        //参与学校组织的艺术教育类实践活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 3 + count3_1 * 2 + count3_2 * 4 + count3_3 * 6;

        //代表学校参与省级或省级以上艺术教育类实践活动
        int count4 = 0;
        //代表学校参与省级或省级以上艺术教育类实践活动且获得三等奖、二等奖、一等奖
        int count4_1 = 0;
        int count4_2 = 0;
        int count4_3 = 0;
        int grade4 = count4 * 5 + count4_1 * 2 + count4_2 * 4 + count4_3 * 6;

        //以个人名义参与其他社会机构组织的艺术教育活动
        int count5 = 0;
        int grade5 = count5;
        return grade1 + grade2 + grade3 + grade4 + grade5;
    }

    /**
     * 文体活动-->社团活动
     * @param entity
     * @return
     */
    public static int sheTuanHuoDong(BaseGradeEntity entity){
        //参加社团组织
        int count1 = 0;
        //参加社团组织且获学校、省级、国家级表彰
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade = count1 * 3 + count1_1 * 3 + count1_2 * 6 + count1_3 * 9;
        return grade;
    }

    /**
     * 社会工作-->学生干部实践
     * @return
     */
    public static int xueShengGanBuShiJian(){
        return 0;
    }

    /**
     * 社会工作-->勤工俭（助）学
     * @param entity
     * @return
     */
    public static int qinGongJianXue(BaseGradeEntity entity){
        //参加勤工俭（助）学活动
        int count1 = 0;
        //参加勤工俭（助）学活动且获得学校、省级、国家级表彰
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade = count1 * 2 + count1_1 * 2 + count1_2 * 4 + count1_3 * 6;
        return grade;
    }

    /**
     * 技能特长-->知识技能竞赛
     * @return
     */
    public static int zhiShiJiNengjingSai(BaseGradeEntity entity){
        //参与学院组织的知识技能竞赛活动
        int count1 = 0;
        //参与学院组织的知识技能竞赛活动且获得三等奖、二等奖、一等奖
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 1 + count1_1 * 1 + count1_2 * 2 + count1_3 * 3;

        //经学院选拔参与学校组织的知识技能竞赛活动
        int count2 = 0;
        //经学院选拔参与学校组织的知识技能竞赛活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 2 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;

        //代表学校参与省级或省级以上知识技能竞赛活动
        int count3 = 0;
        //代表学校参与省级或省级以上知识技能竞赛活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 3 + count3_1 * 3 + count3_2 * 6 + count3_3 * 9;

        //以个人名义参与省级或省级以上知识技能竞赛活动
        int count4 = 0;
        //以个人名义参与省级或省级以上知识技能竞赛活动且获得三等奖、二等奖、一等奖
        int count4_1 = 0;
        int count4_2 = 0;
        int count4_3 = 0;
        int grade4 = count4 * 2 + count4_1 * 2 + count4_2 * 4 + count4_3 * 6;

        //参加校素质拓展中心开展的各种技能培训
        int count5_1 = 0;
        //参加校素质拓展计划鼓励并认可的各类国家资格证书考试与通过大学生相对应的等级的考试
        int count5_2 = 0;
        // 参加校素质拓展计划鼓励并认可的各类国家资格证书考试通过与大学生相对应更高等级的考试
        int count5_3 = 0;
        int grade5 = count5_1 * 5 + count5_2 * 5 + count5_3 * 10;

        int grade = grade1 <= 3 ? grade1 : 3 + grade2 <= 8 ? grade2 : 8 + grade3 <= 10 ? grade3 : 10 + grade4 <= 8 ? grade4 : 8 + grade5;
        return grade;
    }

    /**
     * 教师技能-->“三字一话”
     * @param entity
     * @return
     */
    public static int sanZiYiHua(BaseGradeEntity entity){
        //参与学院组织的“三字一话”竞赛活动
        int count1 = 0;
        //参与学院组织的“三字一话”竞赛活动且获得三等奖、二等奖、一等奖
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 1 + count1_1 * 1 + count1_2 * 2 + count1_3 * 3;

        //经学院选拔参与学校组织的“三字一话”竞赛活动
        int count2 = 0;
        //经学院选拔参与学校组织的“三字一话”竞赛活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 5 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;

        //代表学校参与省级或省级以上“三字一话”竞赛活动
        int count3 = 0;
        //代表学校参与省级或省级以上“三字一话”竞赛活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 8 + count3_1 * 2 + count3_2 * 4 + count3_3 * 6;

        //参与“三字一话”为内容的培训
        int count4 = 0;
        int grade4 = count4 * 5;

        int grade = grade1 + grade2 + grade3 + grade4;
        return grade;
    }

    /**
     * 教师技能-->现代教育技术
     * @param entity
     * @return
     */
    public static int xianDaiJiaoYuJiShu(BaseGradeEntity entity){
        //参与学院组织的现代教育技术竞赛活动
        int count1 = 0;
        //参与学院组织的现代教育技术竞赛活动且获得三等奖、二等奖、一等奖
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 1 + count1_1 * 1 + count1_2 * 2 + count1_3 * 3;

        //经学院选拔参与学校组织的现代教育技术竞赛活动
        int count2 = 0;
        //经学院选拔参与学校组织的现代教育技术竞赛活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 5 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;

        //代表学校参与省级或省级以上现代教育技术竞赛活动
        int count3 = 0;
        //代表学校参与省级或省级以上现代教育技术竞赛活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 8 + count3_1 * 2 + count3_2 * 4 + count3_3 * 6;

        //参与现代教育技术培训
        int count4 = 0;
        int grade4 = count4 * 5;

        int grade = grade1 + grade2 + grade3 + grade4;
        return grade;
    }

    /**
     * 教师技能-->课堂教学技能
     * @param entity
     * @return
     */
    public static int keTangJiaoXueJiNeng(BaseGradeEntity entity){
        //参与学院组织的课堂教学技能竞赛活动
        int count1 = 0;
        //参与学院组织的课堂教学技能竞赛活动且获得三等奖、二等奖、一等奖
        int count1_1 = 0;
        int count1_2 = 0;
        int count1_3 = 0;
        int grade1 = count1 * 1 + count1_1 * 1 + count1_2 * 2 + count1_3 * 3;

        //经学院选拔参与学校组织的课堂教学技能竞赛活动
        int count2 = 0;
        //经学院选拔参与学校组织的课堂教学技能竞赛活动且获得三等奖、二等奖、一等奖
        int count2_1 = 0;
        int count2_2 = 0;
        int count2_3 = 0;
        int grade2 = count2 * 5 + count2_1 * 2 + count2_2 * 4 + count2_3 * 6;

        //代表学校参与省级或省级以上课堂教学技能竞赛活动
        int count3 = 0;
        //代表学校参与省级或省级以上课堂教学技能竞赛活动且获得三等奖、二等奖、一等奖
        int count3_1 = 0;
        int count3_2 = 0;
        int count3_3 = 0;
        int grade3 = count3 * 8 + count3_1 * 2 + count3_2 * 4 + count3_3 * 6;

        int grade = grade1 + grade2 + grade3;
        return grade;
    }
}
