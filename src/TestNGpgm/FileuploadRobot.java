package TestNGpgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileuploadRobot {

	WebDriver driver;
	@BeforeMethod
	public void browsersetup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		//new method 
	}
	@Test
	public void test1() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileUpload("file:///E:/SEEFIT%20OPTICALS%20PDF%20(1).pdf");
	}
	private void fileUpload(String p) throws AWTException 
	{
		//to copy path to clipboard
		//Stringselection class in awt package
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		//To paste to system window
		Robot robot=new Robot();
		robot.delay(3000); //in robot class we use delay instead of wait
		
		//cntrl v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}
