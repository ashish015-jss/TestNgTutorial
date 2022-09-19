package org.example;

import org.testng.annotations.*;

public class AnnotationTest3 {

    @BeforeClass
    public void beforeClass2()
    {
        System.out.println("This is AnnotaionTest3/beforeClass3");
    }

    @BeforeTest
    public void beforeTest3()
    {
        System.out.println("This is AnnotaionTest3/beforeTest3");
    }

    @BeforeMethod
    public void beforeMethod2()
    {
        System.out.println("This is AnnotaionTest3/beforeMethod3");
    }
    @Test
    public void test1()
    {
        System.out.println("This is AnnotaionTest3/test1");
    }

    @AfterMethod
    public void afterMethod2()
    {
        System.out.println("This is AnnotaionTest3/afterMethod3");
    }

    @AfterClass
    public void afterClass2()
    {
        System.out.println("This is AnnotaionTest3/afterClass3");
    }

    @AfterTest
    public void afterTest3()
    {
        System.out.println("This is AnnotaionTest3/AfterTest3");
    }
}
