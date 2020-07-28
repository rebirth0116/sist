package exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {
	static String[] str = {"a", "b", "c", "a", "b", "a"};
	static ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		
		
	public static void solve1() {
		int[] arr = new int[str.length];
		int size = 0;
		for(int i = 0; i< str.length; i++) {
			if(list.get(i).equals("a")) {
				arr[size] = i;
				size++;
			}
		}
		int temp = 0;
		for(int i = 0; i<size; i++) {
			list.remove(arr[i]-temp);
				temp++;
		}
		System.out.println(list);
	}
	
	public static void solve2() {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).equals("a")) {
				list.remove(i--);
			}
		}
		System.out.println(list);
	}
	

	public static void main(String[] args) {
		//a지우기
		Ex2 e = new Ex2();
//		e.solve1();
		e.solve2();
		
	}
}
