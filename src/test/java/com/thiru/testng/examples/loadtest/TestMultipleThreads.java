package com.thiru.testng.examples.loadtest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultipleThreads {

	@Test(invocationCount = 1)
	public void repeatThis() {

	}

	@Test(invocationCount = 4, threadPoolSize = 2)
	public void testThreadPools() {

		System.out.printf("%n testThreadPools:Thread Id : %s%n", Thread.currentThread().getId());
		
	}

	@Test(invocationCount = 2, threadPoolSize = 2)
	public void loadTest() {

		System.out.printf("%n loadTest:[START] Thread Id : %s is started!", Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.printf("%n loadTest:[END] Thread Id : %s", Thread.currentThread().getId());

		//Thread.sleep(5000);
		driver.quit();

	}

/*	@Test(invocationCount = 3)
	public void loadTestThisWebsite() throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\txc68\\programs\\gecko\\geckodriver.exe"); //need this if using 3.x selenium

		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//Thread.sleep(5000);
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();

	}*/

/*	@Test(invocationCount = 1, threadPoolSize = 1)
	public void loadTestThisWebsite3() throws Exception {

		System.out.printf("[START] Thread Id : %s%n", Thread.currentThread().getId());

		String url = "http://www.google.com";
        //System.setProperty("http.proxyHost", "172.22.240.68");
        //System.setProperty("http.proxyPort", "18717");
		//HttpClient client = HttpClientBuilder.create().build();
        HttpClient client = HttpClients.createDefault();
		HttpGet request = new HttpGet(url);
		request.addHeader("User-Agent", "Mozilla/5.0");
		HttpResponse response = client.execute(request);

		System.out.printf("[END] Thread Id : %s, Response Code : %s%n", Thread.currentThread().getId(), response
				.getStatusLine().getStatusCode());

	}*/

}