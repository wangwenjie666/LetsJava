package org.vijay.methods;

import java.util.Date;

/**
 * Format methods(String格式化方法).
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringFormatDemo {
    public static void main(String[] args) {
        String str = "format string";
        //format(String format, Object...args)
        /**
         * 格式化类型：
         * %s 字符串
         * %d 十进制数字
         * %c 字符
         * %f 浮点数
         * %b boolean类型
         * %tx 日期格式
         */
        System.out.println(String.format("my %s is %s", "name", "张三"));//my name is 张三
        System.out.println(String.format("my %s is %d", "age", 20));//my age is 20

        /**
         * %tx 日期
         * x类型：
         *  F： 年-月-日
         *  D: 月/日/年
         *  T：HH:MM:SS （24）
         *  r：HH:MM:SS PM（12）
         */
        Date date = new Date();
        System.out.println(String.format("年-月-日格式 %tF", date));//年-月-日格式 2020-12-23
        System.out.println(String.format("当前时间 %tF %tr", date, date));//当前时间 2020-12-23 03:49:59 下午
    }
}
