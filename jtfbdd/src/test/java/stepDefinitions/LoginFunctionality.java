package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginFunctionality {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("In Given Block");
	}

	@When("user enter userame and password")
	public void user_enter_userame_and_password() {
		System.out.println("In When Block");

	}

	@And("press login button")
	public void press_login_button() {
		System.out.println("In And Block");

	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("In Then Block");

	}

}
