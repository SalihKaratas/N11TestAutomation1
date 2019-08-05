package tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import newpackage.LoginControl;

public class TC0002 {
	
	LoginControl logInControl;
	
	@BeforeClass
	public void setUp() throws IOException {
		
		logInControl = new LoginControl();
		logInControl.enterSearch();
		logInControl.clickSearchButton();
		logInControl.chooseItem();
		logInControl.chooseColor();
		logInControl.addBasket();
		logInControl.goBasket();
		
	}
	
	@Test(priority = 0)
	public void verifySearchItem() {
	}
	@Test(priority = 1)
	public void verifyChooseItem() {
	}
	@Test(priority = 2)
	public void addBasket() {
	}
	@Test(priority = 3)
	public void openMyBasket() {
	}
}
