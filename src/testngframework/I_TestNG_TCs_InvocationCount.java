package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class I_TestNG_TCs_InvocationCount {
	WebDriver driver;

	@Test
	public void zomato() {
    driver.get("https://www.zomato.com"); 
	}
    
    @Test(invocationCount=5)
	public void facebook() {
	driver.get("https://www.facebook.com");
    }

	@Test
	public void google() {
	driver.get("https://www.google.com");
    }
	
	@Test(invocationCount=4)
	public void twitter() {
	driver.get("https://www.x.com");
	}
	
	@Test
	public void selenium() {
	driver.get("https://www.selenium.dev");
	}
	
	@Test
	public void gmail() {
	driver.get("https://www.gmail.com");
	}

	@BeforeTest
	public void beforeTest() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	}
	

}


  
