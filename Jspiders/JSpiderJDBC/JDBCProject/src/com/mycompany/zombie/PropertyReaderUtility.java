package com.mycompany.zombie;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtility {
	public static String getPropertyVal(String key){
		String value=null;
		Properties props = new Properties();
		try{
			FileReader fr = new FileReader("conf/dbconfig.properties");
			props.load(fr);;
			value=props.getProperty(key);
		}catch(IOException e){
			e.printStackTrace();
		}
		return value;
	}
}
