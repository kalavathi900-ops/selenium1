package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class C_TestNG_TCs_Execution_Alphabatical_Order {

	WebDriver driver;

	@Test
	public void zomato() {
    driver.get("https://www.zomato.com"); 
	}
    
    @Test
	public void facebook() {
	driver.get("https://www.facebook.com");
    }

	@Test
	public void google() {
	driver.get("https://www.google.com");
    }

	@BeforeTest
	public void beforeTest() {
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	}
	

}
