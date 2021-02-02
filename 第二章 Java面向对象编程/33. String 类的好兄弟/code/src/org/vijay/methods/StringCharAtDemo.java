package org.vijay.methods;

/**
 * charAt.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringCharAtDemo {
    public static void main(String[] args) {
        String str = "abcd";
        double random = Math.random();
        int index = (int) (random * str.length());

        //>> TODO charAt(int index)
        //返回指定索引的值
        char c = str.charAt(index);
        System.out.println(String.format("%s 索引位置为 %d 的值为 %c", str, index, c));//abcd 索引位置为 2 的值为 c
    }
}
