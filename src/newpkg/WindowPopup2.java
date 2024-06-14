package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup2 {
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
		//driver.switchTo().alert().accept();
		//After clicking ok in the alert box we want to get the text in alert and verify with expected
		//in norder to do multiple activities we store this to a reference of interface
		
		
		Alert a=driver.switchTo().alert();	
		String actual=a.getText();
		System.out.println(actual);
		String exp="Hello! I am an alert box!!";
		if(actual.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{ 
			System.out.println("Fail");
		}
		a.accept();
		//after do activities we accept
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Radhika");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("C");
	}
}
