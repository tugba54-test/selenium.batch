package com.syntax.selenium04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxAlllink {
 static String url="https://syntaxtechs.com/";
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get(url);
		List<WebElement>allLink=driver.findElements(By.tagName("a"));
		
		int count=0;
		for(WebElement link:allLink) {
			String text=link.getText();
			if(!text.isEmpty()) {
			System.out.println(text);
			count++;
			}
		}
		System.out.println(count);
	}

}
