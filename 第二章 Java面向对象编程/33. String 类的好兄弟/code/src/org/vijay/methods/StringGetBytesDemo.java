package org.vijay.methods;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * getBytes.
 *
 * @author ViJay
 * @date 2020-12-23
 */
public class StringGetBytesDemo {
    public static void main(String[] args) {
        //>> TODO getBytes()
        byte[] bytes = "abc".getBytes();
        System.out.println(Arrays.toString(bytes));//[97, 98, 99]

        //>> TODO getBytes(Charset charset)
        //>> TODO getBytes(String charsetName)
        byte[] bytes1 = "abc".getBytes(Charset.defaultCharset());
        System.out.println(Arrays.toString(bytes1));//[97, 98, 99]
    }
}
