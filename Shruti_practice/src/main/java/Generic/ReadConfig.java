package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig() throws IOException
	{
		File src = new File("/Users/abhaymanoli/eclipse-workspace/Shruti_practice/configuaration/config.properties");
		FileInputStream file11 = new FileInputStream(src);
		 pro = new Properties();
		pro.load(file11);
	}
	
	
	
	
	public String getURL()
	{
		String BaseURl = pro.getProperty("Url");
		return BaseURl;
	}
	
	public String getUserName()
	{
		String UserName = pro.getProperty("Username");
		return UserName;
	}
	public String getPassWord()
	{
		String PassWord = pro.getProperty("Password");
		return PassWord;
	}
}
