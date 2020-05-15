package selenium.batch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ahmetabi {
	


		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("#tsf>div:nth-child(2) > div.A8SBwf > div.RNNXgb >div >  div.a4bIc > input")).sendKeys("Syntax technologies");
		
		driver.findElement(By.name("q")).sendKeys (Keys.ENTER);
		
		Thread.sleep(16000);
		driver.quit();
			
		}

}
