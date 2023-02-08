package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
       public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.xpath("//input[@id='philadelphia-field-email']"));
		email.sendKeys("viveka@gmail.com");
		Thread.sleep(3000);
		
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		Thread.sleep(3000);
		
		String pWin= driver.getWindowHandle();
	      Set<String> allWin= driver.getWindowHandles();
	      for (String x : allWin) {
			if(!x.equals(pWin)) {
				driver.switchTo().window(x);
			}
		}
	    String text= driver.findElement(By.xpath("//h2[text()='📝 Project Summary']")).getText();
	    System.out.println(text);
//	    Thread.sleep(3000);
	    
	    List<String> x= new ArrayList<>();
	      x.addAll(allWin);
	      String e=x.get(0);
	      driver.switchTo().window(e);
//	    Thread.sleep(3000);  
	      
	    TakesScreenshot tk = (TakesScreenshot)driver;
	    File Source = tk.getScreenshotAs(OutputType.FILE);
	    File target = new File(".//target//viv.png");
	    FileUtils.copyFile(Source, target);
	}
}
