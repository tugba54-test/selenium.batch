package com.syntax.selenium02;

public class TestWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SWebDriver driver=new SChromeDriver();
		driver.get("https://google.com");
		driver.close();
		
		SWebDriver driver2=new SFireFoxDriver();
		driver.get("https://www.google.com");
	}

}
