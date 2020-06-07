package com.syntax.selenium11Asel;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLogin extends CommonMethods{

	public static void main(String[] args) {
		//url=http://166.62.36.207/humanresources/symfony/web/index.php/auth
		setUp();
		
		
		LoginPage login=new LoginPage();//logan page baska bi pakette olsaydi ve basinda public olmasydi default kabul edilirdi 
		System.out.println((login.logo).isDisplayed());
		sendText(login.username, ConfigsReader.getProperty("username"));//goremezdik onn icn public yaptik
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		//tearDown();

}}