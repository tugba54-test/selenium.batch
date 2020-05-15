package com.syntax.Selenium07;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class Seyma1 extends MyBase{

	public static void main(String[] args) {
drivers("chrome");
    driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button")).click();

}}