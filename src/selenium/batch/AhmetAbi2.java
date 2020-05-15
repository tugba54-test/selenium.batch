package selenium.batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AhmetAbi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("ABD@com");
		driver.findElement(By.id("pass")).sendKeys("Ali123");
		driver.findElement(By.id("u_0_b")).click();
		//driver.close();
	}


	}


