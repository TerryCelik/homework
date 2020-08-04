package com.herokuapp.main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.herokuapp.BaseTest;
import com.herokuapp.pages.MainPage;

public class mainPageTest extends BaseTest {
	
	private MainPage mainPage = new MainPage();
	
	@BeforeAll
	public void beforeAll() {
		mainPage.openApp();
	}
	
	@Test
	public void asd() {
//		mainPage.clickSomeButton();
	}
	
	@AfterAll
	public void AfterAll() {
		mainPage.closeApp();
	}


}
