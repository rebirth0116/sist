package sist.com.inner.core2;

import java.util.ArrayList;

//상속[is a, has a] interface, abstract class
public class InstanceClass1 {

	private int x;
	
	
	ArrayList <String> list = new ArrayList<String>() {
		int x = 30;
		
		@Override
		public String toString() {
			InstanceClass1.this.x = 300; // InstanceClass1의 x값
			x=50; //AnonymousClass 내부의 x 값
			return String.valueOf(x);
		}
	};
	
	public void add() {
		System.out.println(list);
	}


	public static void main(String[] args) {
		InstanceClass1 i = new InstanceClass1();
		i.add();
		System.out.println(i.x);
	}
}
