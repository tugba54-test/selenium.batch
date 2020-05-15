package com.syntax.Selenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;



public class TaskAlert extends MyBase{

	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
//		JavaScript alert text verification
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Alerts & Modals” links
//		Click on “Javascript Alerts” links
//		Click on button in “Java Script Alert Box” section
//		Verify alert box with text “I am an alert box!” is present
//		Click on button in “Java Script Confirm Box” section
//		Verify alert box with text “Press a button!” is present
//		Click on button in “Java Script Alert Box” section
//		Enter text in the alert box
//		Quit browser
		
		
	drivers("chrome");
	driver.get(url);
	
	driver.findElement(By.linkText("Alerts & Modals")).click();
		
	driver.findElement(By.linkText("Javascript Alerts")).click();	
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	Thread.sleep(4000);
	Alert simpleAlert=driver.switchTo().alert();
	String simpleA=simpleAlert.getText();
	simpleAlert.accept();
	
	if("I am an alert box!".equals(simpleA)) {
		System.out.println("Test Case Pass");
		
	}else {
		System.out.println("Failed");
	}
		
		
	driver.findElement(By.xpath("//*/div/div[2]/div[2]/div[2]/button"))	.click();
		Alert ConfirmAlert=driver.switchTo().alert();
		String CAlert=ConfirmAlert.getText();
		
		
	if(CAlert.equals("Press a button!")){
System.out.println("Test Case Pass");
ConfirmAlert.accept();
	}else {
		System.out.println("Failed");
		ConfirmAlert.dismiss();
	}
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("Tugba Akca");
		promptAlert.accept();
		String promptText=promptAlert.getText();
		System.out.println(promptText);
		
		
		driver.quit();

	}

}
