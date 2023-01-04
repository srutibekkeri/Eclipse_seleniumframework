package ArraysandStrings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geckotest {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","/Users/abhaymanoli/geckodriver");
	 driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("fruits");
}
}


