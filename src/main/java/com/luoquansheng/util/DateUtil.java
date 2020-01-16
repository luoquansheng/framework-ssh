package com.luoquansheng.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @project_name：framework-ssh
 * @classname：DateUtil
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/16 15:10
 */
public class DateUtil {

    public static Date parse(String content, String pattern) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.parse(content);

    }

    public static Date parse(Date content, String pattern) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String format = simpleDateFormat.format(content);
        return simpleDateFormat.parse(format);

    }

    public static String format(Date content, String pattern) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(content);

    }

    public static String format(String content, String pattern) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date parse = simpleDateFormat.parse(content);
        return simpleDateFormat.format(parse);

    }

}
