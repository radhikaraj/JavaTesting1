package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Fblogin;


public class Fblogintest1 {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		
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
		Fblogin ob=new Fblogin(driver);
		ob.setvalues("abc@gmail.com","abcd");
		ob.login();
	}
}
