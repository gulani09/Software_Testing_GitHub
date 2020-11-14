package pageFactory;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageFactory {
	
	By txt_username = By.xpath("//input[@id='name']");
	By txt_password =  By.xpath("//input[@id='password']");
	By login = By.xpath("//class[@id='login']");
	By logout = By.id("logout");
	WebDriver driver;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	 public void enterPassword(String password) {
		 driver.findElement(txt_password).sendKeys(password);
	 }
	 
	 public void clickLogin() {
		 driver.findElement(login).click();
	 }
	 
	 public void validatePage() {
		 driver.findElement(logout).isDisplayed();
	 }
	 
	 public void loginValidUser(String username, String password) {
		 driver.findElement(txt_username);
		 driver.findElement(txt_password);
		 driver.findElement(login).click();
		 
	 }
	
}
