package sist.com.obj.basic;

public class ObjectEx5 {
	//클래스 (설계도) 내부엔  속성이 들어올 수 있다.
	//속성 - static, final, instance
	public ObjectEx5() {
		a = 4;
	}

	
	static int value = 5; //로딩시점 [static영역 = class영역 = method 영역]
	int a ;
	
	
		static {
		value = 90;
	}
	
	
	public  void methodEx1(int value) {
		this.a = 300;
		System.out.println(value);
	}
	
	
	public static void main(String[] args) {
		ObjectEx5 o = new ObjectEx5();
		System.out.println(value);  //실행 순서 == 선언부 = static block -> constructor (선언부와 static block은 위아래에 따라 순서가 바뀜)
		System.out.println(o.a);
		o.methodEx1(1);
		System.out.println(o.a);
		System.out.println(value);
	}
}
