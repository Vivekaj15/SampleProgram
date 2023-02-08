package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement table= driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		List<WebElement> trows= table.findElements(By.tagName("tr"));
//		for(int i=0;i<trows.size();i++) {
		WebElement row= trows.get(6);
		String text= row.getText();
		System.out.println(text);
		
		
		List<WebElement> tdatas= table.findElements(By.tagName("td"));
//		for(int j=0;j<tdatas.size();j++) {
		WebElement data= tdatas.get(6);
		String text1= data.getText();
		System.out.println(text1);
		
		
	}
		
	}
//}
//}