package sist.com.inner;


public class Ex extends FrameEx{

	public void asd() {
		frameShow();
		c.frameShow();
	}
	
	public static void main(String[] args) {
		Ex e = new Ex();
		e.asd();
	}
}

//외부클래스를 생성 후 내부클래스를 생성해야 함 -> 내부클래스 상속불가?
//그렇다면 외부클래스를 상속받은 클래스에서 내부클래스의 메소드를 이용하는 방법은? -> 내부클래스의 객체를 만들어 접근하는 방법밖에없는지?