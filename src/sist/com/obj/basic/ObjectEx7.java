package sist.com.obj.basic;


//속성[정적, 동적]
public class ObjectEx7 {
	private int iValue;//0
	private double dValue;//0.0
	
//	iValue = 100; 			 --> class영역 = 설계하는 영역
//	System.out.println("Hi");
	
	public void setIValue(ObjectEx7 this, int iValue) {  //ObjectEx7 this 는 생략되어있음
		this.iValue = iValue;
	}
	public int getIValue() {
		return this.iValue;
	}
	
	public void setDValue(int dValue) {
		this.dValue = dValue;
	}
	public double getDValue() {
		return this.dValue;
	}
	
	public ObjectEx7 getInstance() {
//		return new ObjectEx7();
		return this;
	}
	// -> o1.getInstance(); 는 o1의 주소를 this로 받아 return this 를 한다.
	
	
	
	public static void main(String[] args) {
		ObjectEx7 o1 = new ObjectEx7(); //heap에 iValue와 dValue가 만들어짐
		ObjectEx7 o2 = new ObjectEx7();
		o1.getInstance().setIValue(500);
		System.out.println(o1.getInstance().getIValue());
		
	}
	
	
}
