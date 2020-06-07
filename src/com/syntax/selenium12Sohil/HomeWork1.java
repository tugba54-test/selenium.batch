package com.syntax.selenium12Sohil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class HomeWork1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TC 1: Drag and Drop verification
//		Open chrome browser
//		Go to “http://www.uitestpractice.com/”
//		Click on “Droppable” link
//		Using mouse drag “Drag me to my target” to the “Drop Here”
//		Close the browser
		
		
		setUp();
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		Thread.sleep(4000);
		action.clickAndHold(drag).moveToElement(drop).release().perform();
		//action.dragAndDrop(drag, drop).perform();
		
		
		boolean dr=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).isDisplayed();
		System.out.println(dr);
		
		WebElement DoubleC=driver.findElement(By.cssSelector("button[name='dblClick']"));
		action.doubleClick(DoubleC).perform();
		driver.close();

	}

}
