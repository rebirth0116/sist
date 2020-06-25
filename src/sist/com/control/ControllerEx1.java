package sist.com.control;

//if, if else, if elseif else

//(kor, eng, mat)40이상이고 avg 60이상 합격
public class ControllerEx1 {

	public void passCheck(int k, int e, int m, double avg) {
//		if(k>=40 && e>=40 && m>=40 && avg>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		if (k < 40 || e < 40 || m < 40 || avg < 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

	public void passCheck(double avg) {
		if (avg >= 90)
			System.out.println("A");
		else if (avg >= 80)
			System.out.println("B");
		else if (avg >= 70)
			System.out.println("C");
		else if (avg >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

	public void switchCaseEx1(int value) {
		switch (value) {
		case 1:
		case 2:
			System.out.println("1 or 2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("기타");
		}
	}

	public void switchCaseEx2(double avg) {
		switch ((int) avg / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;

		}
	}

	public void checkAge(int age, int score) {
		switch (age / 10) {
		case 1:
			checkScore(1, score); //checkScore와 같은 영역에 있으므로 따로 인스턴스를 생성하지 않아도 된다.
			break;
		case 2:
			checkScore(2, score);
			break;
		default:
			System.out.println("다시입력");
		}
	}

	public void checkScore(int age, int score) {

		if (score >= age * 10) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

	public static void main(String[] args) {
		ControllerEx1 c = new ControllerEx1();
//		c.passCheck(40, 39, 100, (40+39+100)/3.0);
//		c.passCheck(95.5);
//		c.switchCaseEx1(5);
//		c.switchCaseEx2(97.5);
		c.checkAge(20, 19);
	}

}
