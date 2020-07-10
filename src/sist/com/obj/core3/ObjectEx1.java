package sist.com.obj.core3;

public class ObjectEx1 {
	
	String str = "abc";

	public void method() {
		System.out.println(this.getClass());
		System.out.println(this.hashCode());
		System.out.println(Integer.toHexString(this.hashCode()));
		System.out.println(this);
		System.out.println(this.hashCode() == this.hashCode());
		System.out.println(this.hashCode() == new ObjectEx1().hashCode());
		System.out.println(this.toString());
		
	}
	
	public String toString() {
		return "Test";
		
	}
	
	public static void main(String[] args) {
		ObjectEx1 o = new ObjectEx1();
		o.method();
		System.out.println("===============================");
		ObjectEx1 o2 = new ObjectEx1();
		o2.method();
	}
	
}
