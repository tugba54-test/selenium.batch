package selenium.batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\drivers\\chromedriver.exe");//---static method
		//onn icn direk method adiyla cagiriyrz
		WebDriver driver=new ChromeDriver();//we are importing because they are other package--> go ahead and open chrome browser
         
		Thread.sleep(2000);
		
		
		
		driver.close();
	}

}
