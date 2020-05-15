package com.syntax.selenium08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class Task extends MyBase{

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
       
       List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
     System.out.println(rows.size());
     
     for(int i=0;i<rows.size();i++) {
    	 String text=rows.get(i).getText();
    	 System.out.println(text);
     }
     
     List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table']/thead[@class='thead-inverse']/tr/th"));
     System.out.println(cols.size());
        
     Iterator<WebElement>it=cols.iterator();
     while(it.hasNext()) {
    	 String colsText=it.next().getText();
    	 
    	 System.out.println(colsText+" I am the header");
     }
     
     
       

	}

}
