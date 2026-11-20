package org.wipro.sel_auto.rediff.datalayer;

import org.testng.annotations.DataProvider;

public class TestData 
{

	@DataProvider(name="login")
	public Object[][] login_data()
	{
		Object[][] data3 = {{"testuser1","pass123"},{"testuser2","pass1234"},{"testuser3","pass1235"}};  //2-dimensional array
		return data3;
	}
	
	@DataProvider(name="register")
	public Object[][] register_data()
	{
		Object[][] data3 = {{"testuser1","pass123"},{"testuser2","pass1234"},{"testuser3","pass1235"}};  //2-dimensional array
		return data3;
	}
	
}
