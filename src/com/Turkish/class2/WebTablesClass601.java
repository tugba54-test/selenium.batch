package com.Turkish.class2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class WebTablesClass601 extends MyBase {

	public static void main(String[] args) {

		drivers("chrome");
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/table-search-filter-demo.html");

		// identifiying the number of rows and columns

		// rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("Number of rows " + rows.size());// 7

		// columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println("Number of cols " + cols.size());

		// name of columns(headers)
		for (int i = 0; i < cols.size(); i++) {
			String nameOfCols = cols.get(i).getText();
			System.out.println("Name of the columns " + nameOfCols);// 7
		}

		// name of rows
		for (int i = 1; i < rows.size(); i++) {
			String nameOfRow = rows.get(i).getText();
			System.out.println("Name of rows " + nameOfRow);// 4
		}
		// ----->//table[@id='task-table']/tbody/tr[5]/td[2]5 row 2.element
		// we can use iterator also

		Iterator<WebElement> rowIt = rows.iterator();
		while (rowIt.hasNext()) {
			String rowDt = rowIt.next().getText();
			System.out.println(rowDt);
		}

		// finding all data
		List<WebElement> cells = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));
		for (WebElement cell : cells) {
			String cellVal = cell.getText();
			System.out.println("Cell Value " + cellVal);
		}

		driver.quit();

	}
}
