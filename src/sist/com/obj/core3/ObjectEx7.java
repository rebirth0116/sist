package sist.com.obj.core3;

import java.util.Calendar;

public class ObjectEx7 {

	
	public void methodTest() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
	}
	
	public static void main(String[] args) {
		ObjectEx7 o = new ObjectEx7();
		o.methodTest();
		final String str = "aaa";
		String str2 = "bbb";
		
		System.out.println(str.indexOf("a",str.indexOf("a")+1));
		System.out.println(str.concat(str2));
	}
}
