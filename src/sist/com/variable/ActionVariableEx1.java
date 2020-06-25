package sist.com.variable;
//Ctrl +Shift +F (����)
public class ActionVariableEx1 {
	public static void main(String[] args) {
		/*System.out.print("Data:");
		System.out.print("Data:");*/
		
		/*변수 연산자 제어문 배열
		 *변수 --> DATA를 담는공간
		 *DATA[논리, 정수, 실수, 문자] 
		 * 
		 * */
		//BYTE(1) SHORT(2) INT(4) LONG(8)
		//CHAR(2)
		//BOOLEAN(1)
		//FLOAT(4),DOUBLE(8)
		
		//자료형 변수명;
		
		/*byte byteValue=127;//1byte -128~+127
		System.out.println("byteValue="+byteValue);
		short shortValue=32767;//2byte -32768~+32767
		System.out.println("shortValue="+shortValue);		
		int intValue=2147483647;
		System.out.println("intValue="+intValue);*/
		
		System.out.println("Byte"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("Short"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("Integer"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		
		
		
		boolean boolState=7>5;
		System.out.println("boolState="+boolState);
		
	}
}






