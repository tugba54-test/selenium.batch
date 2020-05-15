package selenium.batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//TC 2: Opening Page on Firefox Browser
//Open Firefox browser
//Navigate to “https://www.redfin.com/”
//Verify that you have navigated to (https://www.redfin.com/)
//End the Session (close the browser).
public class FirefoxRedfin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redfin.com/");
	System.out.println(driver.getTitle());
	driver.close();
	}}	
	
	
	
	
	
	
	
	
	


