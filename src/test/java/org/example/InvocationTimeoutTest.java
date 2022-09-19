package org.example;

import org.testng.annotations.Test;

public class InvocationTimeoutTest {
   static int i=0;
    @Test(invocationCount = 1005550,invocationTimeOut = 60)
    public void multiplyTwoNumbers()
    {
        System.out.print("Multiply:"+i++ +" :");
        System.out.println(6*4);
    }

    @Test(timeOut = 1)
    public void multiplyTwoNumbers1()
    {
        System.out.print("Multiply:"+i++ +" :");
        System.out.println(6*40000*5);
    }
}
