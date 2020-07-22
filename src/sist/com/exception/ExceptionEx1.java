package sist.com.exception;

import java.util.Random;

//예외 RunTimeException||CompileException
public class ExceptionEx1 {
	
	
	public void arrayIndexOutOfBoundsException() {
		int[] m = new int[5];
		for(int i = 0; i <= m.length; i++) { //ArrayIndexOutOfBoundsException발생 -> 실행할 때 발생 = RunTimeException
			try {
				m[i] = i+1;
				System.out.println(m[i]);
				if(i==1)return;
			}catch(ArrayIndexOutOfBoundsException e) {
				//catch = 오류 발생 시 실행되는 로직
				e.printStackTrace();
				System.out.println("catch");
			}finally {
				//finally = 예외 여부와 관계없이 실행되는 로직 (return 이전에 한번 실행됨)
				System.out.println("finally");
			}
		}//for
		Throwable t = new Exception();
		t = new ArrayIndexOutOfBoundsException();
	}//method
	
	public void arithmeticException() {
		int[] m = new int[5];
		int rs = 0;
		for(int i = 0; i < m.length; i++) {
			m[i] = (int)Math.random()*100;
			rs = 100/m[i];
			System.out.println(rs);
		}
	}
	
	public void randomEx() {
//		System.out.println((int)(Math.random()*5));
		Random r = new Random();
		boolean[] b= new boolean[10];
		
		for(int i = 0; i<b.length; i++) {
			b[i] = r.nextBoolean();
		}
		for(boolean bb : b) {
			System.out.println(bb);
		}
		System.out.println(r.nextInt(3));
	}
	
	public String getValue(int index) {
		switch(index) {
		case 1:
			return "일";
		case 2:
			return "이";
		case 3:
			return "삼";
		case 4:
			return "사";
		}
		return null; //nullPointerException 발생
	}
	
	public void nullPointerException() {
		String temp = getValue((int)(Math.random()*5));
		if(temp!=null) {
			System.out.println(temp.substring(0));
		}else {
			Integer.parseInt(temp); //NumberFormatException발생
		}
	}
	
	public void numberFormatException(String value) {
		int i = Integer.parseInt(value.substring(1,3)) + Integer.parseInt(value.substring(4,6));
//		i = Integer.parseInt(value.substring(1,3)) + Integer.parseInt(value.substring(3,6)); //numberFormatException발생
		System.out.println(i);
		
	}
	
	public void stringIndexOutOfBoundsException(String value) {
//		System.out.println(value.substring(0,8)); //StringIndexOutOfBoundsException발생
		System.out.println(value.split("#")[2]); //StringIndexOutOfBoundsException발생
	}
	
	public static void main(String[] args) {
		ExceptionEx1 e = new ExceptionEx1();
//		e.arrayIndexOutOfBoundsException();
//		e.arithmeticException();
//		e.randomEx();
//		e.nullPointerException();
//		e.numberFormatException("F10오36E");
		e.stringIndexOutOfBoundsException("Abc#Def");
		
	}
	
}
