package report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

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
		listItr.next();													  //BA반환
		listItr.remove();												  //마지막으로 반환했던 값 삭제
		System.out.println(arrList);									  // -->[B, C]
		System.out.println(listItr.next());
		listItr.set("asd");												  //마지막으로 반환한 값을 다시 set함
		System.out.println(arrList);									  // -->[asd, C]
	}
	
	public static void stringEx() {
		String str = "ab cd";
		String str1 = "asd";
		String str2 = "ASD";
		String str3 = new String("asd");
		String str4 = "  asd";
		System.out.println(str.charAt(0));								  //문자열에서 int i번째 문자 반환 --> a
		System.out.println(str.codePointAt(0));							  //문자열에서 int i번쨰 문자 유니코드 반환 --> 97
		System.out.println(str.codePointBefore(1));	 					  //문자열에서 int i번째 바로 전의 문자 유니코드 반환 --> 97
		System.out.println(str.codePointCount(0, 5));					  //지정 범위의 유니코드 갯수 반환 --> 5
		System.out.println(str1.compareTo(str2));						  //문자 하나씩 더 짧은 문자열의 길이만큼 비교하며 같지않은경우 해당 문자들의 유니코드 차이 반환 --> 0
		System.out.println(str1.compareToIgnoreCase(str2));				  //문자 하나씩 더 짧은 문자열의 길이만큼 비교하며 같지않은경우 대문자로, 그래도 같지않은경우 소문자로 변환하여 유니코드차이 반환 --> 0
		System.out.println(str1.concat(str2));							  //문자열에 문자열 더하기 --> asdASD
		System.out.println(str1.contains("sd"));	 					  //문자열에 대상문자열 포함되어있는지 확인 --> true
		System.out.println(str1.contentEquals(new StringBuilder("asd"))); //CharSequence 타입의 문자열과 비교 --> true
		System.out.println(str1.endsWith("d"));							  //해당 문자열로 끝나는지 확인 --> true
		System.out.println(str1.equals(str3)); 							  //해당 문자열과 같은지 확인 --> false
		System.out.println(str1.equalsIgnoreCase(str2)); 				  //해당 문자열과 대소문자 관계없이 같은지 확인 --> true
		System.out.println(str1.indexOf("sd"));  						  //해당 문자열이 어디있는지 확인. 없으면 -1반환 --> 1
		System.out.println(str1.concat("asd").indexOf("asd", 1)); 		  //int i부터 문자열이 어디서 처음 나오는지 확인 --> 3
		System.out.println(str1.equals(str3.intern()));					  //문자열은 같지만 다른 객체인 경우 그 문자열을 String pool에서 확인하여, 있는경우 해당 String을 반환한다. --> true
		System.out.println(str1.isEmpty()); 							  //해당 문자열이 비어있는지 확인 --> false
		System.out.println(str1.concat("asd").lastIndexOf("sd"));  		  //뒤에서부터 확인하여 해당 문자열 시작점의 index반환 --> 4
		System.out.println(str1.length());  							  //해당 문자열 길이 반환 --> 3
		System.out.println(str1.matches(str3)); 						  //정규식 표현을 포함하여 같은지 확인 --> true
		System.out.println(str1.offsetByCodePoints(1, 1));				  //index위치로부터 offset위치만큼 이동한 자리의 index 반환 -> 2
		System.out.println(str1.replace("a", "d"));						  //문자열을 다른 문자열로 치환 --> dsd
		System.out.println(str1.replaceAll("d", "e"));					  //해당 정규식을 다른문자열로 치환 --> ase
		System.out.println(str1.startsWith("as"));	 					  //해당 문자열로 시작하는지 확인 --> true
		System.out.println(str1.substring(1, 2));  						  //문자열을 첫번째 int부터 두번째 int이전까지 출력 --> s
		System.out.println(str1.toCharArray());  						  //문자열을 character배열로 변환
		System.out.println(str2.toLowerCase());  						  //문자열을 소문자로 변경 --> asd
		System.out.println(str1.toUpperCase());  						  //문자열을 대문자로 변경 --> ASD
		System.out.println(str4.trim()); 								  //문자열 앞 뒤 공백 제거 -->asd
		str.split(" ");								 					  //문자열을 해당 문자열을 기준으로 나누어 배열로 만듦. -->[ab][cd]
	}
	
	public static void stringBufferEx() {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append("asd"));  							  //StringBuffer에 추가 --> asd
		System.out.println(sb.append("def"));							  //asddef
		System.out.println(sb.delete(0, 2));  							  //첫인덱스부터 두번째인덱스까지 삭제 -->ddef
		System.out.println(sb.insert(3, "a"));  						  //해당 인덱스 자리에 추가 --> ddeaf
		System.out.println(sb.reverse());  								  //해당 StringBuffer 반대로 --> faedd
		System.out.println(sb.replace(0, 1, "ZXC"));  					  //첫번째 인덱스부터 두번째 인덱스까지 해당문자열로 교체 -->ZXCaedd
		System.out.println(sb.subSequence(2, 4));  						  //첫인덱스부터 두번째 인덱스전까지 반환 --> Ca
		sb.setCharAt(0, 'a');  											  //해당 인덱스 해당문자로 교체
		sb.setLength(3);  												  //크기 조절, 현재보다 클 경우 남은공간 '\0'으로 채워짐.
		System.out.println(sb);  										  //aXC
	}
	
	public static void stackEx() {
		Stack<String> st = new Stack<String>();
		st.add("asd");  												  //stack에 추가
		st.add("qwe");
		System.out.println(st); 										  //--> [asd, qwe]
		Stack<String> st2 = (Stack<String>) st.clone(); 				  //해당 stack 복사
		st.addAll(st2);  												  //해당 stack에 전부 추가
		System.out.println(st);  										  //--> [asd, qwe, asd, qwe]
		st2.clear();  													  //해당 stack 비우기
		System.out.println(st2);  										  //--> []
		System.out.println(st.contains("qwe"));  						  //stack이 포함하고있는지 확인 --> true
		System.out.println(st2.empty());  								  //stack이 비어있는지 확인 --> true
		System.out.println(st.elementAt(2));  							  //stack 내부에서 해당 index값이 지시하는값 반환
		System.out.println(st.pop());  									  //가장 마지막 들어간 요소 제거하면서 반환 --> qwe
		System.out.println(st.peek());  								  //가장 마지막 들어간 요소 반환 --> asd
		st.push("ddd");  												  //stack 마지막에 해당 요소 추가
		System.out.println(st.peek());  								  //--> ddd
	}
	
	public static void vectorEx() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(3);														  //해당 요소 추가
		v.add(2);
		System.out.println(v);											  //[3, 2]
		System.out.println(v.capacity()); 								  //해당 vector에 할당한 공간 반환 --> 10
		System.out.println(v.size());  									  //해당 vector에 실제로 값이 들어있는 공간 반환 --> 2
		Vector<Integer> v2 = (Vector<Integer>) v.clone(); 				  //복제
		v.addAll(v2);													  //대상 vector요소 전부 추가
		System.out.println(v); 											  //[3, 2, 3, 2]
		System.out.println(v.lastElement()); 							  //마지막 요소 반환 --> 2
	}
	
	
	public static void main(String[] args) {
//		arrayListEx();
//		listIteratorEx();
//		stringEx();
//		stringBufferEx();
//		stackEx();
		vectorEx();
	}
}
