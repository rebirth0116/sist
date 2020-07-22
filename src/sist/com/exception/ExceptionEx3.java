package sist.com.exception;

import java.io.IOException;

//RunTime, Compile
public class ExceptionEx3 {
	public void interruptedException() {
		for(int i = 1; i<=100; i++) {
			if(i%5==0)System.out.println();
			try {
				Thread.sleep(100); //Compile error -> interruptedException 
				// sleep 하다가 다시 작동하지 않을 수 있음
				System.in.read();
				System.out.printf("%5d",i);
				if(i==8) {
					throw new InterruptedException();
				}
				
			}catch(InterruptedException e) {
				System.out.println("InterruptedException");
				e.printStackTrace();
				return;
			}catch(IOException e) {
				System.out.println();
			
			}
		}
	}
	
	public void InterruptedFunction() {
		System.out.println("InterruptedFunction");
	}
	
	public void execptionEx1() throws InterruptedException {//해당 예외를 처리하지 않고 부른 곳으로 던진다.
		int i = 0;
		while(true) {
			if(++i<=100) {
				Thread.sleep(100);
				System.out.println(i);
			}
		}
	}
	public void execptionEx2() throws InterruptedException{

	}
	public void execptionEx3() {
//		execptionEx2(); //이 경우 Ex2에서 예외를 부른곳으로 던지는데, 이 때 부른 곳인 Ex3에서 예외처리를 하지 않았기에 에러가 발생한다.
		//Ex3도 예외를 throw하면 이 메소드를 부른 곳. 즉, main 메소드에서 에러가 발생한다.
		try {
			execptionEx2();
		}catch(InterruptedException e) {
			
		}
	}
	
	
	public static void main(String[] args) {
		ExceptionEx3 e = new ExceptionEx3();
//		e.interruptedException();
		e.execptionEx3();
	}
}
