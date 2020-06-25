package sist.com.control;

public class ExampleGuGudan {

	public void gugudanFor() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("------------");
		}
	}

	public void gugudanWhile() {
		int i = 2;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
			System.out.println("------------");
			i++;
		}

	}

	public void gugudanForEx() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %2d  ", j, i, j * i);
			}
			System.out.println();
		}
	}

	public void gugudanWhileEx() {
		int i = 1;
		while (i <= 9) {
			int j = 2;
			while (j <= 9) {
				System.out.printf("%d * %d = %2d  ", j, i, j * i);
				j++;
			}
			System.out.println();
			i++;
		}
	}

	public void starEx1(int num) {
		// 증가하는 별찍기
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 감소하는 별찍기
		for (int i = num - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 마름모그리기
	public void starEx2(int num) {
		// 마름모 윗부분
		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 마름모 아랫부분
		for (int i = num - 1; i > 0; i--) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void starEx2While(int num) {

		// 마름모 윗부분
		int i = 1;
		while (i <= num) {
			int j = num - i;
			while (j > 0) {
				System.out.print(" ");
				j--;
			}
			int k = 1;
			while (k <= 2 * i - 1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}

		// 마름모 아랫부분
		i -= 2; // 이 전에 i는 num+1로 되어 while문을 탈출한 것. 그러므로 num-1로 만들기 위해 -2
		while (i > 0) {
			int j = num - i;
			while (j > 0) {
				System.out.print(" ");
				j--;
			}
			int k = 1;
			while (k <= 2 * i - 1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i--;
		}

	}

	// 별모양
	public void starEx3(int num) {
		// 별 윗부분
		for (int i = 1; i <= num; i++) {
			for (int j = 3 * num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 별 중간
		for (int i = num; i >= 2; i--) {
			for (int j = 0; j < (num - i) * 3; j++) {
				System.out.print(" ");
			}
			for (int k = 2; k <= 6 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 별 아래
		for (int i = 1; i <= 5; i++) {
			for (int j = 2 * num - i; j > 0; j--)
				System.out.print(" ");
			for (int k = 1; k <= 2 * (num + i); k++) {
				if (!(k >= 2 * (i + 2) + 1 || k <= 6)) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

	}

	// 6각별
	public void starEx4(int num) {
		// 위
		for (int i = 1; i <= num; i++) {
			for (int j = 3 * num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//중간위
		for (int i = num; i >= num/2+1; i--) {
			for (int j = 0; j < (num - i) * 3; j++) {
				System.out.print(" ");
			}
			for (int k = 2; k <= 6 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//중간아래
		for (int i = num/2+1; i <=num ; i++) {
			for (int j = 0; j < (num - i) * 3; j++) {
				System.out.print(" ");
			}
			for (int k = 2; k <= 6 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//아래
		for (int i = num; i > 0; i--) {
			for (int j = 3 * num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//모래시계
	public void starEx5(int num) {
		for (int i = num; i > 0; i--) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//삼각형 윤곽선
	public void starExLine1(int num) {
		for(int i = 1; i<=num; i++) {
			for(int j = num-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1; k++) {
				if(!(i==num)) {
				if(k==1||k==2*i-1) System.out.print("*");
				else System.out.print(" ");
				}
				else System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//마름모 윤곽선
	
	public void starExLine2(int num) {
		
		//위
		for(int i = 1; i<=num; i++) {
			for(int j = num-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1; k++) {
				if(k==1||k==2*i-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i = num; i>0; i--) {
			for(int j = num-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1; k++) {
				if(k==1||k==2*i-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		ExampleGuGudan e = new ExampleGuGudan();
//		e.gugudanFor();
//		e.gugudanWhile();
//		e.gugudanForEx();
//		e.gugudanWhileEx();
//		e.starEx1(6);
//		e.starEx2(5);
//		e.starEx2While(5);
//		e.starEx3(5);
//		e.starEx4(5);
//		e.starEx5(5);
//		e.starExLine1(5);
		e.starExLine2(5);
	}

}
