package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "student")
    public Object[][] dpMethod(){

        return new Object[][] { {1,2,3}, {"Amit",2,3}};
    }

    @Test(dataProvider = "student")
    public void myTest (Object val,int n,int m) {
        System.out.println("Passed Parameter Is : " + val);
    }

}
