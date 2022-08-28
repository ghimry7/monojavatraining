package com.monocept.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import com.monocept.model.*;


public class Task4 {

	public static void main(String[] args) {
		Employee acc[] = new Employee[5];
		acc[0] = new Employee(123, "Javaaaa", 2563);
		acc[1] = new Employee(1234, "Pythonaaa", 236660);
		acc[2] = new Employee(12345, "C", 4563233);
		acc[3] = new Employee(123456, "C++", 6985500);
		acc[4] = new Employee(1234567, "C#", 12365);
		
		System.out.print("Employee having minimum balance: ");
		Arrays.asList(acc).stream().collect(Collectors.minBy(new EmployeeSalaryComp())).ifPresent(emp->{
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSalary());
		});
		
		System.out.print("Employee having maximum balance: ");
		Arrays.asList(acc).stream().collect(Collectors.maxBy(new EmployeeSalaryComp())).ifPresent(emp->{
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSalary());
		});

	
		System.out.print("Employee having names more than 6 character: ");
		Arrays.asList(acc).stream().filter(n -> n.getName().length() >= 6).forEach(System.out::println);
		
		System.out.print("Sum of all salary:  ");
		int total = Arrays.asList(acc).stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println(total);
		
		
		System.out.print("Count emp more than salary 50000:  ");
		long count=Arrays.asList(acc).stream().filter(emp->emp.getSalary()>50000).count();
		System.out.println(count);
		
	
	}

}
