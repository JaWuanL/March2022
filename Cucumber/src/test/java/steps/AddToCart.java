package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	
	@Given("User starts on the home page.")
	public void user_starts_on_the_home_page() {
	    
		System.out.println("Step 1: User starts on the home page.");
	}

	@When("user hovers on the blouse.")
	public void user_hovers_on_the_blouse() {
	    
		System.out.println("Step 2: User hovers on the blouse.");
	}

	@And("user clicks on add to cart button.")
	public void user_clicks_on_add_to_cart_button() {
	    
		System.out.println("Step 3: User clicks on add to cart button.");
	}

	@Then("Blouse is added to the cart.")
	public void blouse_is_added_to_the_cart() {
	    System.out.println("Step 4: Blouse is added to the cart.");
	}

}
