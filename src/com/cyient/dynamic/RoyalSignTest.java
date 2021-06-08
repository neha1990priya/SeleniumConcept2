package com.cyient.dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalSignTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.royalcaribbean.com/account/create");
		  driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Dennis");
		  driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Rich");
          driver.findElement(By.xpath("//span[text()='Month']")).click();
          driver.findElement(By.xpath("//span[text()=' April ']")).click();
          driver.findElement(By.xpath("//span[text()='Day']")).click();
          driver.findElement(By.xpath("//span[text()=' 4 ']")).click();
          driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2021");
          //driver.findElement(By.xpath("//span[text()='Year']")).sendKeys("2021");
        //tagname[contains(text(),'')]
          //driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
          //driver.findElement(By.xpath("//span[contains(text(),'Country/Region of residence']")).click();
          driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
          driver.findElement(By.xpath("//span[text()=' India ']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("ne@gmail.com");
          driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("ne11111");
         driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
         driver.findElement(By.xpath("//span[text()=' What was your first car's make or model? ']")).click();
         driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("al");
         driver.findElement(By.xpath("//input[@type='checkbox']/..")).click();
         driver.findElement(By.xpath("//button[text()=' Done ']")).click();
         
	}

}


//Navigate onto https://www.royalcaribbean.com/account/create
	//First Name as Dennis 
	//Last Name as Rich
	//Select Month as April 
	//Day as 4
	//Year as 2021
	//Country as India
	//Any email address and password 
	//Select as “What was your first car's make or model?”
	//Type answer 
	//Accept the terms and condition 
	//Click done
