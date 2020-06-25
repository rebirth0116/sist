package sist.com.control;
//변수(지역변수)type, 형변환 [메모리]

//연산자(우선순위) 특징
//제어문 분기문 if, if else, if else if, switch case default
//반복문 for, while, do~while, continue, break, return
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControllerEx2 {

	public void controlProcess1(int x, int y, int z) {
		if (x % 2 == 0) {

		}

//		if(x%2==0) {
//			System.out.printf("x는 짝수이면서");
//		}else System.out.printf("x는 홀수이면서");
//		if(y%2==0) {
//			System.out.printf("y는 짝수이면서 ");
//		}else System.out.printf("y는 홀수이면서");
//		if(z%2==0) {
//			System.out.printf("z는 짝수이다 ");
//		}else System.out.printf("z는홀수이다 ");

	}

	public void controlProcess1(int a) {
		for (int i = 1; i < a; i++) {
			if (i > 10)
				break;

			if (a % i == 0)
				System.out.println(a + "는 " + i + "의 배수이다.");
			else
				System.out.println(a + "는 " + i + "의 배수가 아니다.");
		}
	}

	public void controlProcess1(char a) {
		if (a >= 'A' && a <= 'z') {
			System.out.println(a + "는 알파벳 입니다.");
			if (a >= 'A' && a <= 'Z')
				System.out.println(a + "는 대문자 입니다.");
			else
				System.out.println(a + "는 소문자 입니다.");
		} else
			System.out.println(a + "는 알파벳이 아닙니다.");
	}

	public void changChar(char a) {
		if (a >= 'A' && a <= 'z') {
			if (a >= 'A' && a <= 'Z')
				System.out.printf("%c", a + 32);
			else
				System.out.printf("%c", a - 32);
		} else
			System.out.println(a + "는 알파벳이 아닙니다.");
	}

	public void switchCaseEx1(int first, int second) {

		switch (first) {
		case 10:
			System.out.println("10");
			switch (second) {
			case 100:
				System.out.println("100");
				return;
			case 200:
				System.out.println("200");
				return;
			default:
				return;
			}
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;

		}

	}



	public static void main(String[] args) throws IOException {
		ControllerEx2 c = new ControllerEx2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("테스트 유형을 선택하시오");
		System.out.println("배수 체크: 1");
		System.out.println("알파벳 체크 : 2");
		System.out.println("소문자 대문자변경: 3");
		int input = Integer.parseInt(br.readLine());
		
		if(input==1) {
			System.out.println("테스트를 위한 정수를 입력하시오.");
			int a = Integer.parseInt(br.readLine());
			c.controlProcess1(a);
		}else if(input==2) {
			System.out.println("테스트를 위한 문자를 입력하시오.");
			char a = br.readLine().charAt(0);
			c.controlProcess1(a);
		}else if(input==3) {
			System.out.println("테스트를 위한 알파벳을 입력하시오.");
			char a = br.readLine().charAt(0);
			c.changChar(a);
		}
		c.controlProcess1(10, 21, 30);
		c.switchCaseEx1(10, 30);

	}
}
