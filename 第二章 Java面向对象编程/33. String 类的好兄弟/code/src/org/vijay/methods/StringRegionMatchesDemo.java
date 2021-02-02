package org.vijay.methods;

/**
 * regionMatches.
 *
 * @author ViJay
 * @date 2020-12-24
 */
public class StringRegionMatchesDemo {
    public static void main(String[] args) {
        //>> TODO regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        //>> TODO regionMatches(int toffset, String other, int ooffset, int len)
        boolean flag = "abc".regionMatches(true, 0, "abcdef", 0, 3);
        System.out.println(flag);//true
    }
}
