package sist.com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

//CollectionFramework List, Set, Map
public class UtilEx6 {
	String[] str = {"Java", "Spring", "Java", "Oracle", "Html", "Jsp", "Spring"};

	public void setEx1() {
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		
		for(int i = 0; i<str.length; i++) {
			if(!set1.add(str[i])) {
				set2.add(str[i]);
				//HashSet add -> HashSet에 인자로 전달된 아이템을 저장하고, 
				//HashSet에 존재하지 않는 아이템이라면 true, 존재하는 아이템이라면 false를 리턴한다.
				//중복 -> false
				//HashSet은 순서가 없으므로 순서대로 안나옴.
			}
		}
//		System.out.println(set1);
//		System.out.println(set2); //중복된 것만 들어감 //?
		
		Iterator<String> it =  set1.iterator(); //Set
		Iterator<String> listIt = list.iterator(); //ArrayList
		
		
//		list.add("asd");
//		while(listIt.hasNext()) {
//			System.out.println(listIt.next()); 
//			//asd를 넣은 순간 modCount가 ++되어 ConcurrentModificationException 발생
//		}
		
		
		System.out.println(set1);
//		System.out.println(set1.clone()); //clone 했는데 순서가 다름 -> HashSet은 순서가 없다.
//		System.out.println(set1.contains("Jsp")); //true
//		set1.clear();
//		System.out.println(set1.isEmpty()); //true
//		System.out.println(set1.equals("Java")); //false
		
		HashSet<String> set3 = (HashSet<String>)set1.clone();
		System.out.println(set3); //set1과 순서 다름
		System.out.println(set1.equals(set3)); //set1과 3은 순서가 다름에도 HashSet은 순서가 없으므로 true.
		//이 경우, equals에서 containsAll 메소드를 사용해 모든 요소를 비교한다.
		//set1.equals(set1) 이라면, add메소드 내부의
		//if (o == this)
        //return true; 를 사용해 true를 반환한다.
		System.out.println("Java".equals(set3));
		//String의 equals와 set1의 equals는 작동방식이 다르다.
		
	}
	public void listEx1() {
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(str));
		HashSet<String> set1 = new HashSet<String>();
		for(String s : str) {
			
			set1.add(s);
		}
		ArrayList<String> list2 = new ArrayList<String>(set1); //HashSet도 Collection이므로 가능
		System.out.println("Set" + set1);
		System.out.println("List"+list1);
		System.out.println("List"+list2);
		
	}
	
	public void listEx2() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		ListIterator<String> listIt =  list.listIterator(); 
		//listIterator는 Iterator와는 다르게 previous가 가능하다. == DoubleLinkedList
		
		
//		 public void add(E e) {
//	            checkForComodification();
//
//	            try {
//	                int i = cursor;
//	                ArrayList.this.add(i, e);
//	                cursor = i + 1;
//	                lastRet = -1;
//	                expectedModCount = modCount;
//	            } catch (IndexOutOfBoundsException ex) {
//	                throw new ConcurrentModificationException();
//	            }
//	        }
		//ListIterator에 add 메소드가 존재한다. 이 경우, modCount가 재정의되므로 에러가 발생하지않는다.
		//다만, 도중에 넣을 경우 cursor가 +1 되므로 next로 출력할 때 add한 element는 건너뛰고 출력된다.
		
	
//		 public E next() {
//             checkForComodification();
//             int i = cursor;
//             if (i >= SubList.this.size)
//                 throw new NoSuchElementException();
//             Object[] elementData = ArrayList.this.elementData;
//             if (offset + i >= elementData.length)
//                 throw new ConcurrentModificationException();
//             cursor = i + 1;
//             return (E) elementData[offset + (lastRet = i)];
//         }
		
//		컴퓨터 과학에서 배열이나 자료 구조 오브젝트 내의 오프셋(offset)은 
//		일반적으로 동일 오브젝트 안에서 오브젝트 처음부터 주어진 요소나 지점까지의 변위차를 나타내는 정수형이다.
//		이를테면, 문자 A의 배열이 abcdef를 포함한다면 'c' 문자는 A 시작점에서 2의 오프셋을 지닌다고 할 수 있다.
		
		//여기서 사용된 offset은 subList에서부터 기인한 것이다. 시작 위치를 지정하는 변수라고 생각하면 될 듯.
		
		
		System.out.println(listIt.hasNext()); //true
		System.out.println(listIt.hasPrevious()); //false
		System.out.println(listIt.nextIndex()); //0 nextIndex는 cursor를 return한다.
		System.out.println(listIt.next()); //java
		System.out.println(listIt.nextIndex()); //1
		listIt.add("asd"); //cursor+1
		System.out.println(listIt.nextIndex()); //2
		System.out.println(listIt.next()); //spring
		System.out.println(listIt.next()); //java
		System.out.println(listIt.previous());//java
		System.out.println(listIt.nextIndex()); //3
		System.out.println(list);
		
		//ListIterator의 next Method.
//		public E next() {
//            checkForComodification();
//            int i = cursor;
//            if (i >= size)
//                throw new NoSuchElementException();
//            Object[] elementData = ArrayList.this.elementData;
//            if (i >= elementData.length)
//                throw new ConcurrentModificationException();
//            cursor = i + 1;
//            return (E) elementData[lastRet = i];
//        }
		
	}
	
	
	public static void main(String[] args) {
		UtilEx6 u = new UtilEx6();
//		u.setEx1();
//		u.listEx1();
//		u.listEx2();
	}
}
