package sist.com.obj.core5;

public class ObjectInterMain {
	Runnable r;
	
	public ObjectInterMain(Runnable r) {
		this.r = r;
	}
	
	public void play() {
		r.run();
	}
	
	public static void main(String[] args) {
		ObjectInterMain om = new ObjectInterMain(new ObjectAction1());
		om.play();
	}
	
	
}
