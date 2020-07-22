package sist.com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx6 {
	Scanner sc = new Scanner(System.in);

	public void inputData() {
		System.out.println("Data 1~100");
		try {
			int value = sc.nextInt();
			if (!(value >= 1 && value <= 100)) {
				throw new UserException("1~100까지만 가능");
			}
			System.out.println("success value = "+value);
		} catch (UserException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("aa");
		}
	}
	//catch() 안에 여러가지 exception을 사용 가능하다.
	//-> catch(Array~~Exception | NumberFormat~~Exception ) 

	public static void main(String[] args) {
		ExceptionEx6 e = new ExceptionEx6();
		e.inputData();
	}
}
