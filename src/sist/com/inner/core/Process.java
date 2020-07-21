package sist.com.inner.core;

public class Process {
	private int x; //인스턴스 변수
	public void method() {
		int local; //지역변수
		final int DATA = 100;
		class LocalInner{
			
			private int localInst; //innerInstance
			public void showInner() {
				int innerLocal; // innerClassMethod Local
				innerLocal = 100;
				this.localInst = 100;
				x = 100;
				System.out.println(DATA);
			}//showInner
			
			public void innerAction() {
				x = 99;
				System.out.println(x);
			}
			
		}//Inner
		
		LocalInner i = new LocalInner();
		i.showInner();
		i.innerAction();
		
	}
	
	public static void main(String[] args) {
		Process p  = new Process();
		p.method();
		new Process();
	}

}
