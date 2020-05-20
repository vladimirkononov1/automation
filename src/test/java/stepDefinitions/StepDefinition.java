package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("User is on NetBanking page now");
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home Page is opened");
	}

	@Then("Cards displayed are {string}")
	public void cards_are(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Are cards displaying? " + string + "\n");
	}

}