package sist.com.array;

import java.util.Stack;

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

		int []m = {10,20,30,40,50,60,70,80};
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}

	}
	public void arrayEx1() {
		boolean[] b = new boolean[3];
		for (int i =0; i<b.length; i++) {
			b[i] = i==b.length-1;
		}
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		String[] s = {"a", "b"," c"};
		for(int i =0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args) { // String[] args => parameter, args = {a,b,c,d} => argument
//		System.out.println(args[0] + " " + args[1] + " "+args[2]);

//		for(int i = 0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}

		ArrayEx1 a = new ArrayEx1();
//		a.arrayInit1();
		a.arrayEx1();
	}
}
