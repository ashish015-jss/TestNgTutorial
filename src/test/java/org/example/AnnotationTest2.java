package org.example;

import org.testng.annotations.*;

public class AnnotationTest2 {



    @BeforeMethod
    public void beforeMethod2()
    {
        System.out.println("This is AnnotaionTest2/beforeMethod2");
    }
    @Test
    public void test1()
    {
        System.out.println("This is AnnotaionTest2/test1");
    }


    @Test
    public void test2()
    {
        System.out.println("This is AnnotaionTest2/test2");
    }

    @AfterClass
    public void afterClass2()
    {
        System.out.println("This is AnnotaionTest2/afterClass2");
    }


    @AfterMethod
    public void afterMethod2()
    {
        System.out.println("This is AnnotaionTest2/afterMethod2");
    }

    @BeforeClass
    public void beforeClass2()
    {
        System.out.println("This is AnnotaionTest2/beforeClass2");
    }

}
