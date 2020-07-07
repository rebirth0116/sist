package sist.com.obj.app;

public class E {
	private int e;
	private D d;
	public E() {
	}
	public E(int e) {
		this.e = e;
	}
	public E(D d) {
		this.d = d;
	}
	public E(int e, D d){
		this.e = e;
		this.d = d;
	}
	
	public void setE(int e) {
		this.e = e;
	}
	public int getE() {
		return this.e;
	}
	public void setD(D d) {
		this.d = d;
	}
	public D getD() {
		return this.d;
	}
	
}
