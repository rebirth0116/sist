package sist.com.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.Vector;

// List ArrayList, Vector, Stack, HashSet, HashMap[Key|Value]
public class UtilEx7 {
	
	public void listProcess1() {
		Vector<String> v = new Vector<>();
		//vector의 매개변수로 collection이 들어갈 수 있으므로 new vector가 가능
		//vector generics내부에 vector나 hashset이 들어갈 수 있다.
		
		v.add("Css");
		v.add("JQuery");
		v.add("Ajax");
		v.add("JavaScript");
		v.add("EcmaScript");
		
		Vector<String> v2 = new Vector<String>();
		v2.add("a");
		v2.add("b");
		v2.add("c");
		
//		System.out.println(v);
		ArrayList<Vector<String>> list1 = new ArrayList<Vector<String>>();
		list1.add(v);
		list1.add(v2);
		
//		for(Vector<String>vec : list1) {
////			System.out.println(vec); //두가지 벡터 출력
//			for(String str : vec) {
//				System.out.println(str); //두 벡터에 있는 요소들 출력
//			}
//		}
		
//		System.out.println(list1.toString()); //[[Css, JQuery, Ajax, JavaScript, EcmaScript], [a, b, c]]
		
		Vector<String> temp = list1.get(0);
//		System.out.println(temp); //[Css, JQuery, Ajax, JavaScript, EcmaScript]
		
//		Iterator<String> iv1 = temp.iterator();
//		for(;iv1.hasNext();) {
//			System.out.println(iv1.next());
//		}
		
		ListIterator<String> listItr = temp.listIterator();
//		while(listItr.hasNext()) {
//			System.out.println(listItr.next());
//		}
//		System.out.println("반전");
//		
//		while(listItr.hasPrevious()) {
//			System.out.println(listItr.previous());
//		}
		
		Enumeration<String> e = temp.elements(); //열거형, 동기화 가능
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	
	public void stringToken() {
		StringTokenizer st = new StringTokenizer("2020/07/27","/");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
	
	
	public static void main(String[] args) {
		UtilEx7 u = new UtilEx7();
//		u.listProcess1();
		u.stringToken();
	}
}
