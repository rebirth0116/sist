package sist.com.obj.core8;


public class ObjectEx {
	
	public void numberEx() {
		Integer i = new Integer(10); //value
		int temp = 9;
		System.out.println(i.compareTo(temp)<0?"value가 parameter보다 작다.":i.compareTo(temp)==0?"같다":"크다");
		Double d = new Double(10.5);
		Float f = new Float(3.2);
	}

	public void numberEx2(Number number) {
		System.out.println(number.intValue());
	}
	public static void main(String[] args) {
		ObjectEx o = new ObjectEx();
		o.numberEx2(new Float(10));
		
		
	}
}
