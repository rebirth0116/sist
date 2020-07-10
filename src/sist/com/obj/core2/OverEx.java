package sist.com.obj.core2;

public class OverEx {

	String resString="";
	Integer resI=0;
	
	public void add(Object obj) { //o1.add(2)에서 2를 Object로 업캐스팅
		
		if(obj instanceof Integer) {
			Integer i = (Integer)obj; //다운캐스팅
			resI+=i;
			System.out.println(resI);
		}
		
		if(obj instanceof String) {
			String str = (String)obj;
			resString+=str;
			System.out.println(resString);
			
		}
		
	}
	
	public void overExMethod() {
		Object obj = new Object();
		System.out.println(obj.toString());
		String str = new String("abc");
		obj = str;
		System.out.println(obj.toString());
	}
	
	public OverEx() {
		System.out.println(toString());
	}
	public String toString() {
		return "hi";
	}
	
	public static void main(String[] args) {
		OverEx o1 = new OverEx();
//		o1.add(2);
//		o1.add("abc");
//		o1.add(3);
//		o1.add("def");
		o1.overExMethod();
	}
}
