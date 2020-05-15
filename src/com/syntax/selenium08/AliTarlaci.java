package com.syntax.selenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class AliTarlaci extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
	      //driver.get("https://www.spicejet.com/");
	      driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	      Thread.sleep(3000);
	      WebElement adult= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
	      Select s=new Select(adult);
	      s.selectByValue("2");

	}

}
