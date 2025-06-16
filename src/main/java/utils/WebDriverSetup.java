//package utils;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//
//import config.Config;
//
//public class WebDriverSetup {
//    public static WebDriver driver;
//
//    /**
//     * Initializes and returns a WebDriver instance based on the browser specified in Config.
//     * Uses WebDriverManager to handle driver binaries automatically.
//     *
//     * @return Initialized WebDriver instance.
//     */
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
//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    FirefoxOptions firefoxOptions = new FirefoxOptions();
//                    firefoxOptions.addArguments("--start-maximized");
//                    // Optional: firefoxOptions.addArguments("--headless"); // Run in headless mode
//                    driver = new FirefoxDriver(firefoxOptions);
//                    break;
//                default:
//                    throw new IllegalArgumentException("Unsupported browser: " + browser);
//            }
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Config.IMPLICIT_WAIT_TIME));
//        }
//        return driver;
//    }
//
//    /**
//     * Quits the WebDriver instance if it's not null.
//     */
//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null; // Reset driver to null for the next scenario
//        }
//    }
//}
