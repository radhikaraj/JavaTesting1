package newpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCounting {
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
	 WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
     Select day=new Select(dayelement);
     day.selectByValue("02");
     List<WebElement>d=day.getOptions();//To get Drop down count we use getOption() method
     System.out.println("Day Count= "+d.size());
      
     WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
     Select month=new Select(monthelement);
     month.selectByIndex(4);
     List<WebElement>m=month.getOptions();
     System.out.println("Month Count= "+m.size());
     
     WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
     Select year=new Select(yearelement);
     year.selectByVisibleText("2024");
     List<WebElement>y=year.getOptions();
     System.out.println("Year Count="+y.size());
   
     
     
         
}

}
