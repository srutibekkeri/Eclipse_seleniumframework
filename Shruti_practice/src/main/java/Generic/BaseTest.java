package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConstants{
	public static WebDriver driver;
	//ReadConfig readconfig;
	static
	{
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	
	//@Parameters({"Browser"})
	@BeforeMethod
	public static void openApplication() throws IOException
	{
		//if(br.equals("chrome"))
		//{
			//readconfig = new ReadConfig();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/displayEmployeeReportCriteria");
		}
	 
	
	
	
	public void closeApplication()
	{
		driver.close();
	}
	
	

}
