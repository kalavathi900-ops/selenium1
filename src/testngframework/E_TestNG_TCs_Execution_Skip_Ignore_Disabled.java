package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class E_TestNG_TCs_Execution_Skip_Ignore_Disabled {

	WebDriver driver;

	@Test(priority=1,enabled=true)
	public void zomato() {
    driver.get("https://www.zomato.com"); 
	}
    
    @Test(priority=2)
	public void facebook() {
	driver.get("https://www.facebook.com");
    }

	@Test(priority=0,enabled=false)
	public void google() {
	driver.get("https://www.google.com");
    }
	
	@Test(priority=3)
	public void twitter() {
	driver.get("https://www.x.com");
	}
	@Ignore
	@Test(priority=4)
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
