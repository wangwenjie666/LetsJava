package org.vijay.methods;

/**
 * replace.
 *
 * @author ViJay
 * @date 2020-12-24
 */
public class StringReplaceDemo {
    public static void main(String[] args) {
        //>> TODO replace(char oldChar, char newChar)
        //>> TODO 替换所有字符
        String replaceByChar = "aaa".replace('a', 'b');
        System.out.println(String.format("replaceByChar is %s", replaceByChar));//replaceByChar is bbb

        //>> TODO replace(CharSequence target, CharSequence replacement)
        //>> TODO 指定序列替换匹配的目标序列
        String replaceCharSequence = "aabbcc".replace("a", "f");
        System.out.println(String.format("replaceCharSequence is %s", replaceCharSequence));//replaceCharSequence is ffbbcc

        //>> TODO replaceAll(String regex, String replacement)
        String replaceAll = "a,b,c".replaceAll(",", "");
        System.out.println(String.format("replaceAll is %s", replaceAll));//replaceAll is abc

        //>> TODO replaceFirst(String regex, String replacement)
        String replaceFirst = "a,b,c".replaceFirst(",", "");
        System.out.println(String.format("replaceFirst is %s", replaceFirst));//replaceFirst is ab,c
    }
}
