package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] input = new int[5];
		for(int i = 0; i<5; i++) {
			input[i] = Integer.parseInt(br.readLine());
			if(input[i]<40) input[i] = 40;
		}
		int sum  = 0;
		for(int i = 0; i<5; i++) {
			sum+=input[i];
		}
		System.out.println(sum/5);
		
	}
}
