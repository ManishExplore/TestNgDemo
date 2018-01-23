package testngFiles;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
	
	// @Test act like main method here in inside test  as one test case. 
	@Test
	public void browserOpening()
	{
		System.out.println("Test Case - 1");
	}
	
	@Test
	public void ticketBooking()
	{
		System.out.println("Test Case - 2");
	}
	// @BeforeMethod run every time before starting every test like here this block execute 2 time before every test.
	@BeforeMethod
	public void enterCrediential()
	{
		System.out.println("This block of code execute every time before starting each test");
	}
	@AfterMethod
	public void closingConnection()
	{
		System.out.println("This block of code execute every time after executing each test");
	}
	// @BeforeTest Execute before starting of any test.
	@BeforeTest
	public void enterBrowserUrl()
	{
		System.out.println("This block of code execute only one time before starting execution of any test");
	}
	// @AfterTest execute after completion of every test.
	@AfterTest
	public void closingBrowser()
	{
		System.out.println("This block of code execute only one time after complete execute of all the test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass");
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("AfterClass");
		
	}

}
