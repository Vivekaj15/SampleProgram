package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alert {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    WebElement scroll = driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']"));
	    js.executeScript("arguments[0].scrollIntoView(true)",scroll);
	    
	    WebElement simple = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
	    simple.click();
	    
	    org.openqa.selenium.Alert a= driver.switchTo().alert();
	    a.accept();
	   
	    WebElement confirm = driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
	    confirm.click();
	    
	    org.openqa.selenium.Alert a1= driver.switchTo().alert();
	    String text = a1.getText();
		   System.out.println(text);
		a.accept();
		   
	    WebElement prompt = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
	    prompt.click();
		    
		org.openqa.selenium.Alert alert2= driver.switchTo().alert();
			   alert2.sendKeys("viveka");
			   String text1 = alert2.getText();
			   System.out.println(text1);
			   alert2.accept();
			   driver.quit();
			   
			  
			   
			   
			   
			   
}
}
