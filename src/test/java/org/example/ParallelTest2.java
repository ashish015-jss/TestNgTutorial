package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {



    @Test
    public void test1()
    {
        System.out.println("This is ParallelTest2/test1");
    }

    @Test
    public void test2()
    {
        System.out.println("This is ParallelTest2/test2");
    }

    @Test
    public void test3()
    {
        System.out.println("This is ParallelTest2/test3");
    }

    @Test
    public void test4()
    {
        System.out.println("This is ParallelTest2/test4");
    }

    @Test
    public void test5()
    {
        System.out.println("This is ParallelTest2/test5");
    }
}
