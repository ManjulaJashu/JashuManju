package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Parallel {
	
	//WebDriver driver;
	//@Parameters("browser")
	@Test
	public void setUp() throws  InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
	
	}
	//@Parameters("browser")
	@Test
	public void setDown() throws  InterruptedException
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver1.get("https://www.google.com");
		Thread.sleep(5000);
		driver1.close();
	}

}

