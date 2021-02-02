package org.vijay.methods;

/**
 * trim.
 *
 * @author ViJay
 * @date 2020-12-24
 */
public class StringTrimDemo {
    public static void main(String[] args) {
        //>> TODO trim() 去首尾空格
        String targetStr = "  abc ";
        String trimStr = targetStr.trim();
        System.out.println(String.format("targetStr is %s, length = %d", targetStr, targetStr.length()));
        System.out.println(String.format("trimStr   is %s, length = %d", trimStr, trimStr.length()));
        //targetStr is   abc , length = 6
        //trimStr   is abc, length = 3
    }
}
