package sist.com.obj.core8;

public class ObjectEx2 implements Cloneable {
	int data;
	
	public ObjectEx2() {
		
	}
	public ObjectEx2(int data) {
		this.data = data;
	}
	public void process() {
		System.out.println(this==this);
		System.out.println(this==new ObjectEx2());
		
		try {
			ObjectEx2 oe = (ObjectEx2) this.clone();
			System.out.println(oe);
			System.out.println(new ObjectEx2());
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		ObjectEx2 o = new ObjectEx2();
		o.process();
	}
}
