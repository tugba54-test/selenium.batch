package com.syntax.selenium09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class DeltaAirline extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//url=https://www.delta.com/
		setUp();
		driver.findElement(By.cssSelector("span[id='calDepartLabelCont']")).click();
		
		boolean flag=false;
		while(!flag) {
			String Dmonth=driver.findElement(By.xpath("//div[@class='dl-datepicker-group-wrapper']/div/div/div")).getText();
			Thread.sleep(3000);
			if(Dmonth.equals("September 2020")) {
				List<WebElement>DDays=driver.findElements(By.xpath("//a[@class='dl-state-default']"));
				for(WebElement DprtDay:DDays) {
					if(DprtDay.getText().equals("19")) {
						DprtDay.click();
						driver.findElement(By.cssSelector("button[value='done']")).click();
						flag=true;
						break;
					}
				}
			}else {
				driver.findElement(By.xpath("//a[@class='dl-datepicker-1']")).click();
			}
		}
	}

}
