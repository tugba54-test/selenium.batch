package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods{
	public static void main(String[] args) {
		
	
	/*
	 *  user should be able to login to the application with valis credentialswith 
	 */
	setUp();
	WebElement username=driver.findElement(By.id("txtUsername"));
	 sendText(username,ConfigsReader.getProperty("username"));
	 
	 
	
	
	
}}