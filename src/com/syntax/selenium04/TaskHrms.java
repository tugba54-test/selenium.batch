package com.syntax.selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskHrms {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
  
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("input[name*='sern']")).sendKeys("Admin#123");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("123human");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebElement disp=driver.findElement(By.xpath("//img"));
		
		if(disp.isDisplayed()) {
			System.out.println("Logo is displayed, Test case passed");
		}else {
			System.out.println("Logo is not dispalyed, test case failed");
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
