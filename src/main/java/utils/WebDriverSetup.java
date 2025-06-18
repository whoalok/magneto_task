//package utils;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

//public class WebDriverSetup {
//    public static WebDriver driver;
//    public static WebDriver getDriver() {
//        if (driver == null) {
//            String browser = Config.BROWSER.toLowerCase();
//            switch (browser) {
//                case "chrome":
//                    WebDriverManager.chromedriver().setup();
//                    ChromeOptions chromeOptions = new ChromeOptions();
//                    chromeOptions.addArguments("--start-maximized");
//                    // Optional: chromeOptions.addArguments("--headless"); // Run in headless mode
//                    driver = new ChromeDriver(chromeOptions);
//                    break;
//                default:
//                    throw new IllegalArgumentException("Unsupported browser: " + browser);
//            }
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Config.IMPLICIT_WAIT_TIME));
//        }
//        return driver;
//    }
//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null; // Reset driver to null for the next scenario
//        }
//    }
//}
