package com.syntax.selenium12Sohil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Utilities.Ahmet.MyBase;


public class DragandDrop extends MyBase{

	public static void main(String[] args) throws InterruptedException {
		//url=https://jqueryui.com/droppable
		drivers("chrome");
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		//Longer Way
		Actions action=new Actions(driver);
		//action.clickandHold(drag).moveToElement(drop).release().perform();
		Thread.sleep(4000);
		//easy way to drag and drop
		action.dragAndDrop(drag, drop).perform();
		driver.quit();

	}

}
