package org.example;

import org.testng.annotations.Test;

public class InnvocationCountTest {

    @Test(invocationCount = 1)
    public void addTwoNumbers()
    {
        System.out.print("Add:");
        System.out.println(2+2);
    }

    @Test(description = "Adding two numbers..")
    public void addTwoNumbers1()
    {
        System.out.print("Add:");
        System.out.println(2+2);
    }

}
