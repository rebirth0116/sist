package sist.com.obj.app;

public class G {
	private int g;
	private F f;
	public G() {
	}
	public G(int g) {
		this.g = g;
	}
	public G(F f) {
		this.f = f;
	}
	public G(int g, F f) {
		this.g = g;
		this.f = f;
	}
	public void setG(int g) {
		this.g = g;
	}
	public void setF(F f) {
		this.f = f;
	}
	public int getG() {
		return this.g;
	}
	public F getF() {
		return this.f;
	}
}
