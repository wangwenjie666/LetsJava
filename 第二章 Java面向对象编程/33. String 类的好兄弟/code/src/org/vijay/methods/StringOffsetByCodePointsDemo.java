package org.vijay.methods;

/**
 * offsetByCodePoints.
 *
 * @author ViJay
 * @date 2020-12-24
 */
public class StringOffsetByCodePointsDemo {
    public static void main(String[] args) {
        //>> TODO offsetByCodePoints(int index, int codePointOffset)
        String str = "abz";
        int i = str.offsetByCodePoints(0, 2);
        System.out.println(i);//2 = 0+2
    }
}
