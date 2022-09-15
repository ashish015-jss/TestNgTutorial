package org.example;

import org.testng.annotations.Test;

public class EnabledTest {

    @Test(enabled = false)
    public void addTwoNumbers()
    {
        System.out.print("Add:");
        System.out.println(2+2);
    }

    @Test (enabled = true)
    public void multiplyTwoNumbers()
    {
        System.out.print("Multiply:");
        System.out.println(6*4);
    }

    @Test(enabled = true)
    public void devideTwoNumbers()
    {
        System.out.print("devide:");
        System.out.println(10/2);
    }
}
