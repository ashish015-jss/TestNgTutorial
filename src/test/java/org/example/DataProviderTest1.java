package org.example;

import org.testng.annotations.Test;

public class DataProviderTest1 {

    @Test(dataProvider = "student", dataProviderClass = DataProviderTest.class)
    public void myTest (Object val) {
        System.out.println("Current Status : " + val);
    }
}
