package com.Turkish.class2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class WebTableIntrview extends MyBase{
public static String url="http://seleniumeasy.com/test/table-search-filter-demo.html";
	public static void main(String[] args) {
		drivers("chrome");
		driver.get(url);

		
		// All head
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		int Rsize=rows.size();
		for(int i=0;i<Rsize;i++) {
			String HeadText=rows.get(i).getText();
			System.out.println(HeadText);
		}
		
		
		//All cols
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));
		
		int Csize=cols.size();
		for(int i=1;i<Csize;i++) {
			String CellText=cols.get(i).getText();
			System.out.println(CellText);
		}
		
		
		
		
		
		
	}
	

}
