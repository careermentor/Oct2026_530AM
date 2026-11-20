package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario4 
{

	@Test
	public void first_testcase()
	{
		
		System.out.println("This is the first test case");
	}
	
	@Test
	public void second_testcase()
	{
		
		System.out.println("This is the second test case");
	}
	
	@Test
	public void register()
	{
		
		System.out.println("This is the register test case");
		
		Assert.assertEquals("Hello", "Hello TestNG");
	}
	
	@Test(dependsOnMethods= {"register"})
	public void login()
	{
		
		System.out.println("This is the login test case");
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
