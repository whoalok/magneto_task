package pages;

import config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
	
    public static WebDriver driver;
    public static WebDriverWait wait;

        public BasePage() {
        	this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
	}


		public void goToUrl(String url) {
        driver.get(url);
    }

    
    public WebElement findElement(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (org.openqa.selenium.TimeoutException e) {
            System.err.println("Error: Element not found with locator " + locator + " within timeout. " + e.getMessage());
            throw new NoSuchElementException("Element not found with locator: " + locator);
        }
    }

    public void e_click(By creatAnAccount,String nameofWebElement) {
        wait.until(ExpectedConditions.elementToBeClickable(creatAnAccount)).click();
    }
    public void e_sendKeys(By firstName,String input, String nameofWebElement) {
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys(input);
    }
    
    public String getElementText(By locator) {
        return findElement(locator).getText();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    
    public boolean isElementDisplayed(By locator) {
        try {
            return findElement(locator).isDisplayed();
        } catch (NoSuchElementException | org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }

   
    public void waitForUrlContains(String urlPart) {
        try {
            wait.until(ExpectedConditions.urlContains(urlPart));
        } catch (org.openqa.selenium.TimeoutException e) {
            System.err.println("Error: URL did not contain '" + urlPart + "' within the timeout. " + e.getMessage());
            throw e;
        }
    }
}