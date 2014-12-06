package ex2;

import java.util.*;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DateTime date = DateTime.now();
		String month = date.toString("MMM");*/
		
		GregorianCalendar myDateObj = new GregorianCalendar();
		int month = myDateObj.get(Calendar.MONTH);
		System.out.println(++month);

	}

}
