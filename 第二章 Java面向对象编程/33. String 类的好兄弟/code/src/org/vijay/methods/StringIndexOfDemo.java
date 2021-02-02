package org.vijay.methods;

/**
 * indexOf.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringIndexOfDemo {
    public static void main(String[] args) {
        //>> TODO indexOf(int ch) ch为codepoint的值
        //>> TODO indexOf(int ch, int fromIndex)
        int i = "abcc".indexOf(97);
        System.out.println(i);//0

        //>> TODO indexOf(String str)
        //返回字符串第一次出现的位置
        int index = "abcc".indexOf("c");
        System.out.println(index);//2

        //>> TODO indexOf(String str, int fromIndex) 指定索引位置开始搜索
        int index2 = "abcc".indexOf("c", "abcc".indexOf("c") + 1);
        System.out.println(index2);//3


    }
}
