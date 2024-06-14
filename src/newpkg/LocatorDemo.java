package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://blazedemo.com/register");
	
}
@Test
//values are passing to the registration form
public void test()
{
	driver.findElement(By.id("name")).sendKeys("radhika");
	driver.findElement(By.name("company")).sendKeys("Luminar");
	driver.findElement(By.id("email")).sendKeys("radhika@gmail.com");
	driver.findElement(By.id("password")).sendKeys("radhu123");
	driver.findElement(By.name("password_confirmation")).sendKeys("radhu123");
	
}

}
