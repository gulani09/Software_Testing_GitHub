package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class LoginPageFactorySteps {

	WebDriver driver = null;
	LoginPage login = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "E:\\Education_Profession\\Test Learning\\Development\\Test Development\\Selenium\\Projects Support Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}

	@And("User is on login page")
	public void user_is_on_google_search_page() {
		driver.get("https://example.testproject.io/web/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_a_text_in_search_box(String name, String password) {
		
		login = new LoginPage(driver);
		login.enterUserName(name);
		login.enterPassword(password);
		/*
		 * driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		 */
	}

	@And("Click login button")
	public void click_search_button() throws InterruptedException {
		Thread.sleep(3000);
		
		login.clickLogin();
		/*
		 * //driver.findElement(By.xpath("//class[@id='login']")).click(); WebElement
		 * element = driver.findElement(By.xpath("//class[@id='login']"));
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("arguments[0].click();", element);
		 */
		
	}

	@Then("User should be navigated to the home page")
	public void user_should_be_navigated_to_the_search_results() {
		/* driver.getPageSource().contains("logout"); */
		login.validatePage();
	}
}
