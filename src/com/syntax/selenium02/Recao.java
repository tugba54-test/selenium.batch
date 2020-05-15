package com.syntax.selenium02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recao {

	public static void main(String[] args) {
		/* Commands Related with page
		*getCurrentUrl
		*get()
		*close()
		*getTitle()*/
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String url=driver.getCurrentUrl();
		System.out.println("Current url is:  "+url);
		
		String title=driver.getTitle();
		System.out.println("title of the page is "+title);
		driver.close();
		

	}

}
