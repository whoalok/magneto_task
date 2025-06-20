package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import pages.BasePage;



public class Xpath extends BasePage {
	
	FileReader reader;
	Properties prop;

   public Xpath() throws IOException {
	   
	   reader = new FileReader("src\\test\\java\\Resources\\Environment\\commonData");
	    prop = new Properties();
	    prop.load(reader);
	    
   }
   
//   ---------------------------------------create an account page-------------------------------------------------------
   public static final By create_an_account_page = By.xpath("//div[@class='panel wrapper']//ul//li//a[text()='Create an Account']");
   public static final By first_name = By.xpath("//input[@id='firstname']");
   public static final By last_name = By.xpath("//input[@id='lastname']");
   public static final By email_address = By.xpath("//input[@id='email_address']");
   public static final By password = By.xpath("//input[@id='password']");
   public static final By confirm_password = By.xpath("//input[@id='password-confirmation']");
   public static final By create_an_account_button = By.xpath("//button//span[text()='Create an Account']");
   
//   --------------------------------------------Sign_in page----------------------------------------------
   
   public static final By sign_in_page = By.xpath("(//div[@class='panel wrapper']//ul//li//a)[2]");
   public static final By sign_in_email = By.xpath("//input[@id='email']");
   public static final By sign_in_password = By.xpath("//input[@name='login[password]']");
   public static final By signin_button = By.xpath("//button[contains(@class, 'login') and contains(@class, 'primary')]");
   
   public static final By dropdown = By.xpath("//span[@class='customer-name']//button");
   public static final By Sign_out = By.xpath("   (//div[@class='customer-menu']//li[@class='authorization-link']//a[contains(text(), 'Sign Out')])[1]");
   

 
   
   
 
 
   
   
 
   
	
	
	

}
