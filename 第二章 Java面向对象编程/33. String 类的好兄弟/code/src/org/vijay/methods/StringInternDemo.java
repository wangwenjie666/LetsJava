package org.vijay.methods;

/**
 * intern.
 *
 * @author ViJay
 */
public class StringInternDemo {
    public static void main(String[] args) {

        //>> TODO intern()
        String str = new String("str") + new String("01");
        str.intern();// jdk7后 执行 intern 会将str在堆内存的地址存到常量池中
        String str2 = "str" + "01"; // 再次获取该字符串，会获取到常量池中的地址 ，因此为true
        System.out.println(str == str2);//true


        String str3 = new String("str") + new String("01");
        String str4 = "str" + "01";
        str3.intern();//常量池中存储了堆内存的地址，但是str4已经获取了常量池中的常量字符串引用地址，两者不同
        System.out.println(str3 == str4);//false
    }
}
