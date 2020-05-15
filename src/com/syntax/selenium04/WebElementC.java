package com.syntax.selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {

	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		WebElement username=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		username.sendKeys("Tester");
		Thread.sleep(3000);
		username.clear();
		username.sendKeys("Manual");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("12345");
		
		driver.findElement(By.cssSelector("input[id*='login']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
