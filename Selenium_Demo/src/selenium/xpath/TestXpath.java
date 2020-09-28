package selenium.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * This file contain the main method to test the xpath concept
 */
public class TestXpath {
	public static WebDriver driver = null;
	public final static String URL = "http://automationpractice.com/";
	public final static String DRIVER_PATH = "E:\\Education_Profession\\Test Learning\\Development\\Test Development\\Selenium\\Projects Support Files\\chromedriver_win32\\chromedriver.exe";
	public final static String DRIVER_KEY = "webdriver.chrome.driver";

	// main method of the TestXpath class
	public static void main(String [] args) {
		System.setProperty(DRIVER_KEY, DRIVER_PATH);
		driver = new ChromeDriver();
		SeleniumXpathbasic xpathbasic = new SeleniumXpathbasic();
		// invoke the browser to open
		xpathbasic.invokeBrowser(driver, URL);
		// checkout the product
		xpathbasic.checkoutProduct(driver);
		// close the browser
		xpathbasic.closeBrowser(driver);
	}

}
