package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAbsolute {
	
ChromeDriver driver;
@Before
public void setup()
{
   driver=new ChromeDriver();
   driver.get("https:/facebook.com");
}
@Test
public void test()
{
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("radhu@gmail.com");
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("radhu123");
    //driver.findElement(By.xpath("")).click();
}

}
