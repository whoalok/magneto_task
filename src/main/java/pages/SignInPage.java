package pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WindowType;

import utils.Xpath;

public class SignInPage extends BasePage {
	
	FileReader reader;
	Properties prop;
	
	 public SignInPage() throws IOException {
	    	super();
	        reader = new FileReader("src\\test\\java\\Resources\\Environment\\commonData");
	        prop = new Properties();
	        prop.load(reader);
	        
	    }
	 
	 public SignInPage open_sign_in_page() {
		 driver.switchTo().newWindow(WindowType.TAB);
	    	driver.get(prop.getProperty("sign_in_url"));
	    	return this;
	    	
	    }
	 public SignInPage click_Sign_in() {
	    	e_click(Xpath.sign_in_page,"sign In");
	    	return this;
	    	
	    }
	 public SignInPage enter_email() {
		 e_sendKeys(Xpath.sign_in_email,prop.getProperty("email"),"email");
	    	return this;
	    }
	 public SignInPage enter_password() {
		 e_sendKeys(Xpath.sign_in_password,prop.getProperty("password"),"password");
	    	return this;
	    	
	    }
	 public SignInPage click_sign_in_button() {
	    	e_click(Xpath.signin_button,"sign In");
	    	return this;
	    	
	    }
	 
	 
	 

}
