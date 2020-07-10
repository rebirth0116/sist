package sist.com.obj.core3;

public class ObjectEx2 {

	
	public void method() {
		Object obj = new Object();
		String str = new String("Abc");
		System.out.println(str.equals(obj));
	}
	
	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a.toString());
		
		B b = new B();
		System.out.println(b.toString());  
		//Object를 A가 상속받고 A를 B가 상속받기 때문에 Object에 있는 toString보다 A에 있는 toString이 실행된다.
		
	}
}
