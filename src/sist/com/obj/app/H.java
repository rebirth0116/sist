package sist.com.obj.app;

public class H {
	private int h;
	private G g;
	public H() {
	}
	public H(int h) {
		this.h = h;
	}
	public H(G g) {
		this.g = g;
	}
	public H(int h, G g) {
		this.h = h;
		this.g = g;
	}
	public void setH(int h) {
		this.h = h;
	}
	public void setG(G g) {
		this.g = g;
	}
	public int getH() {
		return this.h;
	}
	public G getG() {
		return this.g;
	}
	
	public static void main(String[] args) {
//		H h = new H(new G(new F(30)));
//		System.out.println(h.getG().getF().getF());
		H h = new H(new G(new F(40, new E(20, new D()))));
		System.out.println(h.getG().getF().getE().getE()); 
		//h에서 G클래스의 F클래스의 E클래스의 int형 e반환
		h.getG().getF().setF(1);
		//h에서 G클래스의 F클래스의 int형 f 설정
		System.out.println(h.getG().getF().getF());
		//h에서 G클래스의 F클래스의 int형 f 반환
		
		h.getG().getF().getE().getD().setD(20);
		System.out.println(h.getG().getF().getE().getD().getD());
		
	}
}
