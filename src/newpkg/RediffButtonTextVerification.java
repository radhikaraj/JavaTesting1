package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffButtonTextVerification {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

}
@Test
public void test()
{
WebElement button=driver.findElement(By.xpath("//input[@id='Register']"));
String b=button.getAttribute("value");
System.out.println(b);
String expected="Create my account >>";
if(b.equalsIgnoreCase(expected))
{
		System.out.println("pass");
}
else
{
	System.out.println("fail");
}
}
}
