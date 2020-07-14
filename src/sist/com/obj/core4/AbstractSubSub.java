package sist.com.obj.core4;

public  class AbstractSubSub extends AbstractSub{
	
	
	public AbstractSubSub() {
		super();
		System.out.println("AbstractSubSub");
	}
	
	public void subAction() {
		System.out.println("subAction");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
	}
	
}
