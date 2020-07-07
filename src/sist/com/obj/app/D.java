package sist.com.obj.app;

public class D {
	private int d;
	private C c;
	public D() {
	}
	public D(int d) {
		this.d = d;
	}
	public D(C c) {
		this.c = c;
	}
	public D(int d, C c) {
		this.d = d;
		this.c = c;
	}
	
	public void setD(int d) {
		this.d = d;
	}
	public int getD() {
		return this.d;
	}
	public void setC(C c) {
		this.c = c;
	}
	public C getC() {
		return this.c;
	}
}
