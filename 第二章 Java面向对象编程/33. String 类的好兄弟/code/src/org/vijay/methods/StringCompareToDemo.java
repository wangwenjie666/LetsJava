package org.vijay.methods;

/**
 * CompareTo.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringCompareToDemo {
    public static void main(String[] args) {
        //>> TODO compareTo(String anotherString)
        int result = "abc".compareTo("abe");
        System.out.println(result);//-2 (c-e)

        int result1 = "abd".compareTo("abc");
        System.out.println(result1);//1

        int result2 = "abc".compareTo("abc");
        System.out.println(result2);//0
    }
}
