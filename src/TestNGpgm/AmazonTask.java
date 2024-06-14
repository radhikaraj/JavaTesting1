/*Question:
 1.Open amazon.in
 2.Search 'mobile phones in search field
 3.Verify the title using assertion
 4.Click First phone details 
 5.Click add to cart
 6.Select cart
 */
package TestNGpgm;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AmazonTask {
	WebDriver driver;
	@BeforeMethod
	public void browsersetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	

	@Test
	public void test1()
	{
		String parentWindow=driver.getWindowHandle();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("mobile phones",Keys.ENTER);
		
	    //Title verification
		 String actual=driver.getTitle();
		 String expected="Amazon.in : mobile phones";
		 Assert.assertEquals(expected, actual);
		 System.out.println(actual);
		 
		 //Click first phone detail
		 JavascriptExecutor jss=(JavascriptExecutor) driver;
		 jss.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")));
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		 
		 //Window handle
		 Set<String>allwindow=driver.getWindowHandles();
		 
		 for(String handle:allwindow)
		 {
			 if(!handle.equalsIgnoreCase(parentWindow))
			 {
				 driver.switchTo().window(handle);
				 //add to cart
				 JavascriptExecutor js=(JavascriptExecutor) driver;
				 
				 js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")));			
				 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
			   
				 driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
			     driver.close();			
             }
			 driver.switchTo().window(parentWindow);
		 }
		 
	}
	
		
}
