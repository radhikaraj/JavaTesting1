package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BlazeLogin;



public class BlazeLoginTest {
WebDriver driver;
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://blazedemo.com/login");
}
@Test
public void testlogin()
{
	BlazeLogin ob=new BlazeLogin(driver);
	ob.setvalues("abc@gmail.com","abcd");
	ob.login();
}
}
