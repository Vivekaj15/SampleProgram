package org.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
      public static void main(String[] args) throws InterruptedException {
    	  System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
    	  WebDriver driver = new ChromeDriver();
    	  
    	  driver.get("https://www.flipkart.com/");
    	  driver.manage().window().maximize();
	      driver.findElement(By.xpath("//button[text()='✕']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	      Thread.sleep(3000);
	      WebElement search= driver.findElement(By.xpath("//input[@name='q']"));
	      search.sendKeys("mobiles");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//div[text()='POCO C31 (Royal Blue, 64 GB)']")).click();
	      Thread.sleep(3000);
	      
	      String pWin= driver.getWindowHandle();
	      Set<String> allWin= driver.getWindowHandles();
	      for (String x : allWin) {
			if(!x.equals(pWin)) {
				driver.switchTo().window(x);
			}
		}
	      WebElement buynow= driver.findElement(By.xpath("//button[text()='BUY NOW']"));
	      String y= buynow.getText();
	      System.out.println(y);
	      List<String> x= new ArrayList<>();
	      x.addAll(allWin);
	      String e=x.get(0);
	      driver.switchTo().window(e);
	      String text= driver.findElement(By.xpath("(//div[text()='realme 9i (Prism Blue, 128 GB)'])[1]")).getText();
	      System.out.println(text);
//	                              (OR)
//          Set<String> allWin= driver.getWindowHandles();
//	      List<String> x= new ArrayList<>();
//	      x.addAll(allWin);
//	      String e=x.get(1);
//	      driver.switchTo().window(e);
//	      WebElement buynow= driver.findElement(By.xpath("//button[text()='BUY NOW']"));
//	      String y= buynow.getText();
//	      System.out.println(y);
	      
	      
	      
}
}
