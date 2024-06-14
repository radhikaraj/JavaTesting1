package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelative {
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
		// syntax of xpath: //tagname[@attribute="value"]
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("radhu@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("radhu123");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}

}
