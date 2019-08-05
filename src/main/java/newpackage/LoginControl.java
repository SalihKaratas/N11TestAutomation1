package newpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import newpackage.ExcelRead;

public class LoginControl {
	
	WebDriver driver;
	ExcelRead excelRead;
	private String actualTitle;
	private String actualEmail;
	private String actualPassword;
	private String accountName;
	
	public LoginControl() throws IOException {
		
		excelRead = new ExcelRead();
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	public void openSite() {
	
		driver.get(excelRead.getUrl());
		actualTitle = driver.getTitle();
	
	}
	
	public void clickLogIn() {
	
		driver.findElement(By.className("btnSignIn")).click();
		actualTitle = driver.getTitle();
	}
	
	public void enterEmail() {
		
		driver.findElement(By.id("email")).sendKeys(excelRead.geteMail());
		actualEmail = driver.findElement(By.id("email")).getAttribute("value");
		
	}
	
	public void enterPassword() {
		
		driver.findElement(By.id("password")).sendKeys(excelRead.getPassword());
		
	}
	
	public void clickLogInButton() {
		
		driver.findElement(By.id("loginButton")).click();
		accountName = driver.findElement(By.linkText("Salih Karataþ")).getText();
		
	}
	
	public void enterSearch() {
		
		driver.findElement(By.id("searchData")).sendKeys(excelRead.getSearchItem());
		
	}
	
	public void clickSearchButton() {
		
		driver.findElement(By.className("icon")).click();
		
	}
	
	public void chooseItem() {
		
		driver.findElement(By.cssSelector("a.plink")).click();
		
	}
	
	public void chooseColor() {
		
		Select drpColor = new Select(driver.findElement(By.id("720442475")));
		drpColor.selectByVisibleText("Siyah");
		
	}
	
	public void addBasket() {
	
		driver.findElement(By.linkText("Sepete Ekle")).click();
		
	}
	
	public void goBasket() {
		
		driver.findElement(By.className("myBasket")).click();
		
	}
	public String getActualTitle() {
		return actualTitle;
	}

	public void setActualTitle(String expectedTitle) {
		this.actualTitle = expectedTitle;
	}
	public String getActualEmail() {
		return actualEmail;
	}

	public void setActualEmail(String actualEmail) {
		this.actualEmail = actualEmail;
	}

	public String getActualPassword() {
		return actualPassword;
	}

	public void setActualPassword(String actualPassword) {
		this.actualPassword = actualPassword;
	}
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
}
