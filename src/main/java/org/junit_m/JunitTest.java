package org.junit_m;

import org.junit.*;
/**
 *
 *
 * Before、After在执行每个测试方法执行前都会执行一遍
 * BeforeClass、AfterClass,必须修饰类方法(static)，在每个测试方法执行前后都会执行一遍，会比Before、After更早和更晚，一般用于资源额初始化和释放
 * */
public class JunitTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass...");
    }

    @Before
    public void before(){
        System.out.println("before...");
    }

    @Test
    public void show(){
        System.out.println("Hello Junit!");
    }
    @Test
    public void show2(){
        System.out.println("hello...");
    }
    @After
    public void after(){
        System.out.println("after");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass...");
    }
}
