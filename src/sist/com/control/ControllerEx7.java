package sist.com.control;

import java.io.IOException;
import java.util.Scanner;

public class ControllerEx7 {
	// 변수, 연산자, 제어문 --->배열

	int a;

	public void controllerEx1() {
//		int a;
		a++;// a를 메소드 내에서 선언하면 오류, 밖에서(class)에서 선언하면 오류x
		System.out.println(a);
	}

	public void controllerEx2() {
		while (true) {
			int i = 0;
			while (true) {
				int j = 0;
				while (true) {
					int k = 0;
				} // k사라짐
			} // j사라짐
		} // i사라짐

	}

	public void disp(String name, int age, String addr) {
		System.out.println(name + " " + age + " " + addr);
	}

	public void controllerEx3() {
		Scanner sc = new Scanner(System.in); // system.in = consol로부터 무언가를 가져온다는 것.
		int age = 0;
		;
		while (true) {
			System.out.println("Name : ");
			String name = sc.next();
//			while (!(age >= 1 && age <= 90)) {
//				System.out.println("Age : ");
//				age = sc.nextInt();
//			} //이 경우 1<=age<=90인 값이 한번 들어가면 그 이후로는 age 입력이 안됨.
			
			do {
				System.out.println("Age : ");
				age = sc.nextInt();
			}while (!(age >= 1 && age <= 90));
			
			
			System.out.println("Addr : ");
			String addr = sc.next();
			System.out.println("1.disp 2.exit");
			switch (sc.nextInt()) {
			case 1:
				disp(name, age, addr);
				break;
			case 2:
				return;
			default:
				break;
			}

//		
//		try {
//			System.out.println(System.in.read());  //예외가 발생할 수있는 부분
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}
	}

	public static void main(String[] args) {
		ControllerEx7 c = new ControllerEx7();
		c.controllerEx3();
	}
}
