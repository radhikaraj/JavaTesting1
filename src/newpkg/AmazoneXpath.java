package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneXpath {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();//to maximize window
	    driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]")).click();
		driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("radhika#");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.navigate().back();//to click back button
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
     	driver.findElement(By.xpath("//a[@href=\"/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3\"]")).click();
	    driver.findElement(By.xpath("//i[@class=\"hm-icon nav-sprite\"]")).click();
		
	}
}
