package sist.com.inner.core2;

public class FrameMain {
	WindowListenerEx w;
	
	public FrameMain(WindowListenerEx w) {
		this.w = w;
	}
	public void close() {
		w.windowClose();
	}

	public static void main(String[] args) {
		FrameMain f = new FrameMain(new FrameDemo());
		FrameMain f2 = new FrameMain(new FrameTest());
		f.close();
		f2.close();
	}
}
