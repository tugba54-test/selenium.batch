package com.syntax.selenium04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo1 {
	
	public static String url="https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
	WebElement maleRadioB=driver.findElement(By.cssSelector("input[id='sex-0']"));
	
	System.out.println(maleRadioB.getAttribute("value"));
	
	System.out.println(maleRadioB.isDisplayed());//true
	System.out.println("Radio button is selected ? "+maleRadioB.isEnabled());//clickable or not
	System.out.println(maleRadioB.isSelected());//secildi mi
	
	//first way to click on a radio button
	maleRadioB.click();
	System.out.println("Radio button is selected ? "+maleRadioB.isSelected());//secildi mi
    System.out.println("-----------------");
	//second way to click on Radio buttons
	List<WebElement>prolist=driver.findElements(By.xpath("//input[@name='profession']"));
	System.out.println("Size of check Box are:  "+prolist.size());
	
	String SelectedValue="Manual Tester";
	//to getting attribute get
	for(WebElement pro:prolist) {//Checking is the check-box is enabled
		
			String value=pro.getAttribute("value");//get value of value attribute
			//System.out.println(value);asagiya gidiyr loop icn break oldugu icn geri donmuyr
			
			if(value.equals(SelectedValue)) {
				pro.click();
				break;
			}
				
			}
			
		}
	}
	
	
	
	
	



