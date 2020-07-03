package sist.com.obj.basic;

public class ObjectEx3 {
	int cnt; //instance 변수 new할때 생성
	static int st; //로딩 시점
	
	public void method() {
		int num=0; //지역변수 메소드 호출시점
		System.out.println("cnt = "+ ++cnt);
		System.out.println("num = "+ ++num);
		System.out.println("st = "+ ++st);
		System.out.println("=================");
		
	}
	
	
	public static void main(String[] args) {
		ObjectEx3 o1 = new ObjectEx3(); //cnt heap에 생성
		ObjectEx3 o2 = new ObjectEx3(); //cnt heap에 생성
		o1.method(); //111
		o1.method(); //212
		o1.method(); //313
		o1.method(); //414
		o1.method(); //515
		System.out.println("o2");
		o2.method();//116
		o2.method();//217
		o2.method();//318
		o2.method();//419
		
	}
}
