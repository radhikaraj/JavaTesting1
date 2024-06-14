package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorDemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();        //ELEMENT NOT INTERACTABLE EXCEPTION:so we use keys.Enter
	}


	

}
