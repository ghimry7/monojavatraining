package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesInputTest {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		try {
			InputStream in=new FileInputStream("./test.properties");
			
			p.load(in);
			
			System.out.println("User: "+p.getProperty("user")+"\nPass: "+p.getProperty("pass"));
			
			p.list(System.out);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
