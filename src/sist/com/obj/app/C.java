package sist.com.obj.app;

public class C {
	private int c;
	private B b;  //포함관계
	
	public C() {
	}
	public C(int c) {
		this.c = c;
	}
	public C(B b) {
		this.b = b;
	}
	public C(int c, B b) {
		this.c = c;
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getC() {
		return this.c;
	}
	public void setB(B b) {
		this.b = b;
	}
	public B getB() {
		return b;
	}
	
}
