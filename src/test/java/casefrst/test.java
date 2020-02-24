package casefrst;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
	@Given("user navigates to registration page")
	public void user_navigates_to_registration_page() { 
		System.out.println("registration page");
	}

	@Given("user enters username")
	public void user_enters_username() {
	    System.out.println("username" );
	}

   @Given("user enters firstname")
   public void user_enters_firstname() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("firstname");
    }

	@Given("user enters lastname")
	public void user_enters_lastname() {
		System.out.println("lastname");
	}

	@Given("user enters password")
	public void user_enters_password() {
		System.out.println("password");
	}

	@Given("user enters confirm password")
	public void user_enters_confirm_password() {
		System.out.println("cofirm password");
	}

	@Given("user enters gender")
	public void user_enters_gender() {
		System.out.println("gender");
	}

	@Given("user enters email")
	public void user_enters_email() {
		System.out.println("email");
	}

	@Given("user enters mobile number")
	public void user_enters_mobile_number() {
		System.out.println("mobile number");
	}

	@Given("user enters DOB")
	public void user_enters_DOB() {
		System.out.println("DOB");
	}

	@Given("user enters address")
	public void user_enters_address() {
		System.out.println("ADDRESS");
	}

	@Given("user enters security question")
	public void user_enters_security_question() {
		System.out.println("security question");
	}

	@Given("user enters answer")
	public void user_enters_answer() {
		System.out.println("answer");
	}

	@When("user clicks on register")
	public void user_clicks_on_register() {
		System.out.println("register");
	}

	@Then("displays homepage")
	public void displays_homepage() {
	
	}


}
