package com.syntax.selenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2ndway {

	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html"; 
	
	public static void main(String[] args) {
		
//		TC 4: Radio Buttons Practice  
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Input Forms” links
//		Click on “Radio Buttons Demo” links
//		Click on any radio button in “Radio Button Demo” section.
//		Verify correct radio is clicked
//		Click on any radio button in “Group Radio Buttons Demo” section.
//		Verify correct checkbox is clicked
//		Quit browser
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver  driver=new ChromeDriver();
	System.getProperty(url);
	driver.get(url);
	
	driver.findElement(By.className("dropdown-toggle")).click();
	
	driver.findElement(By.linkText("Radio Buttons Demo")).click();
	
	WebElement male=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
	male.click();	
	WebElement group=driver.findElement(By.cssSelector("input[value='Female'][name='optradio'"));
	group.click();
	
	System.out.println(male.isSelected());
	System.out.println(group.isSelected());
		
		
		
		
		
		
		
		
		
		
	}

}
