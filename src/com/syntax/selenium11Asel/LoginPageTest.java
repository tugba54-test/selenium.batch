package com.syntax.selenium11Asel;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		LoginPageElemnts login=new LoginPageElemnts();
		sendText(login.username, ConfigsReader.getProperty("username"));
        sendText(login.password,ConfigsReader.getProperty("password"));
       click(login.loginBtn);

}}
