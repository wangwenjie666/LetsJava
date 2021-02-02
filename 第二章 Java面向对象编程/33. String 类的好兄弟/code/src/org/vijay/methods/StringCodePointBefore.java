package org.vijay.methods;

/**
 * CodePointBefore.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringCodePointBefore {
    public static void main(String[] args) {
        //>> TODO codePointBefore(int index)
        String str = "abc";
        int index = str.codePointAt(0);
        int beforeIndex = str.codePointBefore(1);
        System.out.println(String.format("index = %d, beforeIndex = %d", index, beforeIndex));//index = 97, beforeIndex = 97
    }
}
