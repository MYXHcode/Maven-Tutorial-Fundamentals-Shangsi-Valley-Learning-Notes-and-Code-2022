package com.myxh.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

/*
测试方式：
通过 import 语句将要测试的类引入当前类，引入后：
编译通过：可以使用，这个范围的依赖对当前类有效
编译失败：不能使用，这个范围的依赖对当前类无效
 */

// 具体测试代码如下：
// 有效
import com.myxh.maven.Calculator;

// 无效
// import org.junit.Test;

/**
 * @author MYXH
 * @date 2023/8/6
 */
/*
main 目录下的 Java 类：HelloServlet
compile 范围引入的依赖：pro01-maven-java
pro01-maven-java 中的类：Calculator
test 范围引入的依赖：junit
junit 中可以使用的注解：@Test
 */
public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.getWriter().write("Hello Maven Web!");
    }
}