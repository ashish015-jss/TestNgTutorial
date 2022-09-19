package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest1{


    @BeforeMethod
    public void beforeMethod1()
    {
        System.out.println("This is AnnotaionTest1/beforeMethod1");
    }

    @Test
    public void test1()
    {
        System.out.println("This is AnnotaionTest1/test1");
    }

    @Test
    public void test2()
    {
        System.out.println("This is AnnotaionTest1/test2");
    }

    @Test
    public void test3()
    {
        System.out.println("This is AnnotaionTest1/test3");
    }

    @AfterMethod
    public void afterMethod1()
    {
        System.out.println("This is AnnotaionTest1/afterMethod1");
    }
}
