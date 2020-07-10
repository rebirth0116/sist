package sist.com.obj.core3;

public class ObjectEx3 {
	
	
	public void show() {
		System.out.println("show!");
	}
	public static void main(String[] args) {
		Object o = new ObjectEx3(); //업캐스트
		ObjectEx3 o2 = (ObjectEx3) o; //다운캐스트
//		ObjectEx3 o3 = (ObjectEx3)new Object(); //캐스트 오류
		o2.show();
	}
}
