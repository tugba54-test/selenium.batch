package com.syntax.selenium02;

public class SChromeDriver implements SWebDriver {
	public SChromeDriver() {
		System.err.println("Opening Chrome Browser");
	}

	@Override
	public void get(String url) {
System.out.println("Lunching the url:: "+url);		
	}

	@Override
	public void getCurrentUrl() {
System.out.println("Retrieving the Current Url");		
	}

	

	@Override
	public void close() {
System.out.println("closing the current url");		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
