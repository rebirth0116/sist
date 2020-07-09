package sist.com.obj.core2;

public class ChildClass extends ParentClass{
	String childMessage;
	
	public ChildClass() {
		this.childMessage = "AA";
		this.parentMessage = "BB";
	}
	
	public void childAction() {
		System.out.println("parentAciont");
	}
}
