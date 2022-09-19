package org.example;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

    @Test(expectedExceptions = {ArithmeticException.class})
    public void devideNumber()
    {
        int num=5/0;
        System.out.println(num);
    }

}
