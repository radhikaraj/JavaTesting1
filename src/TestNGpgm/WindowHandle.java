package TestNGpgm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandle {

	WebDriver driver;
	@BeforeMethod
	public void browsersetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window title is "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		
	}
}
