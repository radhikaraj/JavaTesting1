package newpkg;
//Title Verification
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();//to launch chrome browser
       driver.get("https://www.google.com");
      // driver.close();//close currently opened 
       //driver.quit();//entire chrome close 
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

}
