package comm.monocept.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HR {

	public void isPromotionDue(Employee e){
		if(years(e.getDoj())>=5){
			System.out.println("Promotion: Yes");
		}
		else{
			System.out.println("Prootion: No");
		}
	}
	
	private long years(String doj) {
		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		long diffYears=0,diffTime;
		Date d1,d2;
		try {
			d1 = formatter.parse(doj);
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
}
