package com.cyient.multipletabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DbFreeMultipleTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://www.db4free.net/");
		driver.findElement(By.xpath("//a[@href='/phpMyAdmin']")).click();

		Set<String> tabSessions = driver.getWindowHandles();

		for(String tabSession : tabSessions){
		        driver.switchTo().window(tabSession);
		        String titleForDb = driver.getTitle();
		        if(titleForDb.equals("phpMyAdmin"))
		        {
		                break;
		        }
		}

		driver.findElement(By.id("input_username")).sendKeys("Neha123");
		driver.findElement(By.id("input_password")).sendKeys("Ne11111");
		driver.findElement(By.id("input_go")).click();
		
		String Error1 = driver.findElement(By.xpath("(//div[@class='alert alert-danger'])[3]")).getText();
		System.out.println(Error1);
		driver.close();
	}

}
