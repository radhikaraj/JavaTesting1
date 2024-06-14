package TestNGpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	@BeforeMethod
	public void browsersetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.perform();
		String text=drop.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("Text verification successfull");
		}
		else
		{
			System.out.println("Unsuccessfull");
		}
	}
	
}
