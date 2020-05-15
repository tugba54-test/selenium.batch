package selenium.batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\drivers\\geckodriver.exe");
		
	       WebDriver driver=new FirefoxDriver();
	       driver.get("http://www.costco.com");
	       driver.close();
	       
	}

}
