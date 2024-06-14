package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPg {
	 WebDriver driver;
	 By bname=By.id("name");
	 By bcompany=By.id("company");
	 By bemail=By.id("email");
	 By bpass=By.id("password");
	 By bconpass=By.id("password-confirm");
	 By bregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	public RegisterPg(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String name,String company,String email,String password,String conpassword)
	{
		driver.findElement(bname).sendKeys(name);
		driver.findElement(bcompany).sendKeys(company);
		driver.findElement(bemail).sendKeys(email);
		driver.findElement(bpass).sendKeys(password);
		driver.findElement(bconpass).sendKeys(conpassword);
	}
	public void register()
	{
		driver.findElement(bregister).click();;
	}

	
	
	
}
