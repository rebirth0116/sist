package sist.com.array;

import java.util.Scanner;

public class ArrayEx3 {

	
	public void print(int []data) {
		for(int i:data) {
			System.out.printf("%4d",i);
		}
		System.out.println();
	}
	
	public void arrayPractice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
//		for(int i:arr) {
//			i=sc.nextInt();         향상된 for문은 read만 가능하고 write는 불가능하다
//		}
		
		
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ArrayEx3 a = new ArrayEx3();
		int []m1 = {10,20,30,40,50};
		int []m2 = {1,2,3,4,5};
//		a.print(m1);
		a.arrayPractice();
	}
}
