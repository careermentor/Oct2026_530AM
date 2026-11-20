package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario5 
{

	@Test
	public void first_testcase()
	{
		
		System.out.println("This is the first test case");
	}
	
	@Test
	public void second_testcase()
	{
		
		System.out.println("This is the first step of the test case");
		
		
		
		Assert.assertEquals("Hello", "Hello"); //pass 
		
System.out.println("This is the second step of the test case");


	SoftAssert sa = new SoftAssert();
	
	sa.assertEquals("Hello", "Hello TestNG");  //not fail - it continue here
		
System.out.println("This is the third step of the test case");
		
		sa.assertEquals("Hello", "Hello");  //pass
		
System.out.println("This is the forth step of the test case");
		
		sa.assertEquals("Hello", "Hello TestNG");  //fail
		
		sa.assertAll();  //this code will be required to be added at the last to fail the scenario
	}
	
	@Test
	public void third_testcase()
	{
		
		System.out.println("This is the third test case");
		
		Assert.assertEquals("Hello", "Hello");
	}
	
	@Test
	public void fourth_testcase()
	{
		
		System.out.println("This is the fourth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		
		System.out.println("This is the fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		
		System.out.println("This is the sixth test case");
	}
}
