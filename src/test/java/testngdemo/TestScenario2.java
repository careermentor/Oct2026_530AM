package testngdemo;

import org.testng.annotations.Test;

public class TestScenario2 
{

	@Test(priority=1)
	public void first_testcase()
	{
		
		System.out.println("This is the first test case");
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		
		System.out.println("This is the second test case");
	}
	
	@Test(priority=0)
	public void third_testcase()
	{
		
		System.out.println("This is the third test case");
	}
	
	@Test(groups="Smoke")
	public void fourth_testcase()
	{
		
		System.out.println("This is the fourth test case");
	}
	
	@Test(priority=-1,groups="Sanity")
	public void fifth_testcase()
	{
		
		System.out.println("This is the fifth test case");
	}
	
	@Test(priority=-2)
	public void sixth_testcase()
	{
		
		System.out.println("This is the sixth test case");
	}
}
