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
		int input = Integer.parseInt(br.readLine());
		for(int i = 1 ; i<=2*input; i++) {
			if(i%2==1) {
				for(int j = 0; j<input; j++) {
					if(j%2==1)bw.write(" ");
					else bw.write("*");
				}
			}else {
				for(int j = 0; j<input; j++) {
					if(j%2==0)bw.write(" ");
					else bw.write("*");
				}
			}
			bw.write("\n");
			
		}
		bw.flush();
		br.close();
		
	}
}
