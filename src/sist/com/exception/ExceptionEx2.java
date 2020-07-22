package sist.com.exception;

import java.util.Scanner;

public class ExceptionEx2 implements Cloneable{ 
	//cloneable인터페이스는 그저 클론이 가능하다는 정보만을 알려주는 인터페이스이므로 따로 기능이 존재하지 않는다.
	//cloneable이 없을 땐 CloneNotSupportedException이 발생한다. 
	private int value = 500;
	private String color = "red";
	public void exception1(int value) {
		//int rs = value/(int)Math.round();
		//System.in.read();
		int[] m = new int[5];
		
		for(int i = 0; i<m.length; i++) {
			try {
				m[i] = (int)Math.random()*50;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			}catch(ArithmeticException e) {
				System.out.println("ArithmeticException");
			}catch(NullPointerException e) {
				System.out.println("NullPointerException");
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException");
			}catch(Exception e) {
				System.out.println("Exception");
			}catch(Throwable e) { 
				//throwable이 예외처리 중 가장 위에 있으면, 아래에 있는 예외코드들이 작동할 일이 없기 때문에 에러가 발생한다.
				System.out.println("Throwable");
			}
		}
	}
	
	
	
	public void exception2() {
		try {
			Object object = this.clone(); //CompileException
			System.out.println(this.toString());
			System.out.println(object.toString());
		}catch(CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException");
		}catch(ClassCastException e) {
			System.out.println("ClassCastException");
		}catch(Throwable e) {
			System.out.println("Throwable");
		}
	}
	
	public static void main(String[] args) {
		ExceptionEx2 e = new ExceptionEx2();
//		e.exception1(150);
		e.exception2();
	}

}
