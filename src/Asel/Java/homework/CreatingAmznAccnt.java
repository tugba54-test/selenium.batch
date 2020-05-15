package Asel.Java.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingAmznAccnt {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String Filepath="\\Users\\16824\\eclipse-workspace2\\selenium.batch\\configs\\AmazonAccaount.properties";
		FileInputStream fis=new FileInputStream(Filepath);
		
		 Properties prop1= new Properties();
		 
	     prop1.load(fis);
	     String brow=prop1.getProperty("browser");
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  String url=prop1.getProperty("url");
		  
		  String email=prop1.getProperty("email");
		  String pass=prop1.getProperty("password");
          driver.get(url);
          driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='nav-line-1']")).click();
        
       // driver.findElement(By.cssSelector("span[class*='a-ra']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[class*='b']")).submit();
        
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        
       
        
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(email);
        
       driver.findElement(By.cssSelector("input[class^='a-b']")).click();
       
       driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(pass);
          
//          name
//          email
//          password   input[class*='b']
     //*[@id="nav-link-accountList"]/span[1]
     //*[@id="ap_email"]

	}

}
