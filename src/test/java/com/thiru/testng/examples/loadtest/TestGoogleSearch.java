package com.thiru.testng.examples.loadtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by thiru on 4/26/17.
 */
public class TestGoogleSearch {
    @Test
    public void testNoParameter() throws InterruptedException {
        String searchKey = "selenium";

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.google.com");
        WebElement searchText = driver.findElement(By.name("q"));
        //Searching text in google text box
        searchText.sendKeys(searchKey);
        searchText.sendKeys(Keys.ENTER);

        System.out.println("Thread will sleep now");

        Thread.sleep(5000);
        System.out.println("Search Box value = " + searchText.getAttribute("value") + " ::: Input Value = " + searchKey);
        //verifying the value in google search box
        Assert.assertEquals(searchText.getAttribute("value"), searchKey);
        driver.quit();

    }
}
