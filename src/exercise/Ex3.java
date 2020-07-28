package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex3 {
	static String[] str = {"aa", "asd","a","ac","e","da","d"};
	//전체에서 a들어간 문자열 지우기
	
	public static void solve1() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		for(int i = 0 ; i<list.size(); i++) {
			for(int j = 0; j<list.get(i).length(); j++) {
				if(list.get(i).charAt(j)=='a') { //contains 사용 시 더 간단함.
					//list.get(i).contains("a"); ->이중for문 불필요
					list.remove(i--);
					break;
				}
			}
		}
		System.out.println(list);
	}
	
	public static void solve2() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		Iterator<String> itr = list.iterator();
		int i = 0;
		while(itr.hasNext()) {
			if(itr.next().contains("a")) {
				itr.remove();	//itr.remove 해도 본래 list에서 제거가 된다.
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		solve2();
		
	}

}
