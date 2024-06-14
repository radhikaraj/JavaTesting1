package newpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitChromeTitle {
   ChromeDriver driver;
   @Before
   public void setup()
   {//to launch chrome browser
	   driver=new ChromeDriver();
    driver.get("https://www.google.com");
   	System.out.println("browser open");
   }
   @Test
   public void test()
   {
	   String actualtitle=driver.getTitle();
       String expected="Google";
       if(actualtitle.equals(expected))
       {
    	   System.out.println("pass");
       }
       else
       {
    	   System.out.println("Fail");
       }
   	
   }
   @After
   public void browserclose()
   {
     driver.close();
   	System.out.println("browser close");
   }
}
