/* Question to perform automation testing 
 1.Open https://rishiherbalindia.linker.store/
 2.Click My Account and register your details
 3.Click login button and login 
 4.Search 'Herbal agro growth booster' in search bar
 5.Click add to wish list and add that product to your wish list
 6.Then click on link skin  & add aloe fairness cream to your wish list
 7.Click 'All' link.Then click 'Health' link.After that click safety link one after the other 
 8.Scroll down to the bottom of the page and click 'About us'
 9.Take screenshot of the element 'Privacy policy'
 10.Check the response code of the link'https://rishiherbalindia.linker.store/'*/
package TestNGpgm;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_rishiherbalindia {
	WebDriver driver;
@BeforeMethod
public void setup()
{
	 driver =new ChromeDriver();	
}
@BeforeMethod
public void urlloading()
{
   driver.get("https://rishiherbalindia.linker.store/");
   driver.manage().window().maximize();
   
}	
@Test
public void test1()
{
	//Registration
	//click on my account
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
    //Click on register
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
	//to handle registration pop up and input email and password
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")));
	WebElement email=driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input"));
	WebElement password=driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input"));
    email.sendKeys("radhupramod@gmail.com");
    password.sendKeys("Radhu@12!");
	WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"privacypolicy\"]"));
	WebElement signupButton=driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button"));
	checkbox.click();
	signupButton.click();
	driver.navigate().back();
	
}

@Test
public void test2() throws InterruptedException, IOException
{
   //login
	//click on my account
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
	//click on login
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement login=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")));
	login.click();
   //To handle login pop up
	WebElement Emailinput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")));
	WebElement Passwordinput=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")));
    Emailinput.sendKeys("radhupramod@gmail.com");
    Passwordinput.sendKeys("Radhu@12!");
    WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]"));
    loginButton.click();
    
    //Search 'Herbal agro growth booster' in search bar
    Thread.sleep(1000);
 
    WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
    searchbar.click();
    searchbar.sendKeys("Herbal agro growth booster",Keys.ENTER);
    //Add to wish list
    Actions act=new Actions(driver);
    WebElement pdt=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
    act.moveToElement(pdt).perform();
    WebElement wishlist=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span"));
    wishlist.click();
    
    //Click link skin and 
   
    WebElement skinlink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a"));
    skinlink.click();
    Thread.sleep(1000);
    
    WebElement aloe=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
    act.moveToElement(aloe).perform();
    Thread.sleep(1000);
    
    WebElement wishlist2=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span"));
    wishlist2.click();
    //Click all main links one by one
    Thread.sleep(1000);
    WebElement alllink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
    alllink.click();
    
    Thread.sleep(1000);
    WebElement healthlink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a"));
    healthlink.click();
    
    Thread.sleep(1000);
    WebElement safetylink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
    safetylink.click();
    
    Thread.sleep(1000);
    WebElement skinlink2=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a"));
    skinlink2.click();
  
    Thread.sleep(1000);
    WebElement personallink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[5]/a"));
    personallink.click();
    
    Thread.sleep(1000);
    WebElement babylink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a"));
    babylink.click();
  
    Thread.sleep(1000);
    WebElement agriculturelink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[7]/a"));
    agriculturelink.click();
    
    Thread.sleep(1000);
    WebElement vetenarylink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[8]/a"));
    vetenarylink.click();
    
    Thread.sleep(1000);
    WebElement homelink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[9]/a"));
    homelink.click();
    
    Thread.sleep(1000);
    WebElement foodlink=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[10]/a"));
    foodlink.click();
    
    //Scroll down to the bottom of the page and click 'About us'
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
    
    //Take screenshot of the element 'Privacy policy'
	
	WebElement privacy=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
	File src=privacy.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("./screenshot//privacyScreenshot.png"));
	
	//Check the response code of the link'https://rishiherbalindia.linker.store/'
	URL ob=new URL("https://rishiherbalindia.linker.store/");
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	int responsecode=con.getResponseCode();
	System.out.println("Response code is"+responsecode);
	con.connect();
    
}
}