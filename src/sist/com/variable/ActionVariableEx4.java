package sist.com.variable;

public class ActionVariableEx4 {

	public void byteMethodEx1() {

		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		byteMethodEx2();
		byteMethodEx3();
		System.out.println("Method1 End");
	}

	public void byteMethodEx2() {
		char i = 'a';
		System.out.println((int) i);
		byteMethodEx3();

		System.out.println("Method2 End");

	}

	public void byteMethodEx3() {
		int i = 65;
		System.out.println((char) i);
		System.out.println("Method3 End");

	}

	public void byteMethod4(byte x) {
		System.out.println("바이트");
	}

	public void byteMethod4(double x) {
		System.out.println("더블");
	}

	public void byteMethod4(int x) {
		System.out.println("인트");
	}

	public void byteMethod4(String x) {
		System.out.println("스트링");
	}

	public void byteMethod4(boolean x) {
		System.out.println("boolean");
	}

	public static void main(String args[]) {
		int i = 4;
		ActionVariableEx4 a = new ActionVariableEx4();
		a.byteMethodEx1();
		System.out.println((double) i);
		ActionVariableEx3 b = new ActionVariableEx3();
		System.out.println();
		b.method1();
		a.byteMethod4((byte) 3);
		a.byteMethod4((double) 3);
		a.byteMethod4(3);
		char c = 'e';
		a.byteMethod4(c);
		a.byteMethod4((double) c);
		a.byteMethod4((boolean)true);
		a.byteMethod4("asd");
		int q = 20;
		char w = 65;
		q = w;
		System.out.println(w);
		System.out.println(q);

	}
}
