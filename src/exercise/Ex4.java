package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Ex4 {
	//사자 인덱스 구하기
	static String[] str = {"사자", "호랑이","고양이","강아지","사자","사자","기린"};

	
	public static void solve1() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		ListIterator<String>listItr = list.listIterator();
		
		while(listItr.hasNext()) {
			if(listItr.next().toString().equals("사자")){
				System.out.println(listItr.previousIndex());
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		solve1();
	}
	
}
