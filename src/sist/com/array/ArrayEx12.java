package sist.com.array;

public class ArrayEx12 {

	public void disp(int[][] x) {
		for(int[] a : x) {
			for(int i : a) {
				System.out.printf("%-5d",i);
			}
			System.out.println();
		}
	}
	
	public void initArray(int[][] x) {
		int cnt = 0;
		for(int i = 0; i<x.length; i++) {
			for(int j = 0; j<x[i].length;j++) {
				x[i][j] = ++cnt;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayEx12 ax = new ArrayEx12();
//		int[][] m = null;
//		m = new int [2][3];
//		a.disp(m);
//		m = new int[5][5];
//		int[][] m = {{10,20,30,0},{40,50,60,0},{70,80,90,0},{0,0,0,0}};
//		
//		a.sumCount(m);
//		a.disp(m);
		
		final int ROW = 4, COL = 3;
		int [][] a = new int[ROW][COL];
		ax.initArray(a);
		ax.disp(a);
		int [][] b = new int [COL][ROW];
		ax.disp(b);
	}
}
