package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("User is on the login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    System.out.println("User enters user name and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println("User click submit button");
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
	    System.out.println("System naviagtes to the home page");
	}
}
