package sist.com.variable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int i1, i2, max, min;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		i1 = Integer.parseInt(st.nextToken());
//		i2 = Integer.parseInt(st.nextToken());
		for(int i=i1; i<=i2; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i1+"*"+j+"="+i1*j);
			}
		}
		
	}

}
