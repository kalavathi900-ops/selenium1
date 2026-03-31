package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class D_TestNG_TCs_Execution_Priority_Order {

	WebDriver driver;

	@Test(priority=1)
	public void zomato() {
    driver.get("https://www.zomato.com"); 
	}
    
    @Test(priority=2)
	public void facebook() {
	driver.get("https://www.facebook.com");
    }

	@Test(priority=0)
	public void google() {
	driver.get("https://www.google.com");
    }
	
	@Test(priority=3)
	public void twitter() {
	driver.get("https://www.x.com");
	}
	
	@Test(priority=5)
	public void selenium() {
	driver.get("https://www.selenium.dev");
	}
	
	@Test(priority=4)
	public void gmail() {
	driver.get("https://www.gmail.com");
	}

	@BeforeTest
	public void beforeTest() {
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	}
	

}
