package sist.com.variable;

//변수 [공간]
//클래스 (묶음, (속성 + 기능)) --> 설계도
//클래스는 속성과 기능을 묶는 것이다.
public class ActionVariableEx3 { // 클래스영역
	
	public void method1(){
	System.out.println("method1");	
	method2();
	System.out.println("method1");	
	}
	public void method2(){
	System.out.println("method2");
	method3();
	System.out.println("method2");	
	}
	public void method3(){
	System.out.println("method3");
	method4();
	System.out.println("method3");	
	}
	public void method4(){
	System.out.println("method4");
	method5();
	System.out.println("method4");	
	}
	public void method5(){
	System.out.println("method5");
	method6();
	System.out.println("method5");	
	}
	public void method6(){
	System.out.println("method6");
	method7();
	System.out.println("method6");	
	}
	public void method7(){
	System.out.println("method7");
	System.out.println("method7");	
	}
	
	
	public int methodEx(int a) {
		method1();
		
		return ++a;
	}
	

	public static void main(String args[]) { // 메소드 영역
		
		ActionVariableEx3 a = new ActionVariableEx3();
		int b = a.methodEx(3);
		System.out.println(b);


	}

}
