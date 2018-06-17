package com.github.mi.base.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
  /**
   * 判断时间是否在时间段内
   * 
   * @param date 当前时间 yyyy-MM-dd HH:mm:ss
   * @param strDateBegin 开始时间 00:00:00
   * @param strDateEnd 结束时间 00:05:00
   * @return
   */
  public static boolean isInDate(String strDateBegin, String strDateEnd) {
    try {
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
      String nowDate = sdf2.format(date);
      long beginTime = sdf.parse(nowDate + " " + strDateBegin).getTime();
      long endTime = sdf.parse(nowDate + " " + strDateEnd).getTime();
      if (beginTime <= date.getTime() && endTime >= date.getTime()) {
        return true;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public static String getCurrentYear() {
    Calendar now = Calendar.getInstance();
    return String.valueOf(now.get(Calendar.YEAR));
  }

  public static String getCurrentDay() {
    Calendar now = Calendar.getInstance();
    return String.valueOf(now.get(Calendar.DAY_OF_MONTH));
  }

  public static String getCurrentMonth() {
    Calendar now = Calendar.getInstance();
    return String.valueOf(now.get(Calendar.MONTH) + 1);
  }

}
