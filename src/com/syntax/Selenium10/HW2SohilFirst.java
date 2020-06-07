package com.syntax.Selenium10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utilities.Ahmet.MyBase;

public class HW2SohilFirst extends MyBase {

	public static void main(String[] args) throws InterruptedException {
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("menu_pim_addEmployee")));
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		String Name = "Busra";
		String Lname = "Akce";
		// Add an Employee
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(Lname);
		String EmpId = driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");

		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		String EmpDetails = driver.findElement(By.id("profile-pic")).getText();

		if (EmpDetails.contains(Name + " " + Lname)) {
			System.out.println("employee added");
		} else {
			System.out.println("Failed");
		}

		driver.findElement(By.linkText("Employee List")).click();

		boolean found = false;
		// define flag variable
		while (!found) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			for (int i = 1; i < rows.size(); i++) {
				Thread.sleep(3000);
				String RText = rows.get(i-1).getText();

				if (RText.contains(EmpId)) {
					found = true;
					//delete employee
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
					driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
					Thread.sleep(4000);
					driver.findElement(By.id("dialogDeleteBtn")).click();
				}
			}
			//if employee id is not found,click next button
			driver.findElement(By.xpath("//a[text()='Next']")).click();

		}
	}
}
