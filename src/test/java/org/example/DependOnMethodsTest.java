package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethodsTest
{
    @Test
    public void addTwoNumbers()
    {
        System.out.print("Add:");
        System.out.println(2+2);
        Assert.assertTrue(false);
    }

    @Test (dependsOnMethods = {"addTwoNumbers"})
    public void multiplyTwoNumbers()
    {
        System.out.print("Multiply:");
        System.out.println(6*4);
    }

}
