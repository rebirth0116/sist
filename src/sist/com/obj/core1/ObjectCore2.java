package sist.com.obj.core1;

import java.io.ObjectInputStream.GetField;

public class ObjectCore2 extends Object { 
	//Object class는 모든 class에 상속되어있다.(생략)
	//Objectcore2 is a Object
	
	public ObjectCore2() {
//		this. 
		//-> this는 ObjectCore2 이고, ObjectCore2는 Object이다.
		//그러므로 this. 하면 Objectcore2의 기능 뿐만아니라 Object의 method들을 사용할 수있다.
		
//		Object o = new ObjectCore2();
//		o.
		//Object의 method만 사용 가능
		
//		Object obj = this;
		//obj. -> ObjectCore2의 기능이 아닌 Object의 기능만 사용 가능 
	}

	public void demo(Object obj) {
		Object o = new ObjectCore2();
		//ObjectCore2는 Object를 상속한다. 그러므로 ObjectCore2에 Object가 포함되기에 사용이 가능하다. 
		//다만, 기능이 제한적이다.(Object의 method만 사용가능)
//		ObjectCore2 o2 = new Object(); 
		//ObjectCore2에 Object가 있는 것이지 Object안에 ObjectCore2가 있는것이 아니기때문에 불가능
		// -> 
//		System.out.println((int)obj); 
		//이 경우 obj에 int가 오면 실행이 되지만, 다른 형이 오면 ClassCastException 오류가 발생한다.
		
		//해결방법
		if(obj instanceof String) {
			System.out.println("o instanceof String");
		}
		if(obj instanceof Integer) {
			System.out.println("o instanceof Integer");
		}
		if(obj instanceof Double) {
			System.out.println("o instanceof Doouble");
		}
	}
	public Object getData() {
		return new Integer("3");
	}
	
	public static void main(String[] args) {
		ObjectCore2 o = new ObjectCore2();
		o.demo(new Integer(3));
		o.demo(new String("abc"));
		Object obj = o.getData();
		if(obj instanceof String) {
			System.out.println(2);
		}else if(obj instanceof Integer) {
			System.out.println(1);
			Double d = new Double (4);
//			obj = d;
			Object o1 = new Double(5);
//			Double a = (Double)obj; //에러 
			Integer i = (Integer) obj;
			System.out.println(o1);
//			if(o1 instanceof Double) System.out.println(1);
//			Double d1 = (double)new Object(); //에러
			Object o2 = new Double(3);
			Double d1 = (Double)o2;
		}
	}
}
