package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("Step 1: User is on login page.");
	}

	@When("user enters name1 and pass1")
	public void user_enters_name1_and_pass1() {
		
		System.out.println("Step 2: user enters username and password.");

	}
	

	@And("clicks login button")
	public void clicks_login_button() {

		System.out.println("Step 3: User clicks login button.");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		System.out.println("Step 4: user is navigated to home page.");
	}

}
