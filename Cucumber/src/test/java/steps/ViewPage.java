package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewPage {
	
	@Given("User is on the home page.")
	public void user_is_on_the_home_page() {
	    
		System.out.println("Step 1: User is on the home page.");
	}

	@And("scrolls down to new arrivals.")
	public void scrolls_down_to_new_arrivals() {
	    
		System.out.println("Step 2: scrolls down to new arrivals.");
	}

	@When("user clicks on the blouse.")
	public void user_clicks_on_the_blouse() {
	    
		System.out.println("Step 3: user clicks on the blouse.");
	}

	@Then("a detailed view of the blouse is displayed.")
	public void a_detailed_view_of_the_blouse_is_displayed() {
	    
		System.out.println("Step 4: a detailed view of the blouse is displayed.");
	}

}
