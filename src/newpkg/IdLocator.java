package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
	}
	@Test
	public void test()
	{
	driver.findElement(By.id("email")).sendKeys("radhu@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("rad123");
	driver.findElement(By.name("login")).click();  //here login button have dynamic id attribute so we locate using name122w
	}

	
	
	

}
