package com.syntax.Selenium06;

import com.Utilities.Ahmet.MyBase;

public class alertDemo2 extends MyBase{
	
	public static String url="http://test:test@abcdatabase.com/basicauth";
//http://abcdatabase.com/basicauth-->actual adee
	public static void main(String[] args) {
		//browser base Alert 
		drivers("chrome");
		driver.get(url);
		 driver.manage().window().maximize();
		 
		
		
     
	}

}
