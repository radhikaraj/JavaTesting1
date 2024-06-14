package TestNGpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadBySendkeys {
	WebDriver driver;
	@BeforeMethod
	public void browsersetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	//Here file upload done using text feild.By sendkeys(path)
	@Test
	public void test1()
	{
		WebElement path= driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		path.sendKeys("E:\\SEEFIT OPTICALS PDF (1).pdf");
			
		
		//click submit
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();	
		}

}
