package com.cyient.medibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MedibuddyLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://www.medibuddy.in/");
       driver.findElement(By.linkText("Signup")).click();
       driver.findElement(By.name("firstName")).sendKeys("Neha");
       driver.findElement(By.name("phone")).sendKeys("7411666943");
       driver.findElement(By.name("username")).sendKeys("nehapriya.ei@gmail.com");
       driver.findElement(By.name("password")).sendKeys("123abc");
       driver.findElement(By.xpath("//span[text()='Are you a corporate user?']")).click();
       driver.findElement(By.name("employeeId")).sendKeys("np1");
       // Drop Down
       
        Select year = new Select(driver.findElement(By.xpath("//select[@ng-model='date.year']")));
	    year.selectByVisibleText("2000");
	    
	    Select month = new Select(driver.findElement(By.xpath("//select[@ng-model='date.month']")));
	    month.selectByVisibleText("06");
	    
	    Select day = new Select(driver.findElement(By.xpath("//select[@ng-model='date.day']")));
	    day.selectByVisibleText("06");
	    
	    driver.findElement(By.xpath("//span[@class='option radio m-t-0 m-b-0'])[2]")).click();
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
}
