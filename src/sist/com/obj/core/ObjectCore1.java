package sist.com.obj.core;
//상속:객체를 유기적으로 연결하는것
//is a, has a
public class ObjectCore1 extends Object{
	
	
	public void strEx1() {
	}
	public void strEx2() {
		String str = "java";//묵시적으로 선언
		str+="oop";
		System.out.println(str);
	}
	public void strEx3() {
		String str1 = "abcd";
		String str2 = "abcd";
		System.out.println(str1 == str2);
	}
	public Object getInstance() { //Object - 모든 객체의 선조
		return 99.8;
	}

	public static void main(String[] args) {
		ObjectCore1 o1 = new ObjectCore1();
		o1.strEx3();
	}
}
