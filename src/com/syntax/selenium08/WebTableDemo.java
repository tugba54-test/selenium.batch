package com.syntax.selenium08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class WebTableDemo extends MyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		drivers("chrome");
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/table-search-filter-demo.html");

		// how many rows of data table has
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

		System.out.println("Number of rows in the table is = " + rows.size());
		
		
		//printing row data
		System.out.println("Printing row data------");
		Iterator<WebElement >row=rows.iterator();
		while(row.hasNext()) {
			String RText=row.next().getText();
			System.out.println(RText);
		}
		

		// number of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));

		System.out.println("Number of columns in the table is = " + cols.size());
		
		//printing columns headers 
		System.out.println("printing  column headers -----------");
		
		for(WebElement col:cols) {
			String header=col.getText();
			System.out.println(header);
		}

		driver.quit();
		
		
		
	}

}
