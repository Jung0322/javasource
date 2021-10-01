package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateEx1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 hh시 mm분 ss초");
		System.out.println(simpleDateFormat.format(date));
		
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		LocalTime cuLocalTime = LocalTime.now();
		System.out.println(cuLocalTime);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
	}

}
