package sist.com.obj.core3;

public class ObjectEx4 {

	
	public void strMaker() {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2); //true
		System.out.println(str1.equals(str2)); //true
		
		String temp = str2;
		System.out.println(str2 == temp); //true
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4); //false
		System.out.println(str3.hashCode()==str4.hashCode()); //true
	}
	
	public static void main(String[] args) {
		ObjectEx4 o = new ObjectEx4();
		o.strMaker();
	}
}
