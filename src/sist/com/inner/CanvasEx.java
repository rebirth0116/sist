package sist.com.inner;

public class CanvasEx extends SuperCanvasEx{
	private int cx;
	public void canvasShow() {
		System.out.println("canvasShow");
		this.cx = 500;
		this.scy = 5000; // this.를 뺀 scy도 되는데?
	}
}
