package selenium.batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.costco.com");
      System.out.println(driver.getCurrentUrl()); 
      System.out.println(driver.getTitle());
    String actualUrl=driver.getCurrentUrl();
	if(actualUrl.equalsIgnoreCase(actualUrl)) {
    	  String title=driver.getTitle();
    	  System.out.println(title);
      }else {
    	  System.out.println("Wrong Url is returned");
      }
      driver.close();
	}

}
