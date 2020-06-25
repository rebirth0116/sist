package sist.com.operator;

//연산자 --> 계산을 목적으로 사용되는 기호
//최우선         []배열기호, ()우선순위변경, .data연결
//단항연산자   +, -, ++, --, ~, !
//산술연산자   +, -, *, /, %
//shift   <<, >>, >>>(양수화)
//관계(비교) (<, >, <=, >=), ==, !=
//논리연산자   &, ^, |
//        &&, ||
//삼항연산자   조건?true:false
//대입연산자   =, +=, -=, +=, /=
//  ,(순서)
public class OperatorEx1 { // OperatorEx1 클래스 (속성 + 기능), 설계도 --> 추상화

	public int firstOper(int x, int y, int z) {
		return x>=5 && y>=2 || z==6 ? x+y*z : (x+y)*z;
	}

	public int secondOper(int x, int y, int z) {
		return x>3 ? y<=2 ? x+y+z : z>=2 ? x-y-z : x+y-z : z;
	}

	public int abs(int input) {
		return input > 0 ? input : -input;
	}

	public void unaryEx1() {
		int a = 10;
		int b = 0;
		b += a;
		int c = -b;
		System.out.println(c);
	}
	
	public void test(byte n1, byte n2) {
		System.out.println("n1&n2 = " + (n1&n2));
		System.out.println("n1|n2 = " + (n1|n2));
		System.out.println("n1^n2 = " + (n1^n2));
		System.out.println("~n1   = " + ~n1);
		System.out.println("n1<<1 = " + (n1<<1));
		System.out.println("n1<<2 = " + (n1<<2));
		System.out.println("n1>>1 = " + (n1>>1));
		System.out.println("n1>>2 = " + (n1>>2));
	}

	public static void main(String[] args) {
		OperatorEx1 o = new OperatorEx1();

		int rs = o.firstOper(5, 2, 7);
		System.out.println(rs);
		System.out.println(o.secondOper(4, 6, 9));
		System.out.println(o.abs(-30));
		System.out.println(o.abs(20));
		o.unaryEx1();
		o.test((byte)10, (byte)3);
		int x = 3;
		x = ++x - --x + x++ - x-- + ++x; // 4 - 3 + 3 - 4 + 4 = 4
		System.out.println(x);
	}

}