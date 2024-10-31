package ch5;

import java.time.DayOfWeek;
import java.util.Calendar;

public class EnumTest {

	public static void main(String[] args) {
		// 열거형 테스트.... Week 열거형을 통해서 특성을 봅시다...
		week day;
		day = week.FRIDAY;	// 열거형 상수...
		System.out.println(day);
		day = week.WEDNESDAY;
//		day = Test;			// 목록 이외 값 X
		
		System.out.println(day);
		
		// 정의한 열거형 불러오기
		week today = null;
		
		// Calendar 객체 얻기...
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일 얻기...
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
	
	}

}
