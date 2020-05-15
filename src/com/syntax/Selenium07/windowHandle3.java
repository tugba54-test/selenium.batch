package com.syntax.Selenium07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class windowHandle3 extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		
		String signUpTitle=driver.getTitle();
		System.out.println("Main page title is "+signUpTitle);
		String parentWindowHandle=driver.getWindowHandle();//grab the handle of parent window
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		
		
		driver.findElement(By.linkText("Like us On Facebook")).click();
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		Set<String>allWindowHandles=driver.getWindowHandles();//returns set of window handle of all windows
		System.out.println("What is the Number Of windows opened "+allWindowHandles.size());
		
		Iterator<String>allIt=allWindowHandles.iterator();
		while(allIt.hasNext()) {
			String handle=allIt.next();//Grab the next window handle
			if(!handle.contentEquals(parentWindowHandle)) {//switch to next window only if not same as a parent window
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				
			}
		}
		driver.quit();
	}

}
