package com.monocept.test;

import com.monocept.model.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSeviceTest {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(4);
		
		service.execute(new Aplhabets());
		
		service.execute(new Numbers());
		
		
		
	}

}
