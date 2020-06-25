package sist.com.operator;

//연산자 --> 계산을 목적으로 사용되는 기호
//최우선         []배열기호, ()우선순위변경, .data연결
//단항연산자   +, -, ++, --, ~, !
//산술연산자   +, -, *, /, %
//shift   <<, >>, >>>(양수화)
//관계(비교) (<, >, <=, >=), ==, !=
//논리연산자   &, ^, |
//      &&, ||
//삼항연산자   조건?true:false
//대입연산자   =, +=, -=, +=, /=
//,(순서)
class OperatorEx3 {
	// AND | OR | NOT
	
	
	public void operatorEx1(int x, int y, int z, int k) {
//		boolean state = ++x == 1 || y++ == 2; // x=2, y=3
//		boolean state = ++x == 2 || y++ == 2; // x=2, y=2
//		boolean state = ++x == 2 | y++ == 2; // x=2, y=3
//		boolean state = ++x == 2 && y++ == 2; // x=2, y=3
//		boolean state = x++ == 2 && y++ == 2; // x=2, y=2
		boolean state = x++ == 2 & y++ == 2; // x=2, y=3
		
		System.out.printf("State : %b, x = %d, y = %d", state, x, y);
	}
	
	public void operatorEx2(int x, int y, int z, int k) {
//		boolean state = x++ == 2 && y++ == 2 || --z ==2 && k++ == 4; // x=2, y=2, z=2, k=5
		// (x++ == 2 && y++ == 2) || (--z ==2 && k++ == 4)�� ����. (||���� &&�� ����)
		
//		boolean state = ++x == 2 || (y++ == 2 || (--z ==2 && k++ == 4)); //x=2 y=2 z=3 k=4
//		boolean state = ++x == 2 && (y++ == 2 || (--z ==2 && k++ == 4)); //x=2 y=3 z=3 k=4
		//boolean state = ++x == 2 && (y++ == 2 && (--z ==2 && k++ == 4)); //x=2 y=3 z=2 k=5
//		boolean state = ++x == 1 && y++ == 2 || --z == 2 && k++ == 4 ; // x=2, y=2, z=2, k=5
		boolean state = ++x == 1 && (y++ == 2 || --z == 2) && k++ == 4 ; // x=2, y=2, z=3, k=4
		
		
		System.out.printf("State : %b, x = %d, y = %d, z = %d, k = %d", state, x, y, z, k);
	}
	public void operatorEx3(int x, int y, int z, int k) {
		
		boolean state = ++x ==2 || (y++ ==2 || z++ ==3);
		
		
		System.out.printf("State : %b, x = %d, y = %d, z = %d, k = %d", state, x, y, z, k);
	}
	
	public void operatorEx4() {
		int i = 1;
		i+=1; //i = i +1;
		System.out.println(i);
		i*=2;
		System.out.println(i);
		i<<=1;
		System.out.println(i);
		i/=2;
		System.out.println(i);
	}
	public static void main(String[] args) {
		OperatorEx3 o = new OperatorEx3();
//		o.operatorEx1(1, 2, 3, 4);
//		o.operatorEx3(1, 2, 3, 4);
		o.operatorEx4();
	}
}
