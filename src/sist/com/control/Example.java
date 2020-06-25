package sist.com.control;

//
//1년 1월 1일 월요일
//          2일 화요일
//          3일 수요일
//          4일 목요일
//year = 2020
//month = 6
//day = 24
//int cnt = (year-1)*365 + ���ϼ� + day
//윤달 = 4년마다, 100년마다는 x 그러나 400년 마다는 o
//

public class Example {
	
	public void calAge(int year) {
		System.out.println(2020-year+1);
	}
	
	public void calAnimal(int year) {
		switch(year%12) {
		case 1:
			System.out.println("닭");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("돼지");
			break;
		case 4:
			System.out.println("쥐");
			break;
		case 5:
			System.out.println("소");
			break;
		case 6:
			System.out.println("호랑이");
			break;
		case 7:
			System.out.println("토끼");
			break;
		case 8:
			System.out.println("용");
			break;
		case 9:
			System.out.println("뱀");
			break;
		case 10:
			System.out.println("말");
			break;
		case 11:
			System.out.println("양");
			break;
		case 12:
			System.out.println("원숭이");
			break;
		}
	}

	public boolean yunDal(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public void dayTest(int year, int month, int day) {
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
				cnt += 28;
				break;
			default:
				cnt += 30;
			}

			// 이번년도 윤달인지
			if (month > 2 && yunDal(year))
				cnt++;

		}

		cnt += day;

		switch (cnt % 7) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;

		}

	}

	public static void main(String[] args) {
		Example e = new Example();
		e.calAge(1993);
		e.calAnimal(1993);
		System.out.print("1년 1월 1일 =");
		e.dayTest(1, 1, 1);
		System.out.print("2020년 6월 24일 =");
		e.dayTest(2020, 6, 24);
	}
}

//switch (i) {
//case 0:// 1월
//case 2:// 3
//case 4:// 5
//case 6:// 7
//case 7:// 8
//case 9:// 10
//case 11:// 12
//	cnt += 31;
//	break;
//case 3:// 2
//	cnt += 28;
//	break;
//
//default:
//	cnt += 30;
//}
