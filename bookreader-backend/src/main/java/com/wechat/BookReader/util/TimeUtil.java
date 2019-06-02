package com.wechat.BookReader.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    /**
     * 返回当前日期
     * @return
     */
    public static String getNowTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String nowTime = df.format(new Date());
        return nowTime;
    }
}
