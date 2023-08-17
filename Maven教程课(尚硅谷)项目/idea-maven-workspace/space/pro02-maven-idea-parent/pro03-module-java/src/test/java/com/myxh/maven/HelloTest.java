package com.myxh.maven;

import org.junit.Test;

/**
 * @author MYXH
 * @date 2023/8/8
 */
public class HelloTest
{
    @Test
    public void testHello()
    {
        Hello hello = new Hello();

        hello.showMessage();
    }
}
