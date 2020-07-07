package sist.com.variable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int result = 0;
		int count =0;
		for (int i = input.length(); i >0; i--) {
			int temp;
			temp = (int) ((input.charAt(i-1)-'0')*Math.pow(2, count));
			count++;
			result+=temp;
		}
		System.out.println(result);
		

	}

}
