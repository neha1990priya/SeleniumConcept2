package com.cyient.megento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountMaganto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("firstname")).sendKeys("test1");
		driver.findElement(By.id("lastname")).sendKeys("test");
		driver.findElement(By.id("email_address")).sendKeys("neha@111");
		driver.findElement(By.id("self_defined_company")).sendKeys("Cyi");
		// Drop Down
		Select mycompanyprimarily = new Select(driver.findElement(By.id("company_type")));
	    mycompanyprimarily.selectByVisibleText("Tech Partner");
	    
	    Select myrole = new Select(driver.findElement(By.id("individual_role")));
	    myrole.selectByVisibleText("Technical/developer");
	    
	    Select country = new Select(driver.findElement(By.id("country")));
	    country.selectByVisibleText("India");
		
	}

}
