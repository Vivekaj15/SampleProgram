package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.facebook.com");
	    
	    driver.manage().window().maximize();
	    
	    String c = driver.getCurrentUrl();
	    System.out.println(c);
	    
	    String t = driver.getTitle();
	    System.out.println(t);
	    Thread.sleep(500);
        WebElement user =  driver.findElement(By.id("email"));
        user.sendKeys("viveka");
        Thread.sleep(3000);
	    WebElement pass = driver.findElement(By.id("pass"));
	    pass.sendKeys("shankar");
	    Thread.sleep(3000);
	    WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
	    create.click();
	    Thread.sleep(3000);
	    WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	    firstname.click();
	    firstname.sendKeys("viveka");
	    WebElement secondname = driver.findElement(By.name("lastname"));
	    secondname.sendKeys("shankar");
	    WebElement email = driver.findElement(By.name("reg_email__"));
	    email.sendKeys("anushankar1526@gmail.com");
	    WebElement password = driver.findElement(By.id("password_step_input"));
	    password.sendKeys("172930");
	    WebElement date = driver.findElement(By.id("day"));
	    date.sendKeys("15");
	    WebElement month = driver.findElement(By.id("month"));
	    month.sendKeys("Sep");
	    WebElement year = driver.findElement(By.id("year"));
	    year.sendKeys("1996");
	    WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
	    gender.click();
	    WebElement signup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
	    signup.click();	    
	    driver.close();
	    
	    
	    
	    

	}

}
