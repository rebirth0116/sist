package sist.com.obj.core1;

public class SuperAction extends Object{

	private int superActionData;
	
	public void superActionProcess() {
		System.out.println("superActionProcess");
	}
	
	public SuperAction(int i){
		this.superActionData = ++i;
		System.out.println("superaction 생성");
	}
	public SuperAction() {
		this.superActionData = 99;
		System.out.println("superaction 생성");

	}

	public int getSuperActionData() {
		return superActionData;
	}

	public void setSuperActionData(int superActionData) {
		this.superActionData = superActionData;
	}
	
}
