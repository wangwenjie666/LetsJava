package org.vijay.methods;

/**
 * copyValueOf.
 *  底层实现都是new String(char[])
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringCopyValueOf {
    public static void main(String[] args) {
        //>> TODO copyValueOf(char[] data)  相当于 valueOf(char[]) 。
        char[] chars = {'张', '麻', '子'};
        String result = String.copyValueOf(chars);//new String(char[])
        String result2 = String.valueOf(chars);//new String(char[])
        System.out.println(result);//张麻子
        System.out.println(result2);//张麻子

        //>> TODO copyValueOf(char[] data, int offset, int count)
        String result3 = String.copyValueOf(chars, 1, 2);//new String(char[],int,int)
        System.out.println(result3);//麻子
    }
}
