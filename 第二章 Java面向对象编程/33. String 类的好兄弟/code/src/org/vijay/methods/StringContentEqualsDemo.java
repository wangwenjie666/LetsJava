package org.vijay.methods;

/**
 * contentEquals.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringContentEqualsDemo {
    public static void main(String[] args) {
        //>> TODO contentEquals(CharSequence cs)
        //字符串执行equals方法，其他字符序列判断每位字符是否相同
        boolean flag = "abcdef".contentEquals("abc");
        System.out.println(flag);//false

        boolean flag2 = "abc".contentEquals("abc");
        System.out.println(flag2);//true

        boolean flag3 = "abcd".contentEquals(new StringBuffer("abc"));
        System.out.println(flag3);//false
    }
}
