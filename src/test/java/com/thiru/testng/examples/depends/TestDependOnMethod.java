package com.thiru.testng.examples.depends;
import org.testng.annotations.Test;

/**
 * Created by thiru on 4/26/17.
 */
public class TestDependOnMethod {
    @Test
    public void method1() {
        System.out.println("This is method 1");
        throw new RuntimeException();

    }

    @Test(dependsOnMethods = { "method1" })
    public void method2() {
        System.out.println("This is method 2");
    }
}
