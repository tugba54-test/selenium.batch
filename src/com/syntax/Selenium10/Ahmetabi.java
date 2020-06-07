package com.syntax.Selenium10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.Ahmet.MyBase;

public class Ahmetabi extends MyBase {

	public static void main(String[] args) {
//		 http://dontpush.me/ to do kismina bir bilgi ekleyip onun priority 
//			 levelini drop down ile secip 10 defa kaydedip
//			 ve sonra son 5  kaydi delete edebilirmisiniz ?

		drivers("chrome");
		driver.get("http://www.dontpush.me");
		driver.findElement(By.cssSelector("input[placeholder='To Do']")).sendKeys("work hard");
		WebElement priority=driver.findElement(By.cssSelector("div[class='select-selected']"));
		Select select =new Select(priority);
		//select.selectByValue(value);

	}

}
