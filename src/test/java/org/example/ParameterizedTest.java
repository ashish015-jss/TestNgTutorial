package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

    @Parameters("URL")
    @Test
    public void parameterTest(String browser1) {
        System.out.println("Parameterized value is : " + browser1);
    }
}
