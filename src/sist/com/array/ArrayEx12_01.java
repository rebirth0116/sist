package sist.com.array;

public class ArrayEx12_01 {

	public static void main(String[] args) {

//		int[] a = {1,2,3,4};
//		int[] b = {5,6,7};
//		int[][] c = new int [2][];          
//		
//		c[0] = a;               
//		c[1] = b;
//		for(int[] k : c) {
//			for(int i : k) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}

		// 기본 숫자 넣기
		int temp = 1;
		int[][] a = new int[4][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = temp++ * 10;
			}
		}

		// 가로 합
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				a[i][a[i].length - 1] += a[i][j];
			}
		}

		// 세로 합
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				a[a.length - 1][j] += a[i][j];
			}
		}

		// 대각합
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				if (i == j) {
					a[a.length - 1][a[i].length - 1] += a[i][j];
				}
			}
		}

		for (int[] i : a) {
			for (int j : i) {
				System.out.printf("%-5d", j);
			}
			System.out.println();
		}

		System.out.println("============================");
		// b초기화
		temp = 1;
		int[][] b = new int[4][3];
		int[][] c = new int[3][4];
		int [] t = new int[12];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = temp++;
			}
		}
		// b출력
		for (int[] i : b) {
			for (int j : i) {
				System.out.printf("%5d", j);
			}
			System.out.println();
		}

		temp = 0;
		System.out.println("-------------------------");
		// b를 c로
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c[i].length; j++) {
//				if (j == b[i].length) {
//					temp++;	
//					c[i][j] = b[i+1][i];
//				}
//				if (temp + j < b[i].length) {
//					c[i][j] = b[i][j + temp];
//				}
//				if(temp + j == b[i].length) {
//					c[i][j] = b[i+1][0];
//				}
//			}
//		}
		
		//1차원배열로 옮겨서 다시분배하기
//		for(int i = 0; i<b.length; i++) {
//			for(int j = 0; j<b[i].length; j++) {
//				t[temp++] = b[i][j];
//			}
//		}
//		temp=0;
//		for(int i = 0; i<c.length; i++) {
//			for(int j = 0; j<c[i].length; j++) {
//				c[i][j] = t[temp++];
//			}
//		}
		
		//변수 두개 더 선언하여 풀이
		int row = 0;
		int col = 0;
		for(int i = 0; i<c.length; i++) {
			for(int j = 0; j<c[i].length; j++) {
				c[i][j] = b[row][col++];
				if(col==b[i].length) {
					row++;
					col = 0;
				}
			}
		}
		

		// c출력
		for (int[] i : c) {
			for (int j : i) {
				System.out.printf("%5d", j);
			}
			System.out.println();
		}
		

	}
}
