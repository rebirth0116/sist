package sist.com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilEx2 {

	public void listEx1() {
//		ArrayList<String> list1 = new ArrayList<String>(1); //elementData
//		list1.add("딸기");
//		list1.add(0, "사과"); //이 경우 "딸기"가 사라지는것이 아닌, 0번째 자리에 "사과가"들어가고 "딸기"는 뒤로 밀린다.
//		list1.set(0, "당근"); //이 경우 0번째에 "당근"을 덮어씌운다.
//		System.out.println(list1);
//		System.out.println(list1.contains("딸기"));
//		Object list2 =  list1.clone();
//		System.out.println(list2);
//		System.out.println(list1.size());
//		Vector<String> v = new Vector<String>();
//		v.add("배");
//		v.add("수박");
////		list1.addAll(2, v);
//		System.out.println(list1); //당근 딸기
//		list1.addAll((Collection<String>)list1); 
//		System.out.println(list1); //당근 딸기 당근 딸기
		ArrayList<Double> list3 = new ArrayList<Double>();
		list3.add(10.5);
		list3.add(10.6);
		list3.add(10.7);
		list3.add(10.8);
		list3.add(10.6);
		list3.add(10.1);
		list3.add(10.7);
		System.out.println(list3);
		list3.remove(10.5);
		System.out.println(list3);
		list3.remove(list3.indexOf(10.6));
		System.out.println(list3);
		list3.remove(list3.lastIndexOf(10.7));
		System.out.println(list3);
		
	}
	public void listEx3() {
		String[] str = {"xml", "sgml", "protocol", "metaData"};
		List<String> list = Arrays.asList(str);
		// List는 인터페이스, ArrayList는 class이다.
		System.out.println(list);
//		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
//		System.out.println(list);
	}
	
	public static void main(String[] args) {
		UtilEx2 u = new UtilEx2();
//		u.listEx3();
		String[] s = {"A", "B", "D", "D"};
		List<String> l = ArrayUser.asListEx(s); //arraylist 형이니 list로 받기 가능
		System.out.println(l.contains("A"));
	}
}
