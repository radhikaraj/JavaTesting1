package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {
 //Alert box,confirm box,prompt box
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Test
	public void test()
	{
	 //Alert box
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		driver.switchTo().alert().accept();
		
	//Confirm box
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		
	//Prompt box
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	//First approach to handle prompt box
		
		driver.switchTo().alert().sendKeys("Radhu");
		driver.switchTo().alert().accept();
		
	//Second approach to handle prompt box
	/*Alert prompt=driver.switchTo().alert();
	prompt.sendKeys("pramod");
	prompt.accept();*/
		
		
		
	}
}
