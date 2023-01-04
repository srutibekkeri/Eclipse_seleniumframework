package ArraysandStrings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class deltecookiesEx {
	static WebDriver driver;
public static void main(String[] args) {
	
	//DesiredCapabilities capabilities = new DesiredCapabilities();
	//capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
	
	 ChromeOptions handlingSSL = new ChromeOptions();
	 handlingSSL.setAcceptInsecureCerts(true);
	
	System.setProperty("webdriver.chrome.driver", "/Users/abhaymanoli/chromedriver");
	 driver = new ChromeDriver(handlingSSL);
	 driver.get("https://expired.badssl.com/");
	 driver.manage().window().maximize();
	 System.out.println(driver.getTitle());
	// driver.manage().deleteAllCookies();
	// driver.manage().deleteCookieNamed(name);
}
}
