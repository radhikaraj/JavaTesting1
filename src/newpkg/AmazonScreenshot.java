package newpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class AmazonScreenshot {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	 driver=new ChromeDriver();
	driver.get("https://amazon.in");
	}
	@Test
	public void test() throws IOException
	{
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("D://amazon.png"));

	}
}
