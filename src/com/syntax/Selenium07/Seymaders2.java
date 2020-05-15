package com.syntax.Selenium07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utilities.Ahmet.MyBase;

public class Seymaders2 extends MyBase {
static String url="http://uitestpractice.com/Students/Contact"; 
	public static void main(String[] args) {
		
		drivers("chrome");
	    driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[contains(text(),'This is a Ajax link']")).click();
			WebDriverWait wait=new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'This is a Ajax link']")));

	}

}
