package example;

import java.util.Scanner;

public class Test {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=0;
		if(n>=3) {
			int i = 0;
			int temp = n/2;
			
			while(temp+i !=n) {
				ans = 2*i;
			}
		}
		System.out.println(ans);
	}
}
