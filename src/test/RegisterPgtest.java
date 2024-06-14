package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.RegisterPg;

public class RegisterPgtest {
//assignmt1:https://blazedemo.com/register
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testlogin()
	{
		RegisterPg ob=new RegisterPg(driver);
		ob.setvalues("radhika", "luminar", "rad@gmail.com", "rad123", "rad123");
		ob.register();
	}
}

