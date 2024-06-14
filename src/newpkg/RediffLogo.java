package newpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogo {
//Testing logo is visible or not,Check box is selected or not by default,radio button enabled by default or not
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
	WebElement lo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
	boolean logo=lo.isDisplayed();
	    if(logo)
	    {
	 	   System.out.println("Logo displayed"); 
	    }
	    else
	    {
	 	   System.out.println("Logo not displayed");
	    }
	    
	    
	     boolean check=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected(); 
	     if(check)
		    {
		 	   System.out.println("Checked"); 
		    }
		    else
		    {
		 	   System.out.println("Unchecked");
		    }
	    boolean radio= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isEnabled();
	    if(radio)
	    {
	 	   System.out.println("Radio button enabled"); 
	    }
	    else
	    {
	 	   System.out.println("Radio button disabled");
	    }
	}
	   
}
