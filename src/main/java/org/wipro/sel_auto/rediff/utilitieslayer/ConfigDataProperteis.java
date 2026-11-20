package org.wipro.sel_auto.rediff.utilitieslayer;


import java.io.FileReader;
import java.util.Properties;

public class ConfigDataProperteis
{

	public static String readconfigdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./testdata/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readelementdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./testdata/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
}
