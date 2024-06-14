package newpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeContentVerifiction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
       String actual=driver.getPageSource();//Contents are in page sourc e
       if(actual.contains("Gmail"))
       {
    	   System.out.println("pass"); 
       }
       else
       {
    	   System.out.println("Fail");
       }
	}

}
