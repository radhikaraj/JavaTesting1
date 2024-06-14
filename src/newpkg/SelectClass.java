package newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

	}
	@Test
	public void test()
	{   //drop down value passing 
		//select is a class, in- order to access the class we need to create object
		//Passing value to day field of select class as value
	 WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
     Select day=new Select(dayelement);
     day.selectByValue("02");
       //passing value to month field as index .index 4 means APR(index means 0-month,1-jan,2-feb,3-mar,4-apr)
     WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
     Select month=new Select(monthelement);
     month.selectByIndex(4);
     //passing value to year field as text 
     WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
     Select year=new Select(yearelement);
     year.selectByVisibleText("2024");
     
     
     
     
}
}