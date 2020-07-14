package sist.com.obj.core4;
//상속 inheritance, abstract class, interface


public class CoreObjectEx1 {
	
	public void coreEx1() {
		Double d= new Double(3.9);
		Integer i = new Integer(2);
		Float f = new Float(2.4);
		Long l = new Long(4);
		
		String s = new String();
		StringBuffer sb = new StringBuffer("abc");
		StringBuilder sbi = new StringBuilder();
		
		StringBuffer temp = sb;
		sb.append("select");
		System.out.println(temp==sb);
		System.out.println(temp);
		
		String a = new String("abc");
		String b = a;
		System.out.println(a==b);
		a+="def";
		System.out.println(a==b);
	}

	
	public static void main(String[] args) {
		CoreObjectEx1 c = new CoreObjectEx1();
		c.coreEx1();
		
	}
}
