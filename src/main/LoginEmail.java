package main;

import org.apache.commons.mail.EmailException;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginEmail {
	
	@Test
	 public void LoginTest() throws EmailException, InterruptedException  {
	
		 String chromeDriverPath = "/usr/bin/chromedriver";
		 System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		 
		 WebDriver browser = new ChromeDriver();
	     browser.get("https://www.google.com/");
	     
	     Thread.sleep(10000);
	     browser.quit();
	} 
}
