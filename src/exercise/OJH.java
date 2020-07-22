package exercise;

import java.util.Scanner;

public class OJH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();// 입력숫자
		int N = input; // 최대수
		int n = -4; // 등차
		int x = 1, y = 0, z = 0;// 숫자
		int i = 0; // 한수의 갯수
		if (N < 100) {
			i = N;
		} else {
			i = 99;
			while (true) {
				y = x + n;
				z = y + n;
				if (z < 0) {
					n = n + 1;
				} else if (z >= 10) {
					x = x + 1;
					n = -4;
				} else {
					if (100 * x + 10 * y + z <= N) {
						i = i + 1;
						n = n + 1;
					} else
						break;
				}
			}
			System.out.println(i);
		}
		sc.close();
	}
}
