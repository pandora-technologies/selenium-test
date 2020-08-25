package main;

import org.apache.commons.mail.EmailException;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginEmail {
	
	
	 public void LoginTest() throws EmailException, InterruptedException  {
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo PC\\Desktop\\chromedriver.exe");  
	     WebDriver browser = new ChromeDriver();
	     browser.get("https://www.google.com/");
	     
	     Thread.sleep(10000);
	     browser.quit();
	} 
}
