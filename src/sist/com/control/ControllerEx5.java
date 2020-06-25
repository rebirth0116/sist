package sist.com.control;

public class ControllerEx5 {

	public int getAge(int year) {
		return (2020 - year) + 1;
	}

	public String getDdi(int year) {
		switch (year % 12) {
		case 1:
			return "닭";
		case 2:
			return "개";
		case 3:
			return "돼지";
		case 4:
			return "쥐";
		case 5:
			return "소";
		case 6:
			return "호랑이";
		case 7:
			return "토끼";
		case 8:
			return "용";
		case 9:
			return "뱀";
		case 10:
			return "말";
		case 11:
			return "양";
		default:
			return "원숭이";
		}
	}
	
	public boolean yunDal(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public int getCount(int year, int month, int day) {
		int cnt = 0;
		// 년도 일자
		cnt = (year - 1) * 365;
		for (int i = 1; i < year-1; i++) {
			if (yunDal(i)) cnt++;
		}
		// 월 일자
		for (int i = 1; i < month-1; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				cnt += 31;
				break;
			case 2:// 2
				if(yunDal(year))cnt+=29;
				else cnt += 28;
				break;
			default:
				cnt += 30;
			}
			// 이번년도 윤달인지
			if (month > 2 && yunDal(year))
				cnt++;
		}
		cnt += day;
		return cnt;
	}
	
	public String getWeek(int year, int month, int day) {
		switch(getCount(year, month, day)%7) {
		case 0:
			return"일요일";
		case 1:
			return"월요일";
		case 2:
			return"화요일";
		case 3:
			return"수요일";
		case 4:
			return"목요일";
		case 5:
			return"금요일";
		default:
			return"토요일";
		}
	}
	
	public void input(int year, int month, int day) {
		int age = getAge(year);
		String ddi = getDdi(year);
		String week = getWeek(year, month, day);
		output(year, age, ddi, week);
	}

	public void output(int year, int age, String ddi, String week) {
		System.out.println("당신은 " + year + "년에 태어났으며, 나이는 " + age + "살이며, " + ddi + "띠이고," + week + "에 태어났습니다.");
	}

	public static void main(String[] args) {
		ControllerEx5 c = new ControllerEx5();
		c.input(1993, 1, 16);
	}
}
