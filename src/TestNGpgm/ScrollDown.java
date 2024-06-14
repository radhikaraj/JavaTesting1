package TestNGpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollDown {
	WebDriver driver;
	@BeforeMethod
	public void browsersetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	 //To scroll down using javascriptexecuter by defining the pixel syntax
     // js.executeScript("window.scrollBy(0,1000)", "");
		
	//scroll down using javascriptexecuter until an element is visible.Here up to privacy policy .
		//js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")));
		
    //scroll down using javascriptexecuter  to the bottom of page 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();
	}
}
