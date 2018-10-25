package com.zw.admin.server.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


@Slf4j
public class DateUtil {

    /*12小时制时间格式*/
    public static final String FORMAT12 = "yyyy-MM-dd hh:mm:ss";
    /*24小时制时间格式*/
    public static final String FORMAT24 = "yyyy-MM-dd HH:mm:ss";

    public static final String FORMAT24FORMIN = "yyyy-MM-dd HH:mm";


    public static final DateFormat df = new SimpleDateFormat(FORMAT24);


    /**
     * 日期字符串转成日期 yyyyMMddHHmmss
     *
     * @param date 日期字符串 yyyy-MM-dd HH:mm:ss
     * @return 日期
     */
    public static Date parse(String date) throws Exception {
        return df.parse(date);
    }

    /**
     * 获取当前时间
     *
     * @return 当前天
     */
    public static Date now() {
        return Calendar.getInstance().getTime();
    }

    /**
     * 时间戳转为date 对象
     *
     * @param timestamp 时间戳
     * @return Date
     */
    public static Date timestampToDate(String timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Long.parseLong(timestamp));
        return calendar.getTime();
    }

    /**
     * 获取当前日期的年月日
     */
    public static String getYearMDay(Date date) {
        SimpleDateFormat fomat2 = new SimpleDateFormat("yyyy-MM-dd");
        String mydate = fomat2.format(date);
        return mydate;
    }

    public static String getYearMDayHMS(Date date) {
        SimpleDateFormat fomat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String mydate = fomat2.format(date);
        return mydate;
    }

    /**
     * 获取当前日期的月日
     */
    public static String getMonthDay(Date date) {
        SimpleDateFormat fomat2 = new SimpleDateFormat("MM-dd");
        String mydate = fomat2.format(date);
        return mydate;
    }

    /**
     * 获取当前日期的年
     */
    public static String getThisYear(Date date) {
        SimpleDateFormat fomat2 = new SimpleDateFormat("yyyy");
        String mydate = fomat2.format(date);
        return mydate;
    }

    /**
     * 获取当前日期的星期
     */
    public static String getWeekOfDate(Date date) {
        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    /**
     * 获取当前日期的时分秒
     */
    public static String getTime(Date date) {
        DateFormat df = new SimpleDateFormat(FORMAT24);
        String myDate = df.format(date);
        String[] str = myDate.split(" ");
        return str[1];
    }

    /**
     * 获取当前日期的时分
     */
    public static String getTimeExactMinute(Date date) {
        DateFormat df = new SimpleDateFormat(FORMAT24);
        String myDate = df.format(date);
        String[] str = myDate.split(" ");
        String time = str[1].substring(0, str[1].lastIndexOf(":"));
        return time;
    }

}
