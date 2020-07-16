package sist.com.obj.core5;

public class InstanceClass implements InterfaceEx1, InterfaceEx2, InterfaceEx3{
	
	public InstanceClass() {
		
	}
	
	
	
	@Override
	public void interfaceMethod1() {
		// TODO Auto-generated method stub
		System.out.println("interfaceMethod1");
	}



	@Override
	public void interfaceMethod2() {
		// TODO Auto-generated method stub
		System.out.println("interfaceMethod2");
	}



	@Override
	public void interfaceMethod3() {
		// TODO Auto-generated method stub
		System.out.println("interfaceMethod3");
	}



	public static void main(String[] args) {
		InstanceClass i = new InstanceClass();
	}

}
