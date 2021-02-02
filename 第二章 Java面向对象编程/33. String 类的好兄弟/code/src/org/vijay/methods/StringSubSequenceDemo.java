package org.vijay.methods;

/**
 * subSequence.
 *
 * @author ViJay
 * @date 2020-12-24
 */
public class StringSubSequenceDemo {
    public static void main(String[] args) {
        //>> TODO subSequence(int beginIndex, int endIndex)
        CharSequence charSequence = "abcdef".subSequence(1, 3);
        //>> TODO 等价于 return this.substring(beginIndex, endIndex);
        System.out.println(charSequence);//bc
    }
}
