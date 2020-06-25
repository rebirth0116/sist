package sist.com.variable;
//변수 [메모리]

//자료형[메모리성질, 크기]
//자료형 변수명;
//형변환[강제형, 자동형]

public class ActionVariableEx6 { // 클래스
	static int rs;
	static int sum;

	public void byteTypeMethod(byte x, short y, int z) { // 메소드(기능)->변수, 연산자, 제어문, 배열

		if (y > Byte.MIN_VALUE && y < Byte.MAX_VALUE) {
			if (z > Byte.MIN_VALUE && z < Byte.MAX_VALUE) {
				rs += z;
			} else {
				System.out.println("z Byte 범위 초과");
				rs += x + y;
				System.out.println(rs);
				return;
			}
			rs += y;
		} else {
			System.out.println("y Byte 범위 초과");
			rs += x;
			System.out.println(rs);

			return;
		}
		rs += x;
		System.out.println(rs);
	}

	public void shortTypeMethod(short x) {
		System.out.println("short");
		short rs = 0;
		rs = (short) (rs + x);
	}

	public void shortTypeMethod(int x) {
		System.out.println("int");
	}

	public void test(boolean x) {
		System.out.println("boolean");
	}

	public void test(int x) {
		System.out.println("int");
	}

	public void test(String x) {
		System.out.println("String");
	}

	public void test(char x) {
		System.out.println("char");
	}

	public void test() {
		System.out.println("void");
	}

	public static char checkMethod(byte a) {
		char res = 0;
		
		res  = (char)a;
		return res;
	}
	public static void main(String[] args) {
		ActionVariableEx6 a = new ActionVariableEx6();
		byte q = 110;
		short w = 250;
		int e = 150;

		a.byteTypeMethod(q, w, e);

		a.test(true);
		a.test(1);
		a.test('a');
		a.test("a");
		a.test();
		short d = 0;
		short u = 3;
		short o = 4;
//		d = u + o;
		d = (short) (u + o);
		System.out.println(d);

		System.out.println(checkMethod((byte)65));
	}

}
