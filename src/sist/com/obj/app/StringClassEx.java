package sist.com.obj.app;

public class StringClassEx {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abcd";
		String str3 = "abcdeabcde";
		String str4 = new String("abcd");
		
		System.out.println(str1.substring(2)); //cd
		System.out.println(str1.substring(0, 2)); //ab
//		System.out.println(str2.substring(2, 1)); //에러
		System.out.println(str2.substring(2, 3)); //c
		System.out.println(str1==str2); //true
		System.out.println(str1==str4); //false
		str4 = str4.intern();
		System.out.println(str1==str4); //true
		//String 클래스의 intern()은 String인스턴스의 문자열을 'constant pool'에 등록한다.
		//'constant pool'에 이미 존재할 경우에는 해당 문자열의 주소를 반환한다.
		System.out.println(str1.equals(str4)); //true
		System.out.println(str3.contains(str4)); //true
		System.out.println(str1.contains("bc")); //true
		System.out.println(str3.indexOf('c')); //2
		System.out.println(str3.lastIndexOf('c')); //7
	}
}
