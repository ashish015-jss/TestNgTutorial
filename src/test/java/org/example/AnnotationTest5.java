package org.example;

import org.testng.annotations.*;

public class AnnotationTest5 {

    @BeforeGroups(groups ="smoke")
    public void before_it()
    {
        System.out.println("This is AnnotaionTest5/beforeGroups");
    }

    @BeforeMethod
    public void beforeMethod1()
    {
        System.out.println("This is AnnotaionTest5/beforeMethod1");
    }

    @Test(groups = {"smoke"})
    public void test1()
    {
        System.out.println("This is AnnotaionTest5/test1");
    }

    @Test(groups = {"smoke"})
    public void test2()
    {
        System.out.println("This is AnnotaionTest5/test2");
    }

    @Test(groups = {"smoke"})
    public void test3()
    {
        System.out.println("This is AnnotaionTest5/test3");
    }

    @AfterMethod
    public void afterMethod1()
    {
        System.out.println("This is AnnotaionTest5/afterMethod1");
    }

    @AfterGroups(groups ="regression")
    public void before_it1()
    {
        System.out.println("This is AnnotaionTest5/AfterGroups");
    }
}
