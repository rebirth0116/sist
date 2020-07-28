package sist.com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class UtilEx8 {
	
	String[] str = {"참을수 없는 존재의 가벼움", "파리대왕", "이방인", "어린왕자"};
	
	public void listProcess1() {
		ArrayList<String> alist = new ArrayList<>(Arrays.asList());
		Vector<String> vList = new Vector<String>(Arrays.asList(str));
		
//		alist.add("국가란무엇인가");
		alist.addAll(vList);
//		System.out.println(alist);
		
		ArrayList<String> total = new ArrayList<String>();
		total.addAll(vList);
//		System.out.println(total);
		
		System.out.println(vList.get(3)); //파리대왕
		System.out.println(alist.get(4)); //파리대왕
		
		
		
		Stack<String> stack = new Stack<>();
		stack.addAll(total);
		System.out.println(stack.capacity()); //10
		
//		System.out.println(stack.elementAt(1));//이방인
//		System.out.println(stack.get(11));//이방인
		
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop()); //어린왕자 이방인 파리대왕 참을수없는존재의가벼움
//		}
		
	}
	
	public void stringEx() {
		String str = "abc";
		String temp = str;
		str+="def";
		System.out.println(str==temp); //false
		//기존의 문자열에 추가하는 것이 아니라 새로운 문자열을 만든다.
		
		CharSequence cs = new StringBuffer();
		CharSequence cs2 = new StringBuilder();
		// new StringBuffer(); 괄호 안에 CharSequence 가 들어갈 수 있기 때문에, 
		// 괄호 안에 StringBuffer나 StringBuilder가 들어갈 수 있다.
		StringBuffer sb = new StringBuffer();
		
	}
	
	public void stringEx2() {
		//StringBuffer와 StringBuilder는 동기화에 차이가 있다.
		//synchronized를 StringBuffer만 지원한다.
		//먼저 들어온게 lock을 걸 수 있다?
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		sb1.append("Asd");
		sb2.append("qwe");
	}
	
	public void stringEx3() {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //16
		System.out.println(sb.length()); //0
		sb.append("asd");
		System.out.println(sb.capacity()); //16
		System.out.println(sb.length()); //3
	}
	
	public static void main(String[] args) {
		UtilEx8 u = new UtilEx8();
//		u.listProcess1();
		u.stringEx3();
	}
}
