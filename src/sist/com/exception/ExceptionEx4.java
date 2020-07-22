package sist.com.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionEx4 {
	public void listEx1() {
		ArrayList<String>list = new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("Jsp");
		list.add("Jsp");
		Iterator<String> it = list.iterator(); //Itr(next, hasNext Iterator(next, hasNext))
		System.out.println(it.next()); //Java
		System.out.println(it.next()); //Oracle
		System.out.println(it.next()); //Jsp
		System.out.println(it.next()); //Jsp
//		System.out.println(it.next()); //NoSuchElementException 에러발생
		while(it.hasNext()) {
			System.out.println("it.next()"); //이 경우, cursor가 증가하지 않기때문에 무한루프
			System.out.println(it.next()); //이 경우, cursor가 하나씩 증가하기 때문에 정상작동
		}
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String s : list) {
			System.out.println(s);
		}
//		System.out.println(list.size()); //4
//		System.out.println(list.get(-1)); //ArrayIndexOutOfBoundsException
//		System.out.println(list.remove(0).concat("deleted")); //Javadeleted
//		System.out.println(list.toString()); //[Oracle, Jsp, Jsp]
	}
	public static void main(String[] args) {
		ExceptionEx4 e = new ExceptionEx4();
		e.listEx1();
	}
}
