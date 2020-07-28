package sist.com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class UtilEx4 {
	String[] str = {"Ejb", "Was", "Servlet", "Action"};
	
	public void listEx1() {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>(10);
		list1.add("Java");
		list1.add("JQuery");
		list2.add("Java");
		list2.add("JQuery");
		list2.add("Oracle");
		
		
//		Object[] obj = list1.toArray();
//		System.out.println(((String)(obj[0])).charAt(0));
		
		System.out.println(list1.equals("Java")); //false
		//여기서 쓰인 eqauls의 오픈 소스를 확인하면, collection 끼리 비교하는 것을 알 수 있다.
		System.out.println(list1.equals(list2)); //true);
		
//		System.out.println(list1.contains("Oracle")); //false
//		System.out.println(list2.contains("Oracle")); //true
		
		System.out.println(list1.indexOf("JQuery"));
		System.out.println(list2.indexOf(null));
		System.out.println(list2.size());
		
		Iterator<String> i1 = list1.iterator();	//Iterator -> 반복자
		ListIterator<String> i2 = list1.listIterator(); 
		//Iterator 는 next()만 가능한데, listIterator의 경우 previous가 가능하다.
		i1.next(); //현재 데이터 반환 후 다음데이터 가르키기
		System.out.println(i1.next()); //JQuery
		
		System.out.println(i2.next()); //Java
		i2.previous(); //jquery를 리턴하고 Java를 가리킴
		System.out.println(i2.next());// Java를 리턴하고 Jquery를 가리킴
	}
	
	public void listEx2() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
//		ArrayList<String> list2 = new ArrayList<String>(str); //에러
		
		//asList(T ...a) -> T타입 어떤값이 들어오든 배열로 변환시켜 리턴함.
		
//		System.out.println(list); //==list.toString();
//		String temp = list.toString().substring(1, list.toString().length()-1); //괄호 빼기. 
//		== String temp = list.toString().substring(1, list.toString().lastIndexOf("]")); 로도 사용가능.
//		System.out.println(temp);
//		temp = temp.replaceAll(" ", ""); //빈칸없에기
//		System.out.println(temp);
//		String[] temp2 = temp.split(","); //,를 기준으로 배열에 저장
//		System.out.println(temp2[0]);
//		System.out.println(temp2[1]);
		
		
//		Object[] o = list.toArray();
//		//arrayList가 제공되는 toArray로 변환
//		for(int i = 0; i<o.length; i++) {
//			System.out.println(String.valueOf(o[i]).substring(1));
//			//valueOf를 통해 o를 한번만 String으로써 쓸 수 있음. -> substring을 사용할 수 있음으로 확인가능.
//		}
		
		
		System.out.println(list.toString());
		for(int i = 0; i<list.size();) {
//			System.out.println(list.get(i));
//			System.out.println(list.remove(i).concat("님안녕")); //문제발생. size가 줄어듦
			i = list.remove(list.get(i))?i++:i;
//			list.remove(list.get(i));
		}
		System.out.println(list.toString());
		
		
//		System.out.println(list.remove(0));
//		System.out.println(list.toString());
//		//list.remove(int index); 를 시행하면, list내에서 index에 해당하는 값이 사라진다.
//		// -> 해당 list의 size가 줄어들게 되어 사용에 주의가 필요하다.
		
		
//		System.out.println(list.size()); //4
//		list.remove(0); //element삭제
//		System.out.println(list.size()); //3 (4에서 element가 하나 삭제되어 3이 됨.)
	}
	
	
	public void listEx3() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
//		//elementData["Ejb", "Was", "Servlet", "Action"];
//		System.out.println(list.size());
//		list.remove(0);
//		//elementData["Was", "Servlet", "Action"];
//		System.out.println(list.get(0));
//		list.remove(0);
//		//elementData["Servlet", "Action"];
//		System.out.println(list.get(0));
		
		
//		System.out.println(list);
//		for(;list.size()!=0?list.remove(list.get(0)):false;) {
//			System.out.println(list);
//		}
		
		while(true) {
			System.out.println(list);
			list.remove(0);
			if(list.size() == 0) break;
		}
		
	}

	public void listEx4() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		System.out.println(list.toString());
		//iterator 반복자
		Iterator<String>it = list.iterator();
		System.out.println(it.next());//Ejb	
//		it.forEachRemaining();//?
		
		
	}
	
	public void vectorEx() {
		Vector<String> v = new Vector<String>(); //빈칸일경우 capacity = 10
		System.out.println(v.capacity()); //capacity
		v.ensureCapacity(12); //capacity보다 큰 경우 2배의 공간 할당 (20)
		v.ensureCapacity(21); //40
	}

	public void hashMapEx() {
		HashMap<Integer, String> h = new HashMap<>();
		//this.loadFactor = DEFAULT_LOAD_FACTOR;
		//DEFAULT_LOAD_FACTOR = 0.75f;
		h.put(1, "a");
		System.out.println(h.get(1)); //a
		System.out.println(h.size());
		
		
		
	}
	
	public InterfaceData interData() {
//		return new Itr();
		return new InterfaceData() {
			//anonymousClass
			
			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasData() {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}
	
	public class Itr implements InterfaceData{

		@Override
		public boolean hasData() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public void test() {
		ArrayList<String> st = new ArrayList<String>();
		//미리 공간을 배정하는것과 배정하지않는것의 차이는 크지않다.
		//배열의 크기를 지정하지 않을 경우, null이 아닌, {}이 들어간다.
		st.add("a");
		System.out.println(st.size());
//		st.add(2, "b"); //에러. index=2, size=1
		System.out.println(st.size());
		System.out.println(st);
	}
	
	public void test2() {
		new AbstractTest() {
			//AnonymousClass
			@Override
			public void add() {
				// TODO Auto-generated method stub
			}
		}.print();
		
		new testClass().new testInner().asd();
		//다른 클래스에서 이너클래스를 부를 때
	}
	
	public class testClass{
		public void testPrint() {
			System.out.println("testasd");
		}
		
		public class testInner{
			public void asd() {
				testPrint();
			}
		}

	}
	
	
	public static void main(String[] args) {
		UtilEx4 u = new UtilEx4();
//		u.hashMapEx();
		u.test2();
		
		
		
//		String[] s = {"a","b","c"};
////		System.out.println(Arrays.toString(s).substring(1,5));
//		System.out.println(Arrays.toString(s).substring(1, Arrays.toString(s).lastIndexOf("]")));
	}
}
