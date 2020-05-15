package com.syntax.selenium05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.Ahmet.MyBase;

public class AmazonDepartment extends MyBase{
public static String url="http://amazon.com/";
	public static void main(String[] args) throws InterruptedException {
//		TC 1: Amazon Department List Verification
//		Open chrome browser
//		Go to “http://amazon.com/”
//		Verify how many department options available.
//		Print each department 
//		Select Computers
//		Quit browser
		
		drivers("chrome");
		driver.get(url);
WebElement allLink=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	allLink.click();
		Select select=new Select(allLink);
		
		
		
  List<WebElement>Alloption=select.getOptions();
  
  Iterator<WebElement>it=Alloption.iterator();
  int count=0;
  while(it.hasNext()) {
	  String text=it.next().getText();
	  Thread.sleep(3000);
	  System.out.println(text);
	  count++;
  }
  System.out.println(count+" options are available");
	driver.quit();	

}}
