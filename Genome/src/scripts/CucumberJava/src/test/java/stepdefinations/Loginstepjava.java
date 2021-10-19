package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepjava {


	@Given("user is a login page")
	public void user_is_a_login_page() {

System.out.println("login page");
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		
		System.out.println("user name");
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("login button");
	}

	@Then("user navigate to the homepage.")
	public void user_navigate_to_the_homepage() {

		System.out.println("user navigate to homepage");
	}


}
