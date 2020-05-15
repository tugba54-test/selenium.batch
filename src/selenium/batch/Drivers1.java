package selenium.batch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\drivers\\chromedriver.exe");
 WebDriver  Patates=new ChromeDriver();
 Patates.get("http:/amazon.com");
 Patates.findElement(By.name("q")).sendKeys(Keys.ENTER);
 
 Thread.sleep(2000);
 
 
 
 
 
 
 
	}

}
