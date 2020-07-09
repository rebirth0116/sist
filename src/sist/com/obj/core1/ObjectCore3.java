package sist.com.obj.core1;

public class ObjectCore3 {
	String str;
	Double d;
	Object obj;
	int i;//값만
	Integer i2;//객체 래퍼클래스 오토박싱
	
	public ObjectCore3(Object obj) {
		this.obj = obj;
	}

	
	public void getData() {
		if(this.obj instanceof Double) {
			this.d = (Double)this.obj;
		}
		if(this.obj instanceof String) {
			this.str = (String)this.obj;
		}
		if(this.obj instanceof Integer) {
			this.i = (int)this.obj;
		}
		
		
	}
	
	
	public void disp() {
		System.out.println(obj);
	}
	
	
	
	public static void main(String[] args) {
		ObjectCore3 o = new ObjectCore3(10);
		o.getData();
		System.out.println(o.str);
		System.out.println(o.d);
		System.out.println(o.i);
	}
}
