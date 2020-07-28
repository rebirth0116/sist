package sist.com.util;

import java.util.Stack;

public class UtilEx9 {
	String[] str1 = {"국어국문", "영어영문", "컴퓨터공학", "불어불문", "일어일문"};
	String[] str2 = {"자료구조", "디지털논리", "공업수학", "소프트웨어공학", "디자인패턴"};
	
	
	public void stackEx() {
		Stack<String> stack1 = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		for(int i = 0; i<str1.length; i++) {
			stack1.push(str1[i]);
			stack2.push(str2[i]);
		}
		
		System.out.println(stack1.pop());
		System.out.println(stack1);
		System.out.println(stack2.search("디지털논리")); //4
		System.out.println(stack2.search("디자인패턴")); //1
		System.out.println(stack2.indexOf("디지털논리")); //1
		System.out.println(stack2.elementAt(0));
		
	}
	
	
	public static void main(String[] args) {
		UtilEx9 u = new UtilEx9();
		u.stackEx();
	}
}
