package org.vijay.base;

import java.lang.reflect.Method;

/**
 * String methods.
 *
 * @author ViJay
 */
public class StringMethods {
    public static void main(String[] args) {
        Method[] methods = String.class.getMethods();
        int len = 0;
        for (Method method : methods) {
            String name = method.getName();
            System.out.println("String 方法：" + name);
            len++;
        }
        System.out.println("共有方法：" + len);
    }
}
