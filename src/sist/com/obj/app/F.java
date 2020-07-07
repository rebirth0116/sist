package sist.com.obj.app;

public class F {
	private int f;
	private E e;
	public F() {
	}
	public F(int f) {
		this.f = f;
	}
	public F(E e) {
		this.e = e;
	}
	public F(int f, E e) {
		this.f = f;
		this.e = e;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getF() {
		return this.f;
	}
	public void setE(E e) {
		this.e = e;
	}
	public E getE() {
		return this.e;
	}
}
