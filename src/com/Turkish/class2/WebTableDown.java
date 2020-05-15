package com.Turkish.class2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class WebTableDown  extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://seleniumeasy.com/test/table-search-filter-demo.html");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
        
		System.out.println(rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		System.out.println(cols.size());
		
		for(int i=1;i<cols.size();i++) {
			String Ctext=cols.get(i).getText();
			System.out.print(Ctext+"  ");
		}
		
		System.out.println();
		Iterator<WebElement>it=rows.iterator();
		while(it.hasNext()) {
			String Rtext=it.next().getText();
			System.out.print(Rtext+" ");
		}
		
		
		
	}

}
