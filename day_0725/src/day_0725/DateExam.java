package day_0725;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExam {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getHours());
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR	);
		int month = c.get(Calendar.MONTH);
		int dt = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year);
		System.out.println(month);
		System.out.println(dt);
		/////////////////////////////
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일");
		String today =  dateFormat.format(new Date());
		System.out.println(today);
	}
}
