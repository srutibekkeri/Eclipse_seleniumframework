package POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseTest;
import Generic.ReadConfig;

public class Sign_in_page extends BaseTest{
	WebDriver driver;
	
	
	@FindBy(name="username")
	WebElement user1;
	
	
	@FindBy(name="password")
	WebElement pass1;
	
	
	@FindBy(how=How.XPATH, using="//button[@type='submit")
	WebElement submit;

	
	public Sign_in_page(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
}
	
	public void enterUS( String userName)
	{
		 user1.sendKeys(userName);
	}
	
	public void enterPW( String password1)
	{
		 pass1.sendKeys(password1);
	}
	
	public void enterSubmit()
	{
		submit.click();
	}
	
}
