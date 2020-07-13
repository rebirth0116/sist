package sist.com.obj.core3;
//(상속 is a, has a) -- abstract class(미완성 클래스), interface

import java.util.Scanner;
import java.util.StringTokenizer;

public class ObjectEx5 {
	static int rs;
	
	public void strMaker1() {
		String str1 = "abcd";
		String str2 = "efg";
//		System.out.println(String.valueOf(str1.equals("abcd")).substring(0,1).equalsIgnoreCase("f"));
		System.out.println(str1.equals(" ab cd".replaceAll(" ", "").trim()));
	}
	
	public void strMaker3(String data) {
		System.out.println(String.valueOf(String.valueOf(data.toUpperCase().toLowerCase().startsWith("J")).charAt(0)).equals("f"));
		
	}
	
	public static void strMaker2(String data) {
		data = data.trim();
		if(data.startsWith("start")) {
			System.out.println("game start");
			return;
		}else if(data.startsWith("go")) {
			rs += Integer.parseInt(data.substring(data.indexOf(" ")+1));
			
		}else if(data.equals("disp")) {
			System.out.println(rs);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ObjectEx5 o = new ObjectEx5();
//		o.strMaker1();
//		StringTokenizer st = new StringTokenizer("ab cd e");
//		System.out.println(st.countTokens());
//		System.out.println(st.nextElement());
//		System.out.println(st.nextToken());
//		System.out.println(st.hasMoreElements());
//		System.out.println(st.nextToken());
		
//		o.strMaker3("java");
//		System.out.println(" ab c d".replaceAll(" ", ""));
//		while(true) {
//			String input = sc.nextLine();
//			if(input.equals("quit")) break;
//			else strMaker2(input);
//		}
		String str1 = new String("abc");
		String str2 = "def";
		System.out.println(str1.concat(str2));
		System.out.println(str1.replace('a', 'd'));
		System.out.println(str1);
		
	}
	
}
