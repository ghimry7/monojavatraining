package com.monocept.test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Task2 {

	public static void main(String[] args) throws IOException {
		  FileReader fr=new FileReader("./test.txt");    
          int i;    
          while((i=fr.read())!=-1)  {  
          System.out.print((char)i); 
          }
          fr.close(); 
          
          System.out.println();
          
          Stream<String> stream = Files.lines(Paths.get("./test.txt"));
          stream.forEach(System.out::print);
          stream.close();
		
		
	}

}
