package newpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneJunit {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Open Amazone");
	}
	@Test
	public void test()  //method name can be  different
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		 String expected="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			       if(actualtitle.equals(expected))
			       {
			    	   System.out.println("pass");
			       }
			       else
			       {
			    	   System.out.println("Fail");
			       }
		
		
		
	}
	@Test
	public void test1()
	{
		String actual=driver.getPageSource();//Contents are in page source
	    if(actual.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
	    {
	 	   System.out.println("Content pass"); 
	    }
	    else
	    {
	 	   System.out.println("Content Fail");
	    }
		
	}
	@After
	 public void browserclose()
    {
      driver.close();
    	System.out.println("browser close");
    }
}
