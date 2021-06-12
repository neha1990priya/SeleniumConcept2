package com.cyient.gotomeeting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://www.redbus.in/");
        driver.findElement(By.id("signin-block")).click();
        driver.findElement(By.id("signInLink")).click();
        driver.findElement(By.id("src")).sendKeys("banglore");
        driver.findElement(By.id("dest")).sendKeys("coorg");
        
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
        driver.findElement(By.id("mobileNoInp")).sendKeys("4555589875");
        driver.close();
	}

}
