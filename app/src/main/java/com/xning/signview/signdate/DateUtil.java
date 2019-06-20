package com.xning.signview.signdate;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class DateUtil {


    private static final String TAG = "DateUtil";

    public static String getDate(Date source,String style) {
        SimpleDateFormat mdhm = new SimpleDateFormat(style,Locale.getDefault());//年 月 日
        return mdhm.format(source);
    }


    public static Date getDate(int y,int m,int d) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(y,m-1,d); //月减一
        return calendar.getTime();
    }

    public static String getDate(Date source) {
        SimpleDateFormat mdhm = new SimpleDateFormat("YYYY-MM-dd",Locale.getDefault());//年 月 日
        return mdhm.format(source);
    }

    public static int getCurrentMonthLastDay(int year,int month) {
        Calendar a = Calendar.getInstance();
        a.set(year,month-1,1);//把日期设置为当月第一天 月减一
        a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    public static int getFirstDayOfMonth(int year,int month){
        Calendar a = Calendar.getInstance();
        a.set(year,month-1,1); //月要减一
        a.set(Calendar.DAY_OF_MONTH,1);//设为第一天
        int i = a.get(Calendar.DAY_OF_WEEK);
        return i;
    }

    public static int getToday(){
        Calendar a = Calendar.getInstance();
        int day = a.get(Calendar.DAY_OF_MONTH);
        return day;
    }

    public static int getCurrentMonth(){
        Calendar a = Calendar.getInstance();
        int month = a.get(Calendar.MONTH) + 1;
        return  month;
    }

    public static int getCurrentYear(){
        Calendar a = Calendar.getInstance();

        int year = a.get(Calendar.YEAR);
        return year;
    }

    // 字符串类型日期转化成date类型
    public static Date strToDate(String style, String date) {
        SimpleDateFormat formatter = new SimpleDateFormat(style,Locale.getDefault());
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }


    public static String clanderTodatetime(Calendar calendar, String style) {
        Date time = calendar.getTime();
        return getDate(time,style);
    }


    public static List<Boolean> dateConvert(int year, int month, List<Date> source, List<Boolean> record, int dif) {
        SimpleDateFormat yy = new SimpleDateFormat("YYYY",Locale.getDefault());//年
        SimpleDateFormat mm = new SimpleDateFormat("MM",Locale.getDefault());//月
        SimpleDateFormat dd = new SimpleDateFormat("dd",Locale.getDefault());//月
        for (Date aSource : source) {
            int y = Integer.parseInt(yy.format(aSource));
            if (year == y) {//年相同
                int m = Integer.parseInt(mm.format(aSource));
                if (month==m){//月相同
                    int d = Integer.parseInt(dd.format(aSource));
                    record.set(d + dif, true);
                    Log.i(TAG, "设置签到: " + d);
                }
            }
        }
        return record;
    }

}
