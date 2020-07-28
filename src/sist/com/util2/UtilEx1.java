package sist.com.util2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Set;

public class UtilEx1 {
	
	public void utilProcess1() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Java"); 
		map.put(2, "Oracle"); 
		map.put(3, "Jsp"); 
		map.put(4, "Spring"); 
		map.put(5, "Flex"); 
		System.out.println(map);
		Set<Integer>set = map.keySet();
		for(int i: set) {
			System.out.println("key : " + i + " value : " + map.get(i));
//			System.out.println(set); //[1, 2, 3, 4, 5]
		}
		
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("key : " + i + " value : " + map.get(i));
		}
		//set에 key가 들어있어 이를 Iterator로 하나씩 불러와 key와 value를 출력
		
		
		Set<Entry<Integer, String>> es = map.entrySet();
//		System.out.println(es);//[1=Java, 2=Oracle, 3=Jsp, 4=Spring, 5=Flex]
		Iterator<Entry<Integer, String>> is = es.iterator();
		while(is.hasNext()) {
			Entry<Integer, String> en = is.next();
//			System.out.println(en);//1=Java, 2=Oracle, 3=Jsp, 4=Spring, 5=Flex
			System.out.println("key : " + en.getKey() + " value : " + en.getValue());
		}
	}
	
	public void utilProcess2() {
		Properties properties = new Properties();
		properties.put("일",	"HTTP");
		properties.put(2, "TCP");
		properties.put("삼", "LAN");
		properties.put(10.5, new ArrayList<String>());
		//properties는 기본적으로 generics가 없다.

		Enumeration<Object> en = properties.keys();
		for(;en.hasMoreElements();) {
			Object o = en.nextElement();
			if (o instanceof String) {
				System.out.println(((String) o).charAt(0));
//				System.out.println(properties.get(((String) o).charAt(0))); 
				//-> String형 key가 있지만, charAt을 하면 Character형으로 바뀌어 작동하지않음
				System.out.println(properties.get(((String) o)));
			}
			if (o instanceof Integer) {
				System.out.println(((Integer)o).intValue());
				System.out.println(properties.get(((Integer)o).intValue()));
			}
			if (o instanceof Double) {
				System.out.println(((Double)o).doubleValue());
				System.out.println(properties.get(((Double)o).doubleValue()));
			}
		}
		//이 부분 형변환에 주의할 것!!
		
		System.out.println(properties.get("일")); //HTTP
		
		Iterator<Object> itr =  properties.keySet().iterator();
		//keySet 내부에 String, Integer, Double 등 여러가지가 있으므로 Object로 받는다.
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof String) {
				System.out.println("Key : "+o+" Value : "+properties.get(o));
			}
		}
	}
	
	public void utilProcess3() {
		HashMap<String, HashMap<Integer, String>> map = new HashMap<String, HashMap<Integer,String>>();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map1.put(1, "Html");
		map1.put(2, "Css");
		map1.put(3, "Ajax");
		map1.put(4, "JQuery");
		map1.put(5, "React");
		
		map2.put(1, "Java");
		map2.put(2, "C++");
		map2.put(3, "C#");
		map2.put(4, "Oracle");
		map2.put(5, "MSsql");
		
		map.put("Front", map1);
		map.put("BackEnd", map2);
		
		System.out.println(map.get("Front").get(2)); //Css
		
//		Set<Entry<String, HashMap<Integer, String>>> s = map.entrySet();
//		Iterator<Entry<String, HashMap<Integer, String>>> itr = s.iterator();
		//한줄로 축약가능
		Iterator<Entry<String, HashMap<Integer, String>>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String, HashMap<Integer, String>> et = itr.next();
			System.out.println(et);
//			String key = et.getKey();
			Iterator<Entry<Integer, String>> itrMap = et.getValue().entrySet().iterator();
			while(itrMap.hasNext()) {
				Entry<Integer, String> ey = itrMap.next();
				System.out.println(ey.getKey()+" : "+ey.getValue());
			}
		}
	}
	
	public void utilProcess4() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("java", 50.3);
		map.put("asd", "def");
		System.out.println(map);
	}
		
	
	
	public static void main(String[] args) {
		UtilEx1 u = new UtilEx1();
//		u.utilProcess1();
//		u.utilProcess2();
//		u.utilProcess3();
		u.utilProcess4();
	}

}
