package com.Turkish.class1;

public class MultiplewindowsExplanation {

	public static void main(String[] args) {
		/*	● Filling forms may require selecting the date from a separately opened window
		● Clicking on some link/button can open another window
		● Handling Advertisement windows
		
		--> Selenium WebDriver assigns an alphanumeric id to each window as soon as the WebDriver object is instantiated.
		--> This unique alphanumeric id is called window handle. Selenium uses this unique id to switch control 
		among several windows.
		
		--> each unique window has a unique ID
		
		getWindowHandle() -->String handle=driver.getWindowHandle();
		
		getWindowHandles()	--> To get the window handles of all the current windows.
		
							--> Set<String> handles=driver.getWindowHandles();
							--> driver.switchTo.window("windowName");
		 */
	

	}

}
