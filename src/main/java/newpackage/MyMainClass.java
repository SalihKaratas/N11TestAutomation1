package newpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyMainClass {

	public static void main(String[] args) throws IOException {
		
		LoginControl logInControl = new LoginControl();
		
		logInControl.openSite();
		logInControl.clickLogIn();
		logInControl.enterEmail();
		logInControl.enterPassword();
		logInControl.clickLogInButton();
		logInControl.enterSearch();
		logInControl.clickSearchButton();
		logInControl.chooseItem();
		logInControl.chooseColor();
		logInControl.addBasket();
		logInControl.goBasket();
	}

}
