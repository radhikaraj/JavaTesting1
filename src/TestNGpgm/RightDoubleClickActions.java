package TestNGpgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightDoubleClickActions {
	WebDriver driver;
	@BeforeMethod
	public void browsersetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1()
	{ 
		//open site.right click. instead of inspect cntl+shift+i,Select element icon click and copy xpath.
		//Right click,click edit,handle alert
		Actions act=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
       act.contextClick(right).perform();
  
       driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
       Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		 
		//double click and handle alert
				WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			  act.doubleClick(doubleclick).perform();
			  Alert b=driver.switchTo().alert();
				System.out.println(b.getText());
			  b.accept();
        
		
		
		
		
	}
}
