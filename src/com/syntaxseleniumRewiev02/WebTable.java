package com.syntaxseleniumRewiev02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class WebTable extends MyBase {

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://testingpool.com/data-types-in-java/");
		List<WebElement> Rows=driver.findElements(By.xpath("//div[@class='su-table su-table-alternate']/table/tbody/tr"));
		int rowNums=Rows.size();
		
		List<WebElement> cols=driver.findElements(By.xpath("//div[@class='su-table su-table-alternate']/table/tbody/tr[1]/td"));
		int colnums=cols.size();
		
		
		for(int i=1;i<=rowNums;i++) {//contrlling rows
			
			
			for(int y=1;y<=colnums;y++) {//controlling columns
				WebElement cellData=driver.findElement
						(By.xpath("//div[@class='su-table su-table-alternate']/table/tbody/tr["+i+"]/td["+y+"]"));
				String cellDataText=cellData.getText();
				
				if(y==2) {
					System.out.println(cellDataText);
				}
				
			}
		}
		driver.quit();
		
	}

}
