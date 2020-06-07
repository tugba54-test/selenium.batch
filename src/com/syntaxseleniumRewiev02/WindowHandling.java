package com.syntaxseleniumRewiev02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class WindowHandling extends MyBase {

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://www.seleniumframework.com/practiceform/");
		driver.findElement(By.cssSelector("button[id='button1'")).click();
		String parentWindow = driver.getWindowHandle();//---->getting parent window ID
		System.out.println(parentWindow);
		driver.close();

		//getting all the windows handles
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();//-->iterating through the windows

		while (it.hasNext()) {//---->checking if there is any other window handle coming up
			String childWindow = it.next();
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		WebElement header = driver.findElement(By.xpath("//strong[contains(text(),'ATDD ')]"));

		String headerText = header.getText();
		System.out.println(headerText);

	}

}
