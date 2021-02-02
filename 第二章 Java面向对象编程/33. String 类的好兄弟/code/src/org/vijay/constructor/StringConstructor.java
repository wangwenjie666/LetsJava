package org.vijay.constructor;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * String构造方法.
 *  构造String的方法：
 *      1.通过byte数组
 *      2.通过char数组
 *      3.unicode代码点数组
 *      4.直接传入字符串
 *      5.StringBuffer或者StringBuilder作为参数
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringConstructor {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //>> TODO String()  空字符序列
        String emptyString = new String();

        //>> TODO String(byte[])
        byte[] bytes = {65, 66, 67};
        String bytesString = new String(bytes);
        System.out.println(String.format("bytesString is %s", bytesString));//bytesString is ABC

        //>> TODO String(byte[],Charset)
        String bytesStringWithCharset = new String(bytes, Charset.defaultCharset());
        System.out.println(String.format("bytesStringWithCharset is %s", bytesStringWithCharset));//bytesStringWithCharset is ABC

        //>> TODO String(byte[],int offset,int length)
        //>> TODO String(byte[] bytes, int offset, int length, Charset charset)
        byte[] sourceBytes = {65, 66, 67, 97, 98, 99};
        String bytesSubString = new String(sourceBytes, 1, sourceBytes.length - 2);
        System.out.println(String.format("bytesSubString is %s", bytesSubString));//bytesSubString is BCab

        //>> TODO String(byte[] bytes, int offset, int length, String charsetName)
        //>> TODO String(byte[] bytes, String charsetName)
        byte[] bytesWithCharsetName = {65, 66, 67, 97, 98, 99};
        String stringWithCharsetName = new String(bytesWithCharsetName, "utf-8");
        System.out.println(String.format("stringWithCharsetName is %s", stringWithCharsetName));//stringWithCharsetName is ABCabc

        //>> TODO String(char[] value)
        char[] chars1 = {'张', '麻', '子'};
        String stringByCharArray1 = new String(chars1);
        System.out.println(String.format("stringByCharArray1 is %s", stringByCharArray1));//stringByCharArray1 is 张麻子

        //>> TODO String(char[] value, int offset, int count)
        char[] chars2 = {'张', '麻', '子'};
        String stringByCharArray2 = new String(chars1, 1, chars2.length - 1);
        System.out.println(String.format("stringByCharArray2 is %s", stringByCharArray2));//stringByCharArray2 is 麻子

        //>> TODO String(int[] codePoints, int offset, int count)
        String str = "张麻子";
        int[] codePoints = new int[3];
        for (int i = 0; i < str.length(); i++) {
            codePoints[i] = str.codePointAt(i);
            System.out.println(String.format("%c 的 unicode 代码点为 %d ", str.charAt(i), codePoints[i]));
            //张 的 unicode 代码点为 24352
            //麻 的 unicode 代码点为 40635
            //子 的 unicode 代码点为 23376
        }
        String codePointsString = new String(codePoints, 0, str.length());
        System.out.println(String.format("codePointsString is %s", codePointsString));//codePointsString is 张麻子

        //>> TODO String(String original)
        String originalString = new String("abcdefg");
        System.out.println(String.format("originalString is %s", originalString));//originalString is abcdefg

        //>> TODO String(StringBuffer buffer)
        String stringBufferString = new String(new StringBuffer("abc").append("def"));
        System.out.println(String.format("stringBufferString is %s", stringBufferString));//stringBufferString is abcdef

        //>> TODO String(StringBuilder builder)
        String stringBuilderString = new String(new StringBuilder("abc").append("def"));
        System.out.println(String.format("stringBuilderString is %s", stringBuilderString));//stringBuilderString is abcdef
    }


}
