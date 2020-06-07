package com.syntax.selenium02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskFacebook {
	// first way
	public static WebDriver driver;// if static we can call just with static

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "\\Users\\16824\\eclipse-workspace2\\asel.java\\configs\\Task2.properties";

		FileInputStream fileInput = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fileInput);

		String browser = prop.getProperty("browser");
		// second way if you not want to initialize you can call as a static instance
		// variable
		// WebDriver driver = null;

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();

			break;
		case "fireFox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		}// if it is a local WebDriver is a local we need to initialize to use
			// or we can add default
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));

	}
}
