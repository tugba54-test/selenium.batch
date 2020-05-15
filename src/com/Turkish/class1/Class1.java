package com.Turkish.class1;

import com.Utilities.Ahmet.MyBase;

public class Class1 extends MyBase{
	
	public static void main(String[] args) {
		
	drivers("chrome");
	
	driver.get("http://google.com");
	String title=driver.getTitle();
	System.out.println("Title: "+title);
	
	if(title.equalsIgnoreCase("gooogle")) {
		System.out.println("expected and actual title match");
	
	}else {
		System.out.println("expected and actual title does not match");
		
	}
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
		driver.close();
	}
}