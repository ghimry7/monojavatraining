package comm.monocept.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Employee {
	private int id;
	private String name;
	private String city;
	private String doj;
	private double salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getDoj() {
		return doj;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(int id, String name, String city, String doj, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.doj = doj;
		this.salary = salary;
	}

	public boolean isPromotionDue() {
		if (years() >= 5) {
			return true;
		}
		return false;
	}

	public long years() {
		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		long diffYears=0,diffTime;
		Date d1,d2;
		try {
			d1 = formatter.parse(getDoj());
			String str = formatter.format(currentDate);
			d2 = formatter.parse(str);
			diffTime = d2.getTime() - d1.getTime();
			diffYears = TimeUnit.MILLISECONDS.toDays(diffTime) / 365;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return diffYears;

	}

	public double calculateAnnualIncome() {
		return salary * 12;
	}

}
