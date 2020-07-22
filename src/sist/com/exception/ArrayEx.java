package sist.com.exception;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

public class ArrayEx {
	private Object[] element = new Object[2];
	private int cursor = -1;
	private int size = element.length;
	int index;
	
	public void rangeCheck() {
		if(cursor>size) {
			throw new IndexOutOfBoundsException();
		}
	}
	public void add(int data) {
		rangeCheck();
		element[++cursor] = data;
	}
	public int get(int index) {
		rangeCheck(); //index가 음수인지 어떻게 체크?
		return (int)element[index];
	}
	public boolean hasNext() {
		return index!=size;
	}
	public int next() {
		if(element[index]==null || index>=size) {
			throw new NoSuchElementException();
		}
		return (int)element[index++];
	}
	public static void main(String[] args) {
		ArrayEx a = new ArrayEx();
		a.add(10);
		a.add(20);
//		a.add(30); //ArrayIndexOutOfBoundsException
//		System.out.println(a.get(1));
		while(a.hasNext()) {
			System.out.println(a.next());
		}
	}
}
