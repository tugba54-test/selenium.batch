package com.Turkish.class1;

import com.Utilities.Ahmet.MyBase;

public class TaskWindosHandling extends MyBase{
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) {
		/* TC 1: Windows Handling
		1. Open chrome browser
		2. Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		3. Click on “ Alerts 7 Modals” link
		4. Click on “Window Popup Modal” link
		5. Click on the “ Follow On Instagram” button
		6. Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos”
		7. Click on the “Like us On Facebook ” button
		8. Verify title of the page is “Go to Facebook Home”
		9. Quit the browser
			NOTE: Selenium execution could be too fast, please use
			Thread.sleep */

		drivers("chrome");
		driver.get(url);
			
	}

}
