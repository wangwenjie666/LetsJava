package org.vijay.methods;

/**
 * startWith.
 *
 * @author ViJay
 * @date 2020-12-24
 */
public class StringStartWithDemo {
    public static void main(String[] args) {
        //>> TODO startsWith(String prefix)
        System.out.println("abc".startsWith("ab"));//true

        //>> TODO startsWith(String prefix, int toffset)
        System.out.println("abc".startsWith("b", 1));//true
    }
}
