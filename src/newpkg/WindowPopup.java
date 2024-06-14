package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {
ChromeDriver driver;
	//To handle the pop up
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///E:/seleniumWorks/alert.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();//without handle alert can't send values to firstname,lastname
		//Click ok in alert box 
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Radhika");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("C");
	}
}
