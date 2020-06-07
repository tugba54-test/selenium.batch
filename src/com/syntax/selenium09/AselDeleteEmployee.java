package com.syntax.selenium09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utilities.Ahmet.MyBase;

public class AselDeleteEmployee extends MyBase {

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Delete Employee
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login into the application
//		Add Employee
//		Verify Employee has been added
//		Go to Employee List
//		Delete added Employee
//		Quit the browser

		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");

		driver.findElement(By.cssSelector("input[name*='sern']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.linkText("PIM")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
				(By.linkText("Add Employee")));
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("input[id='btnAdd']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='firstName']")));
		String name = "Kubra";
		String Lname = "Akca";
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys(name);
		Thread.sleep(3000);
		// driver.findElement(By.cssSelector("input[id='middleName']")).sendKeys("Zeynep");
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys(Lname);

		String EmpId = driver.findElement(By.cssSelector("input[id='employeeId']")).getAttribute("value");

		driver.findElement(By.id("btnSave")).click();

		// verify employee was added
		String empDetails = driver.findElement(By.id("profile-pic")).getText();

		if (empDetails.contains(name = " " + Lname+" "+EmpId)) {
			System.out.println("Employee added successfully");
		} else {
			System.out.println("Failed");
		}

		// navigate to the Employee list
		driver.findElement(By.linkText("Employee List"));

		boolean found = false;
		while (!found) {

			// get the first table from the employee list
			List<WebElement> rows_f = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			for (int i = 1; i <= rows_f.size(); i++) {
				String Rowstext = rows_f.get(i).getText();
				if (Rowstext.contains(EmpId)) {
					found = true;
					driver.findElement(By.xpath("//table[@id='resulttable']tbody/tr[" + (i + 1) + "/td[1]")).click();
					driver.findElement(By.id("btnDelete")).click();
					driver.findElement(By.id("dialogDeleteBtn")).click();
					System.out.println("Employee with id # " + EmpId + " has been successfully deleted ");
					break;
				}
				
			}
			driver.findElement(By.xpath("//a[text()='Next']")).click();
		}
		Thread.sleep(3000);

		driver.quit();
	}

}
