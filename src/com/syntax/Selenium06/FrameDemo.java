package com.syntax.Selenium06;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class FrameDemo extends MyBase{

	public static void main(String[] args) {
	
		
		drivers("chrome");
		String text=driver.findElement(By.xpath("//h3[()=''click on the link below']")).getText();
		
		
		
		
	}

}
