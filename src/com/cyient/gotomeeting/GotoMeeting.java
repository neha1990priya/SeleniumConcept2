package com.cyient.gotomeeting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GotoMeeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("https://www.gotomeeting.com/en-in");
      driver.findElement(By.id("truste-consent-button")).click();
      driver.findElement(By.linkText("Start for Free")).click();
      driver.findElement(By.id("first-name")).sendKeys("Neha");
      driver.findElement(By.id("last-name")).sendKeys("Priya");
      driver.findElement(By.id("login__email")).sendKeys("neha@gmail.com");
      driver.findElement(By.id("contact-number")).sendKeys("7411");
      driver.findElement(By.id("JobTitle")).sendKeys("Softwere");
      Select selectjob=new Select(driver.findElement(By.id("JobTitle")));
      selectjob.selectByVisibleText("Help Desk");
      driver.findElement(By.id("login__password")).sendKeys("Neha111111"); 
      driver.findElement(By.xpath("(//div[@class='form-fields__radio'])[2]")).click();
      driver.findElement(By.xpath("//button[@data-button='trial-submit']")).click();
      driver.findElement(By.linkText("Sign Up")).click();
	}
}
