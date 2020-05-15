package selenium.batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		// 1-set a system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\drivers\\chromedriver.exe");
		//2-create an object of WebDriver type
		WebDriver driver=new ChromeDriver();
		//3.navigate to Syntax Application
		driver.get("https://gap.com");
		System.out.println(driver.getTitle());
	       System.out.println(driver.getCurrentUrl());


	}

}
