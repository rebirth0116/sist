package sist.com.obj.basic;

public class ObjectEx4 {

	static 	int data;
	static final int num;
	int instance;
		
	public ObjectEx4() {
		data = 500;
		final int b;
		b = 300;
		instance = 1;
	}
	
	
	
	static {
		num = 300;
		data = 400;
	}
	


	public void setData(int data) {
		final int a;
		a = 100;
		//a = 5000;
		this.data = data;
	}
	
//	public void setNum(int num) {
//		this.num = num;
//	}
	
	public static void main(String[] args) {
		System.out.println(data);
		ObjectEx4 o = new ObjectEx4();
		System.out.println(data);
		System.out.println(num);
		System.out.println(o.instance);
	}
	
}
