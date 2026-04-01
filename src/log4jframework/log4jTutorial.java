package log4jframework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class log4jTutorial {
	WebDriver driver;

  @Test
  public void techlearnlogin() {
	  
	  Logger log= Logger.getLogger("Login Module");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver();
	  log.info("Chrome browser Lunched");
	  
	  driver.manage().window().maximize();
	  log.info("Browser window maximize");
	  
	  driver.get("https://www.techlearn.in/admin");
	  log.info("Navigete to the Techlearn Login page");
	  
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Nandhana");
	  log.info("Entered the username kalavathi");
	  
	  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@123");
	  log.info("Entered the Password Test@123");
	  
	  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	  log.info("Remember me check box is Selected");
	    
	  
  }
}

  
  
  
  
  