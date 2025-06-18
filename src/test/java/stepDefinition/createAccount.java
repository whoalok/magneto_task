package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.CreateAccountPage;

public class createAccount extends BasePage {
	
	CreateAccountPage CAP = new CreateAccountPage();
	
	 public createAccount() throws IOException {
	        super(); 
	    }
	
	
	@Given("I am on the Magento home page")
	public void i_am_on_the_magento_home_page() {
		CAP.open_sign_up_page();
		
	  
	    
	}

	@When("I navigate to the Create New Customer Account page")
	public void i_navigate_to_the_create_new_customer_account_page() {
		
//		CAP.click_Create_an_account();
	 
	   
	}

	@When("I fill in all required valid details")
	public void i_fill_in_all_required_valid_details() {
		CAP.enter_firstname().enter_lastname().enter_email().enter_password().enter_confirm_password();
	   
	}

	@When("I click the Create an Account button")
	public void i_click_the_create_an_account_button() {
	  CAP.click_create_account_button();
	}

	@Then("I should see a success message")
	public void i_should_see_a_success_message() {
		CAP.sign_out();
	    
	}

	@Then("I should be logged in to my account and see my name")
	public void i_should_be_logged_in_to_my_account_and_see_my_name() {
	  
	}

}
