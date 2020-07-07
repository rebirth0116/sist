package sist.com.obj.app;

public class ServiceSystem { //fileCheck | fileValidate
	
	private PrintStreamEx p ;
	static final PrintStreamEx out ;
	static {
		out = new PrintStreamEx();
	}
	
	public ServiceSystem(PrintStreamEx p) {
		this.p = p;
	}
	
	public PrintStreamEx getP() {
		return this.p;
	}
	
	public void fileCheck() {
		System.out.println("fileCheck");
		p.print('a');
	}
	public void fileValidate() {
		System.out.println("fileValidate");
	}
	
	
}
