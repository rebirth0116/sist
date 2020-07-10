package sist.com.obj.core2;

public class SecondChild extends FirstSuper {

	public void firstSuperMethod() {
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		FirstSuper f = new FirstSuper();
		SecondChild s = new SecondChild();
		
		
		
	}
}
