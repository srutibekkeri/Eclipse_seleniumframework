package ArraysandStrings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertest {
	WebDriver driver;
	
@BeforeTest
@Parameters("browser")

public void setup(String browser)
{
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","/Users/abhaymanoli/geckodriver");
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	else if(browser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","/Users/abhaymanoli/chromedriver");
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}


@Test
public void testparameter()
{
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("fruits");
}
}
