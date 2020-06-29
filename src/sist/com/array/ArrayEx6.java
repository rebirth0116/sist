package sist.com.array;

public class ArrayEx6 {

	public void arrayDemo1() {
		String str1 = "abacdef";
		String str2 = "def";
		String str3 = "def";
		String str4 = "1def";
		String str5 = "abac";
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		System.out.println(str1.codePointAt(0));
		System.out.println(str1.codePointBefore(1));
		System.out.println(str2.contentEquals(str3));
		System.out.println(str1.contains(str5));
		System.out.println(str1.endsWith(str2));
		
		
		
	}
	
	public void arrayDemo2(int x) {
		x+=50;
		System.out.println("arrayDemo2 x = "+x);
	}
	
	public void arrayDemo3(int x) {
		x++;
	}
	
	public void arrayDemo3_1(int[ ] x) {
		x[0]++;
	}
	
	public int[] arrayDemo3_2(int[] x) {
		
		
		return x;
	}
	public static void main(String[] args) {
		ArrayEx6 a = new ArrayEx6();
//		int x = 5;
//		a.arrayDemo1();
//		a.arrayDemo2(x);
//		System.out.println("main method x = "+x);
		int[] x = {10, 20, 30, 40, 50}; //[10][20][30][40][50]
		a.arrayDemo3(x[0]);         //x[0]인 데이터 10만 메소드에 넣는것 -> 본래 배열 x는 바뀌지않음
		System.out.println(x[0]);
		a.arrayDemo3_1(x);			//x의 주소를 메소드에 넣는것 -> 본래 배열 x가 바뀐다
		System.out.println(x[0]);
		
		int rs = a.arrayDemo3_2(x)[0];  //arrayDemo3_2의 반환형이 배열이므로 int로 받으려면 뒤에 [0]을 붙여야한다.
		int[] rs2 = a.arrayDemo3_2(x);
		String[] str = {"-1 0", "3 0"};
		System.out.println(str[0].charAt(2)=='0');
		System.out.println(str[0].charAt(0));
	}
}
