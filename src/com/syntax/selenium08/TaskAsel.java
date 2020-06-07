package com.syntax.selenium08;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class TaskAsel extends MyBase{

	public static void main(String[] args) {
//		TC 1: Table headers and rows verification
//		Open chrome browser
//		Go to “http://166.62.36.207/syntaxpractice/”
//		Click on “Table” link
//		Click on “ITable Data Search” link
//		Verify second table consist of 5 rows and 4 columns
//		Print name of all column headers 
//		Print data of all rows
//		Quit Browser
		
		drivers("chrome");
		driver.get("http://166.62.36.207/syntaxpractice/");
       driver.findElement(By.linkText("Table")).click();
       driver.findElement(By.linkText("Table Data Search")).click();
       

	}

}
