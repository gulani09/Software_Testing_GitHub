package selenium.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 * This file contains the common methods for executing the test-cases for 
 * testing the xpath concepts
 */
public class SeleniumXpathbasic {

	/**
	 * This method use to launch the browser
	 * 
	 * @param driver
	 * @param url
	 */
	public void invokeBrowser(WebDriver driver, String url) {
		try {
			driver.manage().window().maximize();
			// page synchronization
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			// get url
			driver.get(url);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * This method use to close the browser
	 * 
	 */
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

	/**
	 * This method use to checkout the product using 
	 * xpath web elements locators
	 * Automationtesting 'MyStore' project
	 * 
	 * @param driver
	 */
	public void checkoutProduct(WebDriver driver) {
		try {
			// search for product
			driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("t-shirt");

			driver.findElement(By.xpath("//button[@name='submit_search']")).click();
			Thread.sleep(3000);

			//find a web element to locate that position to click
			WebElement element = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(3000);

			// Delete the quality value and added to '2'
			WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
			quantity.clear();
			quantity.sendKeys("2");
			Thread.sleep(4000);

			// change the size using dropdown
			Select size = new Select(driver.findElement(By.id("group_1")));
			//executor.executeScript("arguments[0].selectByVisibleText('M');", size);
			size.selectByVisibleText("M");
		
			// Select colour of product
			driver.findElement(By.xpath("//a[@title='Blue']")).click();
			Thread.sleep(3000);
		
			// Add to the card
			driver.findElement(By.xpath("//span[contains(text(), 'Add to cart')]")).click();;
			Thread.sleep(3000);

			driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
			Thread.sleep(3000);
	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
