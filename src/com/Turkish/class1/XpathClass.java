package com.Turkish.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ebay.com/");
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Insan ne ile yasar");
		
		//1.contains
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb')]")).sendKeys("Sefiller");
		
		//2. starts-with
		

		//id=test_123
		//id=test_12345
		//id=test_12354
		//id=test_12378
		//id=test_12398 yani dynamic olabilir
       driver.findElement(By.xpath("//input[starts-with(@class,'g')]")).sendKeys("Sefiller");
       
       //3.  ends with calismiyr xpath
       //4. text 
       //tag name i a olan lari seciyr
       //------>//a[text()='Forgot your password?'] bu sekilde yaziliyr
       //-----
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//a[text()=' My ebay']")).click();//Xpath in icinde linktext kulllandk
       
       //contains and Text birlikte yazilimi=contains+text
       
     //  driver.findElement(By.xpath("//a[contains(text,' My ebay'][1]")).click();
     //text yerine nokta konuluncada calisyr
       driver.findElement(By.xpath("//a[contains(.,' My ebay')][1]")).click();
       driver.close();
       
       //css selector
       
         //attribute name :    id=#
         //attribute name:     class=.
        
       //css functions
       
//       contains:  *
//       starts-with: ^
//       end-with:   $
//       
       //css example:  input[id='u_0_q']--->input # u_0_q
       
	}

}
