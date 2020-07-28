package sist.com.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class UtilEx5 {
	public void iterEx() {
		ArrayList<String> list = new ArrayList<String>();
		Vector<String> vector = new Vector<String>();
		list.add("XML");
		list.add("Dom");
		list.add("Sax");
		list.add("DTD");
		
		
		vector.add("App");
		vector.add("System");
		vector.add("Root");
		vector.add("Parent");
		
		Iterator<String> itr = list.iterator();
		list.remove(0); //ConcurrentModificationException 발생
		//modCount가 변했기 때문에 modCount!=expectedModCout 가되어 에러발생.
		//add 뿐만아니라 remove도 modCount를 올리는 점 주의
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next().concat("ASD"));
		
//		new InterfaceEx() {
//			
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				message();
//			}
//		}.show(); //message (default method)
	}
	
	public static void main(String[] args) {
		UtilEx5 u = new UtilEx5();
		u.iterEx();
	}
	
}
