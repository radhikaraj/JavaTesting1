package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffXpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	   driver=new ChromeDriver();
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	   driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Radhika");
		
		driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("radhu");
		driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
	}

}
