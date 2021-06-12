package com.cyient.alertbox;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class OpenEmr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		  driver.findElement(By.id("authUser")).sendKeys("admin");
		  driver.findElement(By.id("clearpass")).sendKeys("pass");
		  // DROP DOWN
		  Select selectlanguage = new Select(driver.findElement(By.name("languageChoice")));
		  selectlanguage.selectByVisibleText("English (Indian)");
		  
		  // Login
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  System.out.println(driver.getTitle());
		  
		// Mouse Over
		  Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//span[text()='Smith']"))).perform();
		 driver.findElement(By.xpath("//li[text()='Logout']")).click();
}}


		