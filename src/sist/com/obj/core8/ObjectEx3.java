package sist.com.obj.core8;

import java.util.*;
import static java.lang.System.out;

public class ObjectEx3 extends Vector<String>{
		Vector<String>v;
		ArrayList<String> array;
		Stack<String> stack;
		
		
	public ObjectEx3() {
//		this.clone();
//		new ObjectEx3().clone();
//		new Object().clone(); //불가능. clone은 protected 이므로 후손만 접근가능
		out.println("test");
	}

	public static void main(String[] args) {
		new ObjectEx3();
	}
}
