package com.syntax.selenium03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
  
  WebDriver driver=new FirefoxDriver();
  driver.navigate().to("https://www.zillow.com/");
  
  driver.navigate().to("https://www.google.com/");
  
  driver.navigate().back();
  
  driver.navigate().refresh();
  
  String url=driver.getCurrentUrl();
  System.out.println(url);
	}

}
