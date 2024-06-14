package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazeLogin {
 
	WebDriver driver;
	By bemail= By.id("email");
	By bpass=By.id("password");
	By bcheck=By.name("remember");
	By blogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	public BlazeLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(bemail).sendKeys(email);
		driver.findElement(bpass).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(bcheck).click();
		driver.findElement(blogin).click();
	}
	
}
