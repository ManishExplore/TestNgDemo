package testngNew;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {
	
	@BeforeSuite
	public void installApp()
	{
		System.out.println("This Block of code ececute at first in entire folder/Suites before starting any thing");
	}
	@Test
	public void testMethod()
	{
		System.out.println("Test Case Under Annotation File");
	}
	@AfterSuite
	public void uninstallApp()
	{
		System.out.println("This Block of code ececute at the last in entire folder/Suites after complete execution of any thing");
	}

}
