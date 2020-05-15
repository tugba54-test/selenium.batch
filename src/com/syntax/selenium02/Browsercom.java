package com.syntax.selenium02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.google.com");
		
        driver.navigate().back();
        
        Thread.sleep(2000);
        
        //driver.navigate().to("https://www.amazon.com");
        
        driver.navigate().forward();//it is not working
        driver.close();//we can use driver.quit()
	}

}
