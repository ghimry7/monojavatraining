package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesOutputTest {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		try {
			OutputStream out=new FileOutputStream("./test.properties");
			
			p.setProperty("user","Mono");
			p.setProperty("password", "monojava");
			
			p.store(out, null);
			
			System.out.println("Properties file created");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
