package com.cyient.alerthandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleAlert {

	public static void main(String[] args) {
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
		  
		  driver.findElement(By.xpath("//div[text()='Patient/Client']")).click();
		  driver.findElement(By.xpath("//div[text()='Patients']")).click();
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='fin']")));
		  //driver.switchTo().frame(driver.findElement(By.id("exp_cont_icon")));
		 //driver.switchTo().frame(driver.findElement(By.name("fin")));
		 driver.findElement(By.id("create_patient_btn1")).click();
		 // driver.findElement(By.id("create_patient_btn1")).click();

	}

}
