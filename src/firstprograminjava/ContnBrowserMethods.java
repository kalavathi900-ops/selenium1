package firstprograminjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContnBrowserMethods {

	public static void main(String[] args)throws Exception{
   
   WebDriver Driver = new ChromeDriver();
	
   Driver.manage().window().minimize();
		
	Thread.sleep(3000);
	
	Driver.manage().window().minimize();
	
	Driver.manage().window().fullscreen();
	
	Driver.close();
	Driver.quit();
	
	
	
	

	}

}
