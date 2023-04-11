package configReader;

import java.io.*;
import java.util.*;

public class readConfigFile {

	
	public Properties prop ;
	FileInputStream fis;
	public String file_Location = System.getProperty("user.dir")+"/testResources/globalData.properties";
	
	public Properties readConfigData() throws IOException
	{
		prop = new Properties();
		try {
			fis = new FileInputStream(file_Location);
			prop.load(fis);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return prop;
	}
	
}
