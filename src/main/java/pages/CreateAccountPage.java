package pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import static LogsAndReports.Logs.Log;

//import jdk.internal.org.jline.utils.Log;
import utils.Xpath;

public class CreateAccountPage extends BasePage {
	
	FileReader reader;
	Properties prop;
   
    public CreateAccountPage() throws IOException {
    	super();
        reader = new FileReader("src\\test\\java\\Resources\\Environment\\commonData");
        prop = new Properties();
        prop.load(reader);
        
    }
    
    public CreateAccountPage open_sign_up_page() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	driver.get(prop.getProperty("sign_up_url"));
    	return this;
    	
    }
    public CreateAccountPage click_Create_an_account() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	 wait.until((ExpectedCondition<Boolean>) wd ->
         ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
     );
    	e_click(Xpath.create_an_account_page,"create an account");
    	
    	return this;
    	
    }
    public CreateAccountPage enter_firstname() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	e_sendKeys(Xpath.first_name,prop.getProperty("firstname"),"firstname");
    	return this;
    }
    public CreateAccountPage enter_lastname() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	e_sendKeys(Xpath.last_name,prop.getProperty("lastname"),"lastname");
    	return this;
    }
    public CreateAccountPage enter_email() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	e_sendKeys(Xpath.email_address,prop.getProperty("email"),"email");
    	return this;
    }
    public CreateAccountPage enter_password() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	e_sendKeys(Xpath.password,prop.getProperty("password"),"password");
    	return this;
    }
    public CreateAccountPage enter_confirm_password() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	e_sendKeys(Xpath.confirm_password,prop.getProperty("confirm_password"),"confirm_password");
    	return this; 
    }
    public CreateAccountPage click_create_account_button() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	e_click(Xpath.create_an_account_button,"create an account");
    	return this;
    }
    
    public CreateAccountPage sign_out() {
    	Log.info("function_name---------------------->" +new Object(){}.getClass().getEnclosingMethod().getName());
    	e_click(Xpath.dropdown,"drop_down");
    	e_click(Xpath.Sign_out,"sign_out");
    	
    	return this;
    }
    
    
 
}