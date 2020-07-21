package sist.com.inner.core;

public class WindowEx3 {
	private int x;

	public WindowEx3() {
		int y = 0; // 로컬변수
		new AbstractMouseAdapter() { //생성자 내부에 익명클래스를 작성하여 오버라이딩
			public void mouseRelease() {
				// TODO Auto-generated method stub
				System.out.println("a");
				x = 3;
//				y = 5; // LocalInnerClass의 경우엔 바깥 class의 변수나 메소드에 접근할 수 없다. 
				System.out.println(x);
			}
			
		}.mouseRelease();
	} //constructor
	
	public void asd() { //생성자가 아닌 클래스 내부에 익명클래스를 작성하여 오버라이딩
			new AbstractMouseAdapter() {
				public void mouseRelease() {
					// TODO Auto-generated method stub
					System.out.println("c");
				}
				
			}.mouseRelease();
	} //asd
	
	
	public static void main(String[] args) {
		WindowEx3 w = new WindowEx3(); //a
		w.asd(); //c
		//오버라이딩 하지 않을 경우, 원래 클래스에서 정의한대로 b가 출력됨
		
	}
	
}
