package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsMethod {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	   driver=new ChromeDriver();
	   driver.get("https://facebook.com");
	   driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
        //for dynamic attribute //*[contains(@attribute,'value')]
		//login button of facebook
	    driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		
		//sing chropath plugin directly find xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("radhu@gmail.com");
		
		//by right click inspected attribute and select copy real xpath
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("radhu123");
		
	}

}
