package sist.com.util;

import java.util.AbstractList;
import java.util.List;

public class ArrayUser {
	private int data;
	
	public static<T> List<T> asListEx(T ...a){ /// parameter에 ... -> 동일한 parameter를 여러개 받을 때 자동으로 배열처리.
		//들어오는 타입대로 알아서 지네릭처리가 됨
		return new ArrayList(a);
	}
	
	public static class ArrayList<E> extends AbstractList{
		public static int value;
		E[] e;
		public ArrayList(E[] e) {
			this.e = e;
		}
		@Override
		public Object get(int index) {
			// TODO Auto-generated method stub
			return e[index];
//			return null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return e.length;
		}
		
	}
}
