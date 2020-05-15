package com.syntax.Selenium07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class SimpleWindow2  extends MyBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drivers("chrome");
		driver.get("https://accounts.google.com/signup");
		
		String signUpTitle=driver.getTitle();
		System.out.println("Main page title is "+signUpTitle);
		
		
		driver.findElement(By.linkText("Help")).click();
		
		/*
		 * How o get window handle ?
		 * in Selenium we have two method to get the hand of window 
		 * gitWindowHandle();
		 * ---------->it returns id is the main window(very first page)
		 * gitWindowHandles();
		 * --------->id is all open windows
		 */
		
		Set<String>allWindowHandles=driver.getWindowHandles();
		System.out.println("Number of windows opened are:: "+allWindowHandles.size());
		//birinci pencerede 
		Iterator<String>allIt=allWindowHandles.iterator();
		//return set of string Ids of all windows currently opened by the current instance
		
		
		//how do you handle multiple window
		
		while(allIt.hasNext()) {//linkHashset e donuyr o yuzden sirali oluyr
			
			String mainWindowHandle=allIt.next();//return the id of main window
			System.out.println("id is the main window :   "+mainWindowHandle);
			String childWindowHandle=allIt.next();
			System.out.println("id is the child window :   "+childWindowHandle);
			driver.switchTo().window(childWindowHandle);//return the id of child window
			String ChildWindowHandle=driver.getTitle();
			System.out.println("Child page title is : "+ChildWindowHandle);
			driver.close();//child one is going to close
		}
		
             
	}

}
