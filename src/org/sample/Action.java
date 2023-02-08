package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//	    driver.get("https://www.facebook.com");
		
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    driver.manage().window().maximize();
	    Actions a= new Actions(driver);
	   WebElement s = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	   Thread.sleep(3000);
	   WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	   a.dragAndDrop(s, d).build().perform();
	   Thread.sleep(3000);
	   WebElement s1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	   Thread.sleep(3000);
	   WebElement d1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	   a.dragAndDrop(s1, d1).build().perform();
	   Thread.sleep(3000);
	   WebElement s2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	   Thread.sleep(3000);
	   WebElement d2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	   a.dragAndDrop(s2, d2).build().perform();
	   WebElement s3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	   Thread.sleep(3000);
	   WebElement d3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	   a.dragAndDrop(s3, d3).build().perform();
	   driver.close();
	   
	}
}
