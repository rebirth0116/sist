package sist.com.exception;

public class ExceptionEx7{
	public void ex1() throws InterruptedException{
//		System.in.read();
//		System.out.println(System.in);
//		Thread.sleep(1000);
	}
	public void ex2() {
//		try {
//			int[] m = new int[5];
//			m[5]=100; //m배열은 4까지만 있음
//			String str = "abc";
//			str.charAt(5); //str은 3글자
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException");
//		
//		}catch(StringIndexOutOfBoundsException e) {
//			System.out.println("StringIndexOutOfBoundsException");
//			
//		}catch(NumberFormatException e) {
//			System.out.println("NumberFormatException");
//			
//		}catch(Exception e) {
//			System.out.println("Exception");
//		}
		
		try {
			int a = Integer.parseInt("asd");
		}catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException | NumberFormatException e) 
		//exception이 들어갈 경우, 다른 exception들은 의미가 없으므로 에러발생
		{
			
//			if(e instanceof ArrayIndexOutOfBoundsException) {
//				System.out.println("ArrayIndexOutOfBoundsException");
//			}else if(e instanceof StringIndexOutOfBoundsException) {
//				System.out.println("StringIndexOutOfBoundsException");
//			}else if(e instanceof NumberFormatException) {
//				System.out.println("NumberFormatException");
//			}else {
//				System.out.println("Other Exception");
//			}
			
			errorMessage();
		}catch(Throwable e) {
			
		}
	}
	
	public void errorMessage() {
		System.out.println("errorMessage");
	}
	public static void main(String[] args) throws InterruptedException{
		ExceptionEx7 e = new ExceptionEx7();
		e.ex2();
	}
}
