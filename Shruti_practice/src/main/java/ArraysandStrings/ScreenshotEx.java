package ArraysandStrings;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotEx {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","/Users/abhaymanoli/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.softwaretestingo.com/selenium-tricky-interview-questions/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("/Users/abhaymanoli/Desktop/Automtion Framework/ScreenShot/tricky.png");
	try {
		FileUtils.copyFile(source, destination);
	}
	catch(Exception e)
	{
		System.out.println("exception");
	}
	
	
}
}
