package exam;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.THUSDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		default:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일" + today);
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 쉽니다.");
		}else {
			System.out.println("열심히 자바 공부합니다");
		}
	}

}
