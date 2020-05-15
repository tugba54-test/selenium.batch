package com.syntaxseleniumRewiev01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.Ahmet.MyBase;

public class Amazon extends  MyBase {
public static String url="http://amazon.com/";
	public static void main(String[] args) {
  drivers("chrome");
  driver.get(url);
  WebElement searcDropDown=driver.findElement(By.id("searchDropdownBox"));
  Select selectDD=new Select(searcDropDown);
  
  List<WebElement>ddOptions=selectDD.getOptions();
  
  
  //for(WebElement )

		
	}

}
