package sist.com.inner;

public class AnonymousEx2 extends OutterClass{
	public void action() {
		this.superPublicMethod();
		new ArrayShowList() {
			public void add() {
				System.out.println("overadd");
			}
		}.add();
	}
	public static void main(String[] args) {
	AnonymousEx2 a = new AnonymousEx2();
	a.action();
	}
}
