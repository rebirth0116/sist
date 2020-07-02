package sist.com.core;

public class ArrayEx2 {

	public void arrayEx1() {
//		int[] a = {10, 20, 30};
//		int[] b = {30, 50, 60, 70};
//		int[] c = {40, 50, 60, 70, 80};
//		int[][] d = new int[3][];
//		
//		System.out.println(d);
		int[][] d= {{10,20},{30,40,50}};
		
		for(int i = 0; i<d.length; i++) {
			for(int j = 0; j<d[i].length; j++) {
				System.out.printf("%-5d",d[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ArrayEx2 a = new ArrayEx2();
		a.arrayEx1();
	}
}
