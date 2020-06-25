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
public class OperatorEx2 {
	public void unaryEx1() {
//		int data = 1;
//		System.out.println(data);
		
		int a = 1;
		int b = 5;
		int c = ++a - b++; //-3, a=2, b=6
		int d = ++c +  ++b; //-2 + 7 = 5
		System.out.println(d++);//5, d=6
		System.out.println(++d);//++6 = 7
	}
	
	public void unaryEx1(int x, int y, int z, int k) {
		int r = ++x + y++; //2+2 = 4 (x=2, y=3)
		r+= x++ + ++y - --z + k++; // 4 + 2 + 4 - 2 + 4 = 12 (3,4,2,5)
		r+= --y + x++ - --k; //12 + 3 + 3 - 4 = 14
		System.out.println(r);
	}
	
	public int unaryEx2(int x, int y, int z, int k) {
		return (++x + --y + z++ - k++);
	}
	public int unaryEx3(int x, int y, int z, int k) {
		return x>y ? (++x + --y + z++ - k++):(x++ - --y + --z - k++);
	}
	
	public void unaryEx4(int x, int y, int z, int k) {
//		boolean state = ++x > 1 & ++y ==  2 & z== 3 & k-- == 4;
//		boolean state = ++x > 1 && ++y ==  2 && z== 3 && k-- == 4;
//		boolean state = ++x > 1 | ++y ==  2 | z== 3 | k-- == 4;
		boolean state = ++x > 1 || ++y ==  2 || z== 3 || k-- == 4;
		System.out.printf("state = %b, x=%d, y=%d, z=%d, k=%d\n",state,x,y,z,k);
	}
	
	public void unaryEx5 (int x, int y, int z, int k) {
		System.out.println(z++ + y-- + x++ + --x - --k);
		System.out.println(!!!!!!!!(++x!=3));
		System.out.println(!!!!!!!!(++x!=3));
		System.out.println(!!!!!!!!(++x!=3));
	}
	
	public static void main(String[] args) {
		OperatorEx2 o = new OperatorEx2();
		o.unaryEx1();
		o.unaryEx1(1,2,3,4);
		int rs = o.unaryEx2(1, 2, 3, 4)+o.unaryEx2(5, 6, 7, 8);
		int rs2 = o.unaryEx3(1, 2, 3, 4)+o.unaryEx3(5, 6, 7, 8);
		System.out.println(rs);
		System.out.println(rs2);
		o.unaryEx4(1, 2, 3, 4);
		o.unaryEx5(1, 2, 3, 4);
		
		
	}

}
