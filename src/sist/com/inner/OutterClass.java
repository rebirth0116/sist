package sist.com.inner;
//inner --> 접근제한자와 무관하게 접근하는 클래스
//java[단일상속] MEMBER,STATIC,LOCAL,ANONYMOUS
public class OutterClass extends SuperOutter{
	private int outValue = 200; //멤버변수
	public OutterClass() {
		this.superProtected = 300;
//		this.superOutter = 300; 불가능
		//생성자
		System.out.println("OutterClass");
	}
	
	public void outtermethod() {
		System.out.println("outterMethod");
		superPublicMethod();
		}
	public class Inner{
		private int outValue = 100;
		//멤버 이너 클래스
		public Inner() {
			System.out.println("Inner");
		}
		public void innerMethod() {
			superPublicMethod();
			superProtected = 400;
			
			System.out.println("innerMethod");
//			this.outValue = 100; 불가능
			System.out.println(this.outValue); //내부 클래스의 outValue
			System.out.println(OutterClass.this.outValue);  //외부 클래스의 outValue
		}
	}
	
	public static void main(String[] args) {
		OutterClass outter = new OutterClass(); //외부만 생성
		OutterClass.Inner inner = new OutterClass().new Inner(); //외부를 만들고, 그 안에 내부를 만든다
		inner.innerMethod();
//		inner.outterMethod();  불가능	
	}
}
