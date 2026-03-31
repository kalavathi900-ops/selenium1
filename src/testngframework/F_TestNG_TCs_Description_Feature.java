package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class F_TestNG_TCs_Description_Feature {

	WebDriver driver;

	@Test(description="Zomato Application")
	public void testcase1() {
    driver.get("https://www.zomato.com"); 
	}
    
    @Test(description="facebook Application")
	public void testcase2() {
	driver.get("https://www.facebook.com");
    }

	@Test(description="google Aplication")
	public void testcase3() {
	driver.get("https://www.google.com");
    }
	
	@Test(description="twitter Application")
	public void testcase4() {
	driver.get("https://www.x.com");
	}
	@Ignore
	@Test(description="selenium Application")
	public void testcase5() {
	driver.get("https://www.selenium.dev");
	}
	
	@Test(description="gmail Application")
	public void testcase6() {
	driver.get("https://www.gmail.com");
	}

	@BeforeTest
	public void beforeTest() {
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	}
	

}
