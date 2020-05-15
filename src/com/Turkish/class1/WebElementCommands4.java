package com.Turkish.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.Utilities.Ahmet.MyBase;

public class WebElementCommands4  extends MyBase{
public static String url="https://opensource-demo.orangehrmlive.com/inde.php/auth/login";
	public static void main(String[] args) {//sendKeys(e
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		//yada System.setProperty("webdriver.chrome.silentOutput", "true");
		drivers("chrome");
		driver.get(url);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//clear yazmayica daha oncekine ekliyr
		driver.findElement(By.id("txtUsername")).sendKeys("Hello");
		//isDisplayed()
		boolean loginbutton=driver.findElement(By.id("btnLogin")).isDisplayed();
		System.out.println(loginbutton);
		//isEnabled()--->bunlari doldurmadan diger sayfa aktif olmuyr
		
		driver.findElement(By.id("btnLogin")).click();
		boolean loginbuttonEnabld=driver.findElement(By.id("btnLogin")).isEnabled();
		System.out.println(loginbuttonEnabld);
		
		boolean loginbuttonselect=driver.findElement(By.id("btnLogin")).isSelected();
		System.out.println(loginbuttonselect);

		
		//getText
		String errorMsg=driver.findElement(By.id("spanMessage")).getText();
		System.out.println(errorMsg);
		
		if(errorMsg.equalsIgnoreCase("Password cannot be empty")) {
			System.out.println("Correct message displayed ");
		}else {
			System.out.println("Wrong message displayed ");
			
		}
		
		String LoginValue=driver.findElement(By.id("btnLogin")).getAttribute("value");
		System.out.println(LoginValue);
		
		
		
		
		
	}

}
