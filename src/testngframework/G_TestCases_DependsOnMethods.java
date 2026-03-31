package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class G_TestCases_DependsOnMethods {

	WebDriver driver;

	@Test(dependsOnMethods="method2")
	public void method1() {
	driver.findElement(By.id("user_login")).sendKeys("Techlearn");
	driver.findElement(By.name("pwd")).sendKeys("Test@12345");
	driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	}
	
	@Test
	public void method2() {
		driver.get("https://www.techlearn.in/admin");
	}

	@BeforeTest
	public void beforeTest() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	

}
