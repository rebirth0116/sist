package sist.com.obj.core1;

public class SubAction extends SuperAction{

	private int subActionData;
	
	public void subActionProcess() {
		System.out.println("subActionProcess");
	}
	
	public SubAction(int i) {
		super(++i);
		subActionData=i;
		System.out.println("SubAction생성");
	}

	public int getSubActionData() {
		return subActionData;
	}

	public void setSubActionData(int subActionData) {
		this.subActionData = subActionData;
	}
	
}
