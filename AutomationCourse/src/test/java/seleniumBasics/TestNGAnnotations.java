package seleniumBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@Test
	public void testcase()
	{
		System.out.println("TestCases");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeTestCase");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterTestCases");
	}

}
