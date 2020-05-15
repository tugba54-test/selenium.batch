package com.Turkish.class1;

public class IFrameRecap {
	/*What is frame--->Inline Frame--->Frame inside a frame----->HtMl document embedded inside the current HTML
	 * document on a website
	 * 
	 * Why is used?
	 *     --->for better visibility
	 *     --->to insert content from another source(Advertisement etc.)
	 *     ---->ability to change IFrame's content without making them reload the complete website
	 * 
	 * How to Handle--->driver.switchTo()
	 * How to identify-->right click on the page -->check this frame option is available or not 
	 *                --->view page source-->check any tag is available for IFrame
	 How to switchTo frame (name/id)	--> driver.switchTo().frame(String name/id);
	 * 									--> driver.quit();
	 * 									--> Throws: NoSuchFrameException
	 * 
	 * 					(WebElement)	--> driver.switchTo().frame(iframeElement);
	 * 									-->	driver.quit();
	 * 									--> Throws: NoSuchFrameException
	 * 
	 * 					(index)			--> Syntax - driver.switchTo().frame(int arg0);
										--> driver.switchTo().frame(0);
										--> driver.quit();
										
										--> If there are more than one frame and we want to jump from one iFrame to another iFrame
										we need to switchTo parent frame
										
										--> switchTo().defaultContent()
	 */
	
}
