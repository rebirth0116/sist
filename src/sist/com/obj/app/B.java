package sist.com.obj.app;

public class B {
	private int b;
	private A a; //포함관계
	
	public B() { //기본생성자 
	}
	public B(int b) {
		this.b = b;
	}
	public B(A a) {
		this.a = a;
	}
	public B(int b, A a) {
		this.b = b;
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getB() {
		return this.b;
	}
	public void setA(A a) {
		this.a = a;
	}
	public A getA() {
		return this.a;
	}
	
}
