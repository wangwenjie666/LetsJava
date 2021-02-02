package org.vijay.methods;

/**
 * CompareToIgnoreCase.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringCompareToIgnoreCaseDemo {
    public static void main(String[] args) {
        //>> TODO compareToIgnoreCase(String str)
        //忽略大小写比较
        int index = "ABC".compareToIgnoreCase("abd");
        System.out.println(index);//-1
    }
}
