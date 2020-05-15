package com.syntax.selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.cssSelector("a[href*='register']")).click();
		
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("Alex");
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("Chirdalli");
		driver.findElement(By.cssSelector("input[name$='ne']")).sendKeys("6945673241");
		driver.findElement(By.cssSelector("input[name$='ne'")).sendKeys("alex@gmail.com");
		driver.findElement(By.cssSelector("input[size='40']")).sendKeys("123 glenway ");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Arlington");
		driver.findElement(By.cssSelector("input[name$='te']")).sendKeys("Tx");
		driver.findElement(By.cssSelector("input[name*='ost']")).sendKeys("87112");
		driver.findElement(By.cssSelector("select[name='country']")).click();
		driver.findElement(By.cssSelector("option[value='11']")).click();
		driver.findElement( By.cssSelector("input[id='email']")).sendKeys("alexi154");
		driver.findElement(By.cssSelector("input[name^='pas']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name*='firm']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[type='image']")).click();
		
driver.close();
		
		
		
	}

}
