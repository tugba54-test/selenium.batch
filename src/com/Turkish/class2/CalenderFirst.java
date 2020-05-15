package com.Turkish.class2;

import com.Utilities.Ahmet.MyBase;

public class CalenderFirst extends MyBase {
	
public static String url="http://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html";

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get(url);
		

	}

}
