package sist.com.obj.basic;
// *.java --> *.class [bytecode] java[실행] 로딩
public class ObjectEx1 { //ObjectEx1 [설계도, 사용자정의자료형]
	//속성  + 기능
	int instance; //멤버 변수, field, attribute, 속성, 상태, data
	static int staticVal;
	int data;
	public static void method(/*int x*/) { //x = paramether, 매개변수. 매개변수도 지역변수이다.
		int local; //지역변수 [stack]
//		System.out.println(local);  지역변수는 메소드가 불려질 때 생성되기 때문에 메모리가 할당되어있지않아 쓰레기값이 나옴
	}
	
	public void getData (int data) {
		int staticVal;
		staticVal = 20;
		System.out.println("this:"+this);
		data = 10; //data 앞에 this. 이 숨겨져있다.
		this.data = data; //인스턴스변수 = 지역변수
		// this. 사용 이유 - 다양한 경우가 있다 ex) 매개변수와 인스턴스변수의 이름이 같을 때
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) {
		ObjectEx1 o1 = new ObjectEx1(); //[instance] [heap]
		ObjectEx1 o2 = new ObjectEx1();
//		o.method();
		o1.instance = 30;
		staticVal = 40;
		System.out.println("o1: " +o1);
		System.out.println("o2: " +o2);
		o1.getData(30); //method 내의 o1.this 값이 o1의 주소값과 같음을 알 수 있다.
		System.out.println(staticVal);
	}
	
}
