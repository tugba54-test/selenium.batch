package com.Udemy01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
       driver.get("http://gap.com");
       System.out.println(driver.getTitle());//validate if your page title is correct
       System.out.println(driver.getCurrentUrl());// validate if you are landed on correct url
     //  System.out.println(driver.getPageSource());// print page sources
       driver.get("http://yahoo.com");
       driver.navigate().back();

	}

}
