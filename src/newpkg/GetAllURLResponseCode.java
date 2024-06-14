package newpkg;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllURLResponseCode {
//verify all links in google.com 
	ChromeDriver driver;
	String baseurl="https://google.com";
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Test
		public void test() throws Exception
		{
		
			 List<WebElement> li=driver.findElements(By.tagName("a"));
			 for(WebElement u:li)
			 {
				 String link=u.getAttribute("href");
				 verify(link);
				 
			 }
				
		}
        public void verify(String link)
         {
        	  try 
        	  {
        		    URL ob=new URL(link);
					HttpURLConnection con=(HttpURLConnection)ob.openConnection();
				
					if(con.getResponseCode()==200)
					{
						System.out.println("valid:--"+link);
					}
					else if(con.getResponseCode()==401)
					{
						System.out.println("broken link:--"+link);
					}
        	  }
        	  catch(Exception e)
        	  {
        		  System.out.println(e.getMessage());
        	  }
	      }
}
