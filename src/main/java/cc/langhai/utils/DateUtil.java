package cc.langhai.utils;

import cn.hutool.core.util.StrUtil;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 时间工具类
 *
 * @author langhai
 * @date 2022-11-22 21:59
 */
public class DateUtil {

    /**
     * 获取当天日期 yyyy-MM-dd
     *
     * @return
     */
    public static String getNowDay(){
        String format = cn.hutool.core.date.DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss");
        String[] split = format.split(" ");
        return split[0];
    }

    /**
     * 获取当天日期 yyyy-MM-dd 开始结束时间
     *  nowDay + " 00:00:00"
     *  nowDay + " 24:00:00"
     *
     * @return
     */
    public static String[] getNowDayScope(){
        String format = cn.hutool.core.date.DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss");
        String date = format.split(" ")[0];
        String[] strings = new String[2];
        strings[0] = date + " 00:00:00";
        strings[1] = date + " 24:00:00";
        return strings;
    }
}
