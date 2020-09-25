package selenium.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class ElementsLocators {

	public static WebDriver driver = null;

	public static void main(String[] args) {
		ElementsLocators elementsLocators = new ElementsLocators();
		elementsLocators.findLocatorsInAmazon();
		//elementsLocators.findLocatorsInFacebook();
		elementsLocators.closeBrower();
	}

	/**
	 * Close the current brower
	 */
	private void closeBrower() {
		driver.close();
	}

	/**
	 * Find the text locators using the facebook website
	 */
	private void findLocatorsInFacebook() {
		try {
			invokeBrowser("https://www.facebook.com/");
			driver.findElement(By.name("firstname")).sendKeys("Gulani");
			// finding element using cssSelector
			driver.findElement(By.cssSelector("input#email")).sendKeys("gulani09@gmail.com");
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/*
	 * Launch the browser
	 */
	private void invokeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Education_Profession\\Test Learning\\Development\\Test Development\\Selenium\\Projects Support Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param driver
	 */
	private void findLocatorsInAmazon() {
		try {
			invokeBrowser("https://www.amazon.com.au/");
			/*
			 * driver.findElement(By.linkText("Best Sellers")).click(); Thread.sleep(3000);
			 * driver.navigate().back(); Thread.sleep(3000); // find by partial link text
			 * (using partial text from the long text)
			 * driver.findElement(By.partialLinkText("Customer")).click();
			 * driver.navigate().back();
			 * 
			 * // finding by xpath driver.findElement(By.xpath(""));
			 */
			// find by ID
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
			Thread.sleep(3000);
			// find by class name
			driver.findElement(By.className("nav-input")).click();
			
			Thread.sleep(3000);
			
			WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'Java: The Complete Reference, Eleventh Edition')]"));
			 //scroll down 
			/*
			 * JavascriptExecutor executor = (JavascriptExecutor) driver;
			 * executor.executeScript("arguments[0].scrollIntoView();", element);
			 * Thread.sleep(3000);
			 */
			 element.click();

			Thread.sleep(3000);
			
			/*
			 * //select size and make a checkout
			 * driver.findElement(By.id("native_dropdown_selected_size_name")).click();
			 * driver.findElement(By.id("native_size_name_0"));
			 */
			
			// checkout
			driver.findElement(By.id("add-to-cart-button")).click();
			
			Thread.sleep(3000);
			 
			 
			//driver.findElement(By.linkText("EMAXELER")).click();
		
			//List<WebElement> list = driver.findElements(By.tagName("a"));
			
			//System.out.println(list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
