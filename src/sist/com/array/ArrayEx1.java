package sist.com.array;

import java.util.Scanner;

//배열 : 같은 기억장소의 모임

//목적 : 일괄 처리
//구조 : LIST (선형), 중복허용하고, 순서가 있는 구조
//선언 : 자료형[] 변수명;
//1차원, 다차원
//int []m = new int [5];  [0] [1] [2] [3] [4]
public class ArrayEx1 {

	public void arrayInit1() {
//		int[] m = new int[5]; // [] [] [] [] [] => 덩어리 - 리스트 , 하나하나 - 노드, 노드의 확장개념 - 엘리먼트.
//		m[0] = 10;
//		m[1] = 20;
//		m[2] = 30;
//		m[3] = 40;
//		m[4] = 50; // [10][20][30][40][50]

		int[] m = { 10, 20, 30, 40, 50, 60, 70, 80 };

		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}

	}

	public void arrayInit2() {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		System.out.println("Cnt:");
		cnt = sc.nextInt();
		int[] m = new int[cnt];
		System.out.println("Data:");
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextInt();
		}

		disp(m);
		sc.close();
	}

	public void arrayInit3(int cnt) {
		int[] m = new int[cnt]; // 메모리 할당
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 100) % 45 + 1;
		}
		disp(m);
	}

	public void arrayEx1() {
		boolean[] b = new boolean[3];
		for (int i = 0; i < b.length; i++) {
			b[i] = i == b.length - 1;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		String[] s = { "a", "b", " c" };
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	public void arrayEx2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("cnt: ");
		int cnt = sc.nextInt();
		boolean[] b = new boolean[cnt];
		for (int i = 0; i < b.length; i++) {
			System.out.print("과일이름 :");
			String input = sc.next();
			if (input.equals("사과"))
				b[i] = true;
			else
				b[i] = false;
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		sc.close();
	}

	public void arrayEx3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 시작");
		System.out.print("판 수 선택 : ");
		int cnt = sc.nextInt();
		int input = 0;
		while (cnt > 0) {
			System.out.println("입력");
			System.out.println("1:가위  2:바위  3:보");
			input = sc.nextInt();
			int com = (int) (Math.random() * 10 + 1) % 3 + 1;
			rsp(input, com);
			cnt--;

		}
		System.out.println("게임 끝");
		sc.close();

	}

	public void rsp(int i, int j) {
		if (i == j)
			System.out.println("Draw");
		else {
			switch (i) {
			case 1:
				if (j == 2)
					System.out.println("Lose");
				else if (j == 3)
					System.out.println("Win");
				break;
			case 2:
				if (j == 3)
					System.out.println("Lose");
				else if (j == 1)
					System.out.println("Win");
				break;
			case 3:
				if (j == 1)
					System.out.println("Lose");
				else if (j == 2)
					System.out.println("Win");
				break;
			}
		}
		System.out.println("사용자가 낸 것은 " + rspDisp(i) + "이며, 컴퓨터가 낸 것은 " + rspDisp(j) + "입니다.");
	}

	public String rspDisp(int i) {
		switch (i) {
		case 1:
			return "가위";
		case 2:
			return "바위";
		case 3:
			return "보";
		default:
			return " ";
		}
	}

	public void disp(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
	}

	public static void main(String[] args) { // String[] args => parameter, args = {a,b,c,d} => argument
//		System.out.println(args[0] + " " + args[1] + " "+args[2]);

//		for(int i = 0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}

		ArrayEx1 a = new ArrayEx1();
//		a.arrayInit1();
//		a.arrayInit2();
//		a.arrayInit3(3);
//		a.arrayEx1();
//		a.arrayEx2();
		a.arrayEx3();
	}
}
