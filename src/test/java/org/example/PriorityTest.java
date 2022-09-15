package org.example;


import org.testng.annotations.Test;

public class PriorityTest
{

    @Test(priority = 3)
    public void addTwoNumbers()
    {
        System.out.print("Add:");
        System.out.println(2+2);
    }

    @Test (priority = -2)
    public void multiplyTwoNumbers()
    {
        System.out.print("Multiply:");
        System.out.println(6*4);
    }

    @Test(priority = 1)
    public void devideTwoNumbers()
    {
        System.out.print("devide:");
        System.out.println(10/2);
    }
}
