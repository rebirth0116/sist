package sist.com.inner;

public class FrameEx extends WindowEx{
	private int fx;
	CanvasEx c = new CanvasEx();
	public void frameShow() {
		System.out.println("frameShow");
		fx = 100;
	}
	
	
	public class CanvasEx extends SuperCanvasEx{
		private int cx;
		public void frameShow() {
			System.out.println("frameShow2");
		}
		public void canvasShow() {
			System.out.println("canvasShow");
			this.cx = 500; //this. 생략가능
			this.scy = 5000; //this. 생략가능
			fx = 300;
			frameShow(); //내부 (내부에서 frameShow()를 작성하지않으면 외부)
			this.frameShow(); //내부
			FrameEx.this.frameShow(); //외부
		}
	}
	
	public static void main(String[] args) {
		CanvasEx c = new FrameEx().new CanvasEx();
		c.canvasShow();
		System.out.println(c.cx);
	}
}
