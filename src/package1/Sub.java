package package1;

public class Sub extends Super{
	public Sub() {
		this.publicData = 100;
		this.protectedData = 100;
		this.defaultData = 100;
//		this.privateData = 100;
		new Sub().protectedData =400;
		
	}

}
