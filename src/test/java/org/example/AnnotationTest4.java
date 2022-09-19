package org.example;

import org.testng.annotations.*;

public class AnnotationTest4 {

    @BeforeSuite
    public void beforeSuite1()
    {
        System.out.println("This is AnnotaionTest4/beforeSuite4");
    }

    @BeforeClass
    public void beforeClass2()
    {
        System.out.println("This is AnnotaionTest4/beforeClass4");
    }

    @BeforeTest
    public void beforeTest3()
    {
        System.out.println("This is AnnotaionTest4/beforeTest4");
    }

    @BeforeMethod
    public void beforeMethod2()
    {
        System.out.println("This is AnnotaionTest4/beforeMethod4");
    }
    @Test
    public void test1()
    {
        System.out.println("This is AnnotaionTest4/test1");
    }

    @AfterMethod
    public void afterMethod2()
    {
        System.out.println("This is AnnotaionTest4/afterMethod4");
    }

    @AfterClass
    public void afterClass2()
    {
        System.out.println("This is AnnotaionTest4/afterClass4");
    }

    @AfterTest
    public void afterTest3()
    {
        System.out.println("This is AnnotaionTest4/AfterTest4");
    }

    @AfterSuite
    public void afterSuite1()
    {
        System.out.println("This is AnnotaionTest4/afterSuite4");
    }
}
