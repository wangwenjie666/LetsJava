package org.vijay.methods;

/**
 * matches.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringMatchesDemo {
    public static void main(String[] args) {
        //>> TODO matches(String regex)
        String str = "abc";
        boolean matches = str.matches("[a-z]+");
        System.out.println(matches);//true
    }
}
