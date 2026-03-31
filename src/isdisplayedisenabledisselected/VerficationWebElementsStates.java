package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerficationWebElementsStates {
	WebDriver driver;
	
  @Test
  public void isDisplayedMethod() {
	 driver.get("https://www.techlearn.in/admin");

  boolean lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();
  
  if(lyp==true)
  {  
	  System.out.println("Last your password link is displayed the click on forgot password page");
        driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click(); 
  }
  else
  {
	  System.out.println("Lost your password link is NOT displayed to the click on forgot password page");
  }

  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
