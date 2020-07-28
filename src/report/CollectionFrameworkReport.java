package report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionFrameworkReport {
	static String[] strArr = {"BA","B","C"};
	static ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(strArr));
	static ListIterator<String> listItr = arrList.listIterator();
	
	public static void arrayListEx() {
		System.out.println(arrList.contains("BA")); 					  //A가 있는지 없는지 검사 --> true
		ArrayList<String> arrList2 = (ArrayList<String>) arrList.clone(); //ArrayList를 복사 --> arrList2 = [BA, B, C]
		arrList.add("E");												  //맨 뒤에 문자열 추가 --> [BA, B, C, E]
		arrList.add(3, "D"); 											  //int i자리에 문자열 추가 --> [BA, B, C, D, E]
		System.out.println(arrList.containsAll(arrList2)); 				  //arrList2의 요소들 전부 arrList에 있는지 확인 --> true
		arrList2.clear(); 												  //arrayList2 모든 요소 삭제 --> []
		System.out.println(arrList.get(0));								  //int를 받아 그 자리에 있는 문자열 반환 --> BA
		System.out.println(arrList.getClass()); 						  //Object가 어떤 class인지 반환
		
	}
	
	public static void listIteratorEx() {
		while(listItr.hasNext()) { 										  //ListIsterator의 next에 element가 있는지 판별 --> 있으면 true, 없으면 false.
			System.out.println(listItr.next()); 						  //cursor를 +1하고, 다음 element를 반환한다. --> BA	B	C
		}
		while(listItr.hasPrevious()) { 									  //ListIsterator의 previous에 element가 있는지 판별 --> 있으면 true, 없으면 false.			
			System.out.println(listItr.previous());						  //cursor를 -1하고, 이전 element를 반환한다. --> C	B	BA
		}
	}
	
	
	public static void main(String[] args) {
//		arrayListEx();
		listIteratorEx();
	}
}
