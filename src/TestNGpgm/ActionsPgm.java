package TestNGpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsPgm {
WebDriver driver;
@BeforeMethod
public void browsersetup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test1()
{
	WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	fullname.sendKeys("Radhika");
	WebElement rediffId=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	//Object created for Actions class
	Actions act=new Actions(driver);
	//to select fullname
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	//To copy fullname
	act.keyDown(fullname, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	//to paste to reddifid
	act.keyDown(rediffId, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	
	//to perform actions
	act.build().perform();
	act.perform();
	
	
}
}