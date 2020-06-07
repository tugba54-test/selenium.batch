package com.syntax.selenium11Asel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginPage extends CommonMethods{

	public WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']"));
	public WebElement username=driver.findElement(By.id("txtUsername"));//instance variable
	public WebElement password=driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	
}
