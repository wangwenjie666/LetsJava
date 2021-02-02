package org.vijay.methods;

/**
 * Concat.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringConcatDemo {
    public static void main(String[] args) {
        //>> TODO concat(String str)
        //>> TODO 底层使用Array.copyOf
        String str = "abc".concat("def");
        System.out.println(str);//abcdef
    }
}
