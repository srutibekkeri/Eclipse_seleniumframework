package Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.Sign_in_page;

public class Test1_Signin extends  BaseTest{
	



@Test
public void signin1() throws IOException
{
	Sign_in_page sign = new Sign_in_page(driver);
	 sign.enterUS("Admin");
	 sign.enterPW("admin123");
	 sign.enterSubmit();
}
}