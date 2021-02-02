package org.vijay.methods;

/**
 * codePointAt 获取unicode代码点.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringCodePointAtDemo {
    public static void main(String[] args) {
        //>> TODO codePointAt(int index)
        String str = "abc";
        int codePointAt = str.codePointAt(0);
        System.out.println(codePointAt);//97
    }
}
