package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class H_TestCases_TimeOut_Feature {
	WebDriver driver;


	@Test
	public void techlearnlogin() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("Techlearn");
		driver.findElement(By.name("pwd")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"backtoblog\"]/a")).click();
	}
	
	@Test(timeOut=8000)
	public void hellowtealogin() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("hellowtea");
		driver.findElement(By.name("pwd")).sendKeys("Admin@12345");
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"backtoblog\"]/a")).click();

	}

		@BeforeTest
		public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	}


