package org.vijay.methods;

import java.util.Arrays;

/**
 * getChars.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringGetCharsDemo {
    public static void main(String[] args) {
        //>> TODO getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        //将字符串的字符复制到目标字符数组
        String str = "abcd";
        char[] ch = new char[str.length()];
        str.getChars(0, str.length(), ch, 0);

        System.out.println(Arrays.toString(ch));//[a, b, c, d]
    }
}
