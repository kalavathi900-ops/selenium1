package firstprograminjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLocators {
	static WebDriver driver;

	@BeforeClass
	static void setUpBeforeClass() throws Exception {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test
	void idnameclassname() throws InterruptedException {

		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.id("user-login")).sendKeys("Kalavathi");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys("Nandhana");
		Thread.sleep(2000);
		driver.findElement(By.className("wp-login-lost-password")).clear();
		}
	
	@Test
	void cssSelectorLocator() throws InterruptedException {
		
	driver.get("https://www.techlearn.in/admin");
	Thread.sleep(2000);
	
    driver.findElement(By.cssSelector("#user_login")).sendKeys("Nandhana");
    		
   //
    driver.findElement(By.cssSelector("input#user_login")).sendKeys("Nandhana");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".wp-login-lost-possword")).click(); 
	//
  
	driver.findElement(By.cssSelector("a.wp-login-lost-possword")).click();
	
	}
}









