package com.wikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.remote.Browser;

public class wikipedia extends Browser {
	
	public static void getUrl() {
		driver.get("https://www.wikipedia.org/");
	}
	
	public static void data() {
		WebElement searchData=driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/div/input"));
		searchData.sendKeys("Historical Places in the Wheel of Time");
	    driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/button/i")).click();
	}
	
	public static void scroll() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,5000)");
	    Thread.sleep(2000);
	    js.executeScript("window.scroll(0,10000)");
	    Thread.sleep(1000);
	}
	
	public static void external_links() {
		driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/ul[2]/li[2]/a")).click();
	   driver.findElement(By.xpath("/html/body/div[4]/div/div/form/div[3]/div[1]/div/div/div[1]/a[1]/img")).click();
	}
	
	public static void TextField_data() {
		WebElement email=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/form/div[3]/input[1]"));
	    email.sendKeys("chaudharitejal46@gmail.com");
	    
	    WebElement Name=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/form/div[3]/input[2]"));
	    Name.sendKeys("Tejal Chandrakant Chaudhari");
	    
	    WebElement Email2=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/form/div[3]/input[3]"));
	    Email2.sendKeys("tejalchaudhari4601@gmai.com");
	    
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/form/div[3]/input[4]")).click();
	}
	

	public static void close() 
	{
		driver.close();
		
	}

}
