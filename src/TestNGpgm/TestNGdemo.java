package TestNGpgm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
@BeforeTest
public void setup()
{
System.out.println("browserr open");
}
@BeforeMethod
public void url()
{
	System.out.println("url open");	
}
@Test(priority=3)
public void test1()
{
	System.out.println("test1");	
}
@Test(priority=2,invocationCount=2,dependsOnMethods= {"test1"})
//if we give dependsOnMethods then it execute depends on that not on priority
public void test2()
{
	System.out.println("test2");	
}
@Test(priority=2)
public void test3()
{
	System.out.println("test3");
}
@AfterMethod
public void report()
{
	System.out.println("report");
}
@AfterTest
public void close()
{
	System.out.println("browser close");
}
}
