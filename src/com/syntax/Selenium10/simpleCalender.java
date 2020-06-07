package com.syntax.Selenium10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utilities.Ahmet.MyBase;

public class simpleCalender extends MyBase {

	public static void main(String[] args) throws InterruptedException {
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		//navigate to leave list
         driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
         driver.findElement(By.linkText("Leave List")).click();
         
         //click on the calender
         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("calFromDate")));
         Thread.sleep(5000);
         driver.findElement(By.id("calFromDate")).click();
        
         //click the month
         WebElement fromMonth=driver.findElement(By.xpath("select[@class=\'ui-datepicker-month']"));
         Select select=new Select(fromMonth);
         select.selectByValue("Apr");
         WebElement fromYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
         Select select1=new Select(fromYear);
         select1.selectByValue("2021");
        
         List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
         for(WebElement day:days) {
        	 String DayText=day.getText();
        	 if(DayText.equals("17")) {
        		 day.click();
        		 break;
        	 }
         }
	}

}
