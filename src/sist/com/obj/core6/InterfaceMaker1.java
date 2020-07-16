package sist.com.obj.core6;

//Interface(완전추상) -- AbstractClass(일부추상) -- InstanceClass(완성클래스) 
public class InterfaceMaker1 {
	public void methodStr1() {
		CharSequence cs = new String("abc");
		System.out.println(cs.charAt(0));
		cs = new StringBuffer("abc");
		System.out.println(cs.charAt(0));
	}
	
	public void methodStr2() {
		CharSequenceEx ce1 = new StringEx();
		ce1.charAt(0);
		ce1 = new StringBufferEx();
		ce1.charAt(0);
		
		String s = new String("abc");
		System.out.println(s.contains(new StringBuilder("")));
	}
	
	public void methodStr3() {
//		String str1 = new String("java");
//		System.out.println(str1.charAt(2));
//		StringBuffer sb = new StringBuffer("java");
//		System.out.println(sb.charAt(2));
		
		StringBuffer sb = new StringBuffer();
	}
	
	public static void main(String[] args) {
		InterfaceMaker1 i = new InterfaceMaker1();
		i.methodStr3();
	}
}
