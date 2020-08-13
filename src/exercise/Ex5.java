package exercise;

import java.util.Arrays;

public class Ex5 {

	
	public static void main(String[] args) {
		int[] test = {3,3,2,3};
		Arrays.sort(test);
		for(int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}
}
