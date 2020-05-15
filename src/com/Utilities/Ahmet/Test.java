package com.Utilities.Ahmet;

public class Test extends MyBase {

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("https://syntaxtechs.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		ReadFile("C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\configs\\AmazonAccaount.properties");
         System.out.println( takeProperty("email"));
         System.out.println( takeProperty("password"));
	}

}
