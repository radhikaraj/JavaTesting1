package newpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");

	}
	@Test
	public void test()
	{ 
		//date of birth drop down
	 WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
     Select day=new Select(dayelement);
     day.selectByValue("1");
     List<WebElement>d=day.getOptions();//To get Drop down count we use getOption() method
     System.out.println("Day Count= "+d.size());
      
     WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"month\"]"));
     Select month=new Select(monthelement);
     month.selectByIndex(2);//index 2 means march
     List<WebElement>m=month.getOptions();
     System.out.println("Month Count= "+m.size());
     
     WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"year\"]"));
     Select year=new Select(yearelement);
     year.selectByVisibleText("2023");
     List<WebElement>y=year.getOptions();
     System.out.println("Year Count="+y.size());
   
     
     
         
}
}
