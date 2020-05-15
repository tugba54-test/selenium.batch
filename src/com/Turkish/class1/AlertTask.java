package com.Turkish.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class AlertTask  extends MyBase{
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		/* TC 1: Syntax Frame verification
		1. Open chrome browser
		2. Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		3. Click on “Others” link
		4. Click on “Iframe” link
		5. Click on the “Home” link inside the frame one
		6. Verify “Syntax logo” is displayed in another frame
		7. Quit browser */
		
		drivers("chrome");
		driver.get(url);
		
		driver.findElement(By.linkText("Others")).click();;
		driver.findElement(By.linkText("Iframe")).click();
		
		driver.switchTo().frame("FrameOne");
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.switchTo().defaultContent();
		WebElement frameTwo=driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
				driver.switchTo().frame(frameTwo);
				
		WebElement logo=driver.findElement(By.xpath("//img[@class='custom-logo']"));		
				
		boolean isLogoDisplayed=logo.isDisplayed();
		
		if( isLogoDisplayed) {
			System.out.println("test Pass");
		}else {
			System.out.println("Test Fail"); 
		}
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		
		
		

	}

}
