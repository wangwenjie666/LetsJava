package org.vijay.methods;

import java.util.Arrays;
import java.util.List;

/**
 * join.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringJoinDemo {
    public static void main(String[] args) {
        //>> TODO join(CharSequence delimiter, CharSequence... elements)
        String joinString = String.join(",", "a", "b", "c");
        System.out.println(joinString);//a,b,c

        //>> TODO join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
        List<String> list = Arrays.asList("a", "b", "c");
        String joinString2 = String.join(",", list);
        System.out.println(joinString2);//
    }
}
