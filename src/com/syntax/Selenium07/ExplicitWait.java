package com.syntax.Selenium07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;

public class ExplicitWait extends CommonMethods{
//url=http://166.62.36.207/syntaxpractice/dynamic-data-loading-demo.html
	public static void main(String[] args) {

      setUp();
      driver.findElement(By.cssSelector("button[id='save']")).click();
     boolean isDis=driver.findElement(By.xpath("//p[contains(text(),'First Name')]")).isDisplayed();
     System.out.println("First name is displayed "+isDis);
     
     WebDriverWait wait=new WebDriverWait(driver,10);
     //wait.until(ExpectedConditions.visibilityOfAllElementsLocated(By.xpath("//p[contains(text(),'First Name')]"));

}
}