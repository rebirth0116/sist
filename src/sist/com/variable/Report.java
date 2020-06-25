package sist.com.variable;

public class Report {
	static int rs;
	static int sum;

	public void byteTypeMethod(byte x, short y, int z) {

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

		res = (char) a;
		return res;
	}

	public void charMethod(int data) {
		System.out.printf("char = %c, int = %d\n", data, data);

		System.out.printf("%d %o %x %b %s %s %f\n", data, data, data, 5 > 3, "Aaa", Integer.toBinaryString(data),
				10.1512);
	}

	public void charMethod(char data) {
		System.out.printf("char = %c, int = %d\n", data, (int) data);
	}

	public void dataValueCheck(int state, int data) {
		if (state == 10) {
			System.out.println(state + "진수 = " + data);
		} else if (state == 8) {
			System.out.println(state + "진수 = " + Integer.toOctalString(data));
		} else if (state == 2) {
			System.out.println(state + "진수 = " + Integer.toBinaryString(data));
		} else if (state == 16) {
			System.out.println(state + "진수 = " + Integer.toHexString(data));
		}

	}

	public void checkScore(int score) {
		
		if (score > 100 || score < 0)
			System.out.println("다시 입력하시오");
		else {
			score /= 10;
			switch (score) {
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("B");
				break;
			case 8:
				System.out.println("C");
				break;
			case 7:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Report a = new Report();
		byte q = 110;
		short w = 250;
		int e = 150;
		int z = 5;
		z = z++ - ++z; // z = 5 - 7
		System.out.println(z);
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
		System.out.println(checkMethod((byte) 65));
		a.charMethod(65);
		a.charMethod('A');
		a.dataValueCheck(8, 9);
		a.checkScore(50);
		a.checkScore(100);
		a.checkScore(-3);
		a.checkScore(101);

	}

}
