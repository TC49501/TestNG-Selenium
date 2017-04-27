package com.thiru.testng.examples.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by thiru on 4/26/17.
 */
public class TestDataProvider {
    @DataProvider(name = "addMethodDataProvider")
    public Object[][] dataProvider() {
        return new Object[][] { { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 } };
    }

    @Test(dataProvider = "addMethodDataProvider")
    public void testAddMethod(int a, int b, int result) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(a, b), result);
    }

    class Calculator {

        public int add(int a, int b){
            return a+b;
        }

    }
}
