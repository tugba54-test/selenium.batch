package com.syntaxseleniumRewiev01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.Ahmet.MyBase;

public class AmazonHmwrk extends MyBase {

	public static String url = "https://www.facebook.com";

	public static void main(String[] args) throws InterruptedException {
		// Homework -- Create account
//		Go to facebook.com
//		Verify “Create a new account” is Displayed
//		Fill out First name, lastname, email, new password
//		Select your birthday from given dropdowns
//		Select gender
//		Click sign up

		drivers("chrome");
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sfffhgjhjlk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();

		WebElement createNewAccount = driver.findElement(By.xpath("//*/div/div[2]/div/div/span/a"));
		System.out.println(createNewAccount.isDisplayed());
		Thread.sleep(3000);
		createNewAccount.click();
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("HAciHASAN");
		driver.findElement(By.xpath("//input[@id='u_0_p']")).sendKeys("Koca");
		driver.findElement(By.xpath("//input[@id='u_0_s']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='u_0_x']")).sendKeys("1453Hasan");

		Thread.sleep(3000);
		WebElement dateOfBirthMonth = driver.findElement(By.xpath("//select[@id='month']"));
		dateOfBirthMonth.click();
		Select selectM = new Select(dateOfBirthMonth);
		List<WebElement> listM = selectM.getOptions();

		Thread.sleep(2000);
		for (WebElement mList : listM) {
			String monthText = mList.getText();
			Thread.sleep(2000);
			if (monthText.equals("Jul")) {
				mList.click();

			}
			// System.out.println(mList.isSelected());
		}

		WebElement dateOfDay = driver.findElement(By.xpath("//select[@id='day']"));
		dateOfDay.click();
		Select selectd = new Select(dateOfDay);
		selectd.selectByValue("10");

		WebElement dateOfYear = driver.findElement(By.xpath("input[@id='u_0_6']"));
		dateOfYear.click();
		Select selectY = new Select(dateOfYear);
		selectY.selectByValue("1987");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_14']")).click();

	}

}
