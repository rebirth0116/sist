package sist.com.inner;

public class AnonymousEx1 {
	
	WindowInterEx a = new WindowInterEx() {
		int x = 300;
//		x = 500; //anonymous class이다. 즉, 클래스내에서처럼 선언만 가능하다.
		@Override
		public void windowOpen() {
			AnonymousEx1.this.y = 30; //this.y = 30; 불가능
			System.out.println(y);
			System.out.println("windowOpen");
		}

		@Override
		public void windowClose() {
			System.out.println("windowClose");
		}
		
	}; //anonymous member class로 만듬 -> 클래스 내의 windowOpen과 windowClose를 여러번 사용 가능
	
	int y;
	public void process() {
		
	}
	public static void main(String[] args) {
		AnonymousEx1 a = new AnonymousEx1();
		a.process();
	}
}
