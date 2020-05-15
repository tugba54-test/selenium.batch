package com.syntax.selenium08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;

public class WaitDemo extends CommonMethods{
//url=https://the-internet.herokuapp.com/
	public static void main(String[] args) {
		//TC 1: Verify element is clickable
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Controls” link
//		Select checkbox and click Remove
//		Click on Add button and verify “It's back!” text is displayed
//		Close the browser
		//explicit wait
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.cssSelector("div[id='checkbox")).click();
		driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
		String text= driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).getText();
		if(text.equals("It's back!")) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case failed ");
			
		}
		

	}

}
