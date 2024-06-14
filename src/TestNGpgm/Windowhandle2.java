 package TestNGpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Windowhandle2 {
//open new tab introdused in selenium 4

	WebDriver driver;
	@BeforeMethod
	public void browsersetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
	//open in new tab
	//WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
	
	//open in new window
	WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
	driver1.get("https://www.google.com");
	}
}
