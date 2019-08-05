package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import newpackage.ExcelRead;
import newpackage.LoginControl;

	public class TC0001 {
		LoginControl logInControl;
		
		@BeforeClass
		public void setUp() throws IOException {

			logInControl = new LoginControl();
			logInControl.openSite();
			logInControl.clickLogIn();
			logInControl.enterEmail();
			logInControl.enterPassword();
			logInControl.clickLogInButton();
		}
		
		@Test(priority = 0)
		public void verifyOpenWebSite() {
			
			String expectedTitle = "n11.com - Alýþveriþin Uðurlu Adresi";
	        String actualTitle = logInControl.getActualTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
		
		}
		
		@Test(priority = 1)
		public void verifLogInPage() {
			
			String expectedTitle = "Giriþ Yap - n11.com";
	        String actualTitle = logInControl.getActualTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
						
		}
		@Test(priority = 2)
		public void verifyFillEmail() {
			
			String expectedEmail = "testmail8233@gmail.com";
			String actualEmail = logInControl.getActualEmail();
			Assert.assertEquals(actualEmail, expectedEmail);
			
		}
		@Test(priority = 4)
		public void verifyClickLogIn() {
			String expectedAccountName = "Salih Karataþ";
			String actualAccountName = logInControl.getAccountName();
			Assert.assertEquals(actualAccountName, expectedAccountName);
			
			
		}
  
}
