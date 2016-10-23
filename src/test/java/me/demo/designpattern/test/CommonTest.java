package me.demo.designpattern.test;

import org.junit.Test;

/**
 * Created by Think on 2016/8/16.
 */
public class CommonTest {

    @Test
    public void test_bit_operator() {
        System.out.println(10 >> 1);
        System.out.println(10 << 1);
        System.out.println(10 >>> 1);
    }

    @Test
    public void test_contains() {
        boolean isMultipartContent = isMultipartContent("multipart/form-data;boundary=6dd27e91-e210-476b-bea9-dd3004e1e486");
        System.out.println(isMultipartContent);
    }

    public boolean isMultipartContent(String contentType) {
        return contentType != null &&contentType.contains("multipart/form-data; ");
    }


}
