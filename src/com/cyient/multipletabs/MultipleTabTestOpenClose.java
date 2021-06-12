package com.cyient.multipletabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabTestOpenClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.id("Email_Id")).sendKeys("neha@gmail.com");
		driver.findElement(By.id("mobile_number")).sendKeys("7423337899");
		driver.findElement(By.id("FirstName")).sendKeys("Neha Priya");
		String tab1 = driver.getWindowHandle();
		System.out.println(tab1);
		System.out.println("-------------");
		//set<String> = 
		

	}

}
