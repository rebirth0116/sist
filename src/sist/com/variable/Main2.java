package sist.com.variable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
static byte n1,n2;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n1 = Byte.parseByte(st.nextToken());
		n2 = Byte.parseByte(st.nextToken());		
		System.out.println(n1&n2);
		System.out.println(n1|n2);
		System.out.println(n1^n2);
		System.out.println(~n1);
		System.out.println(n1<<1);
		System.out.println(n1<<2);
		System.out.println(n1>>1);
		System.out.println(n1>>2);
		
		
		
		
		
		
	}

}
