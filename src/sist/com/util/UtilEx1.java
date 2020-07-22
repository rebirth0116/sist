package sist.com.util;

import java.util.ArrayList;

//구조 List, Set, Map
public class UtilEx1 {
	
	public void listDemo1() {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("asd");
		list.add(true); //parameter의 type이 Object이므로 아무거나 가능
		System.out.println(list); // ==System.out.println(list.toString());
		System.out.println(list.get(0)); //10
		System.out.println(list.get(1)); //asd
		//list에 add 할 때, parameter 가 object이므로 다음과 같은 과정이 이루어진다.
		//Object o = new Integer(10); list.add(o);
		//이와 마찬가지로 String, boolean 등 나머지 type도 시행된다.
		System.out.println(Integer.parseInt(list.get(0).toString())+10); //20
//		이 경우, list.get(0)은 Integer가 아닌 Object형이다. 그러므로 parseInt가 안되기 때문에
//		toString 으로 String type으로 변환 후 작업한다.
		if(list.get(0) instanceof Integer) {
			System.out.println(((Integer)list.get(0)).intValue());
		}
		if(list.get(1) instanceof String) { // false
			System.out.println(((Integer)list.get(1)).intValue());
		}
		//계속 이렇게 instanceof를 쓰기엔 힘들어 Generics사용
	}
	
	public void listDemo2() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(3);
		a.addAll(b); //또다른 arrayList의 데이터 전부 넣기
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		UtilEx1 u = new UtilEx1();
		u.listDemo1();
	}
}
