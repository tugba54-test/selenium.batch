



package com.Turkish.class1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class AlertPopUpSRecap extends MyBase{
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		/*UnhandledAlertException: Modal dialog present
		 * Alert alert=driver.switchTo().alert();
		 * 
		 * alert.accept();
		 * alert.dismiss();
		 * alert.getText();
		 * alert.sendKeys();
		 */
		
		/* TC 1: JavaScript alert text verification
		1. Open chrome browser
		2. Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		3. Click on “Alerts & Modals” links
		4. Click on “Javascript Alerts” links
		5. Click on button in “Java Script Alert Box” section
		6. Verify alert box with text “I am an alert box!” is present
		7. Click on button in “Java Script Confirm Box” section
		8. Verify alert box with text “Press a button!” is present
		9. Click on button in “Java Script Alert Box” section
		10. Enter text in the alert box
		11. Quit browser */
		
		drivers("chrome");
		driver.get(url);
		//driver.findElement(By.linkText("Alerts & Modals")).click();bu yontemlede yapabilirz
		
		driver.findElement(By.xpath("//a[text()='Alerts & Modals']")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//driver.findElement(By.xpath("//*/div/div[2]/div[3]/div[2]/button")).click();copy/xpath ile yaptim
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert alert1=driver.switchTo().alert();
		String alertBoxText=alert1.getText();
		System.out.println(alertBoxText);
		
		String name="Jhon smith";
		alert1.sendKeys(name);
		Thread.sleep(3000);
		alert1.accept();

		WebElement promptMssge=driver.findElement(By.id("prompt-demo"));
		String msg=promptMssge.getText();
		if(msg.contains(name)) {
			System.out.println("alert box  Test Pass" );
		}else {
			System.out.println("Test Fail");
		}
		
		Thread.sleep(3000);
		//driver.quit();
		
	}

}
