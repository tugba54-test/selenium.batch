package com.syntax.Selenium07;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.ui.FluentWait;

import com.Utilities.Ahmet.MyBase;

public class FluentWay extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(1));//polling keep check dedigimizde ne kadar zamnda bir every 5 seconds check yapicak
		wait.ignoring(NoSuchElementException.class);//how often do you want to check of element
		

	}

}
