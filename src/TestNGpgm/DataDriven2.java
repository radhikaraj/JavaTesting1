package TestNGpgm;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven2 {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
	public void main() throws Exception
	{
		File f=new File("E:\\sause.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println("No of users:"+sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username: "+username);
			String paswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password: "+paswd);
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(paswd);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		}
	} 
	
	
	
}
