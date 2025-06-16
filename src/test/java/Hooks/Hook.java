package Hooks;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import pages.BasePage;

public class Hook extends BasePage {
	public BasePage base;
	
	File file;
	Reader reader;
	Properties prop;
	
	public Hook(BasePage base) throws IOException{
		this.base=base;
		reader = new FileReader("src\\test\\java\\Resources\\Environment\\commonData");
		file = new File("src\\test\\java\\Resources\\Environment\\commonData");
		prop = new Properties();
		prop.load(reader);
	}
	
@Before("@MAG-TC-1")
public void init() {
	base.driver = new ChromeDriver();
	base.driver.manage().window().maximize();
	
}
}
