package com.cwp.基础部分;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * 与时间相关的类：
 * 1.System 类下的currentTimeMillis();
 * 2.Date类:java.util.Date
 * 如何创建其实例；其下的方法：toString()、getTime()
 * (以及其子类java.sql.Date)
 * 3.SimpleDateFormat类
 * 4.Calendar类
 */
public class 时间相关的类 {
    /**
     * java.text.SimpleDateFormat类易于国际化
     * 格式化：日期--->文本 使用SimpleDateFormat的format()方法
     * 解析：文本--->日期 使用SimpleDateFormat的parse()方法
     */
    @Test
    public void test2() throws ParseException {
        //格式化1
        SimpleDateFormat sdf = new SimpleDateFormat();
        String str1 = sdf.format(new Date());
        System.out.println(str1);//17-11-23 上午12:10
        //格式化2
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        String str2 = sdf1.format(new Date());
        System.out.println(str2);//星期四, 23 十一月 2017 00:30:22 +0800
        //解析
        Date date1 = sdf.parse("17-11-23 上午12:10");
        System.out.println(date1);//Thu Nov 23 00:10:00 CST 2017

        date1 = sdf1.parse("星期四, 23 十一月 2017 00:30:22 +0800");
        System.out.println(date1);//Thu Nov 23 00:30:22 CST 2017
    }

    @Test
    public void test1() {
        System.out.println(new Date().toString());
        System.out.println(new java.sql.Date(12345678952l));//1970-05-24

        Date d = new Date();
        long l = d.getTime();
        System.out.println(l);//1511366408106
        System.out.println(d);//當前時間
        Date d1 = new Date(1511366408106L);
        System.out.println(d1);
    }

}
