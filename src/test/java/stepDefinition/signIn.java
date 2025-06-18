package stepDefinition;

import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.SignInPage;

public class signIn extends BasePage{
	
	SignInPage SIP = new SignInPage();
	
	 public signIn() throws IOException {
	        super(); 
	    }
	 @Given("I have an existing registered account")
	 public void i_have_an_existing_registered_account() {
	
	 }
	
	
	@When("I navigate to the Sign In page")
	public void i_navigate_to_the_sign_in_page() {
		SIP.open_sign_in_page();
	}
	

	@When("I enter valid registered Email and Password")
	public void i_enter_valid_registered_email_and_password() {
		SIP.enter_email().enter_password();
	}
	@When("I click the Sign In button")
	public void i_click_the_sign_in_button() {
	   SIP.click_sign_in_button();
	}
	@Then("I should be logged in to my account")
	public void i_should_be_logged_in_to_my_account() {
	  
	}
	@Then("I should see a welcome message with my name")
	public void i_should_see_a_welcome_message_with_my_name() {
	   
	}
	

}
