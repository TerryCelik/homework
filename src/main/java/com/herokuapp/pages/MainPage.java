package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage {
	
	private static final String SOME_XPATH = "";
	
	private WebElement getSomeButton() {
		return driver.getElement(By.xpath(SOME_XPATH));
	}
	
	public void clickSomeButton() {
		getSomeButton().click();
	}

}
