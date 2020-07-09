package sist.com.obj.core1;

public class SubChildAction extends SubAction {

	private int subChildActionData;
	
	public void subChildActionProcess() {
		System.out.println("subChildActionProcess");
	}
	
	public SubChildAction(int i) {
		super(++i);
		subChildActionData =i;
		System.out.println("SubChildAction 생성");
	}

	public int getSubChildActionData() {
		return subChildActionData;
	}

	public void setSubChildActionData(int subChildActionData) {
		this.subChildActionData = subChildActionData;
	}
	
	
}
