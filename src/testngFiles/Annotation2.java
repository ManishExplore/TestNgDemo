package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {
	// This Block of code execute at first in entire folder/Suites before starting any thing
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
	//This Block of code execute at the last in entire folder/Suites after complete execution of any thing
	@AfterSuite
	public void uninstallApp()
	{
		System.out.println("This Block of code ececute at the last in entire folder/Suites after complete execution of any thing");
	}

}
