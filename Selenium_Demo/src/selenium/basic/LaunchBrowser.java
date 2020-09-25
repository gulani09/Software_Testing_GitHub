package selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static WebDriver driver = null;
	public final String AMAZON_URL = "https://www.amazon.com.au";
	public final String FB_URL = "";
	public final String CHROME_PATH = "E:\\Education_Profession\\Test Learning\\Development\\Test Development\\Selenium\\Projects Support Files\\chromedriver_win32\\chromedriver.exe";

	// launch browser
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", CHROME_PATH);
			// Create driver object
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			// page synchronization
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			// get url
			driver.get("https://www.amazon.com.au");

			// call get commands 
			getCommands();

			// Call search book method
			searchBook();

			// Today deal
			todayDeal();

			//driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Click Today's deal tap
	 */
	private void todayDeal() {
		try {
			driver.findElement(By.linkText("Today's Deals")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Fetch website information
	 */
	private void getCommands() {
		try {
			String titleOfPAge = driver.getTitle();
			System.out.println("Titile of the page is " + titleOfPAge);
			String url = driver.getCurrentUrl();
			System.out.println("Current URL is:" + url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Search for the book
	 */
	private void searchBook() {
		//type java in the search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click search button
		driver.findElement(By.className("nav-input")).click();
	}
	 
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// create object
		LaunchBrowser browser = new LaunchBrowser();
		browser.invokeBrowser();
		
	}

}
