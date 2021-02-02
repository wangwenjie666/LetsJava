package org.vijay.methods;

import java.util.Arrays;

/**
 * split.
 *
 * @author ViJay
 * @date 2020-12-24
 */
public class StringSplitDemo {
    public static void main(String[] args) {
        //>> TODO split(String regex)
        String[] split1 = "a,b,c".split(",");
        System.out.println(Arrays.toString(split1));//[a, b, c]

        //>> TODO split(String regex, int limit)
        //>> TODO limit = 0 和默认split一样 ，limit <0 不去最后一个空字符，limit>0 匹配 n-1次
        String[] split2 = "a?b?c".split("\\?", -1);
        String[] split3 = "a?b?c?".split("\\?", -1);
        String[] split4 = "a?b?c?".split("\\?", 0);
        String[] split5 = "a?b?c?".split("\\?", 2);
        System.out.println(Arrays.toString(split2));//[a, b, c]
        System.out.println(Arrays.toString(split3));//[a, b, c, ]
        System.out.println(Arrays.toString(split4));//[a, b, c]
        System.out.println(Arrays.toString(split5));//[a, b?c?]
    }
}
