package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FbloginpagePOM;

public class Fblogintest {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
	    //ChromeOptions options=new ChromeOptions()	;
		//options.addArguments("---remote-allow---origins=*");
		//driver=new ChromeDriver(Options);
		
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testlogin()
	{
		FbloginpagePOM ob=new FbloginpagePOM(driver);
		ob.setvalues("abc@gmail.com","abcd");
		ob.login();
	}
}
