package sist.com.variable;

public class ActionVariableEx7 {

	public static void method() {
		System.out.println("aa");
	}

	public void methodSec() {
		System.out.println("bb");
	}

	public static String checkMethod() {
		ActionVariableEx7 a = new ActionVariableEx7();
		System.out.println("d");
		a.checkMethod3();
		return "a";
	}

	public static String checkMethod2(int a) {
		if (a < 30) {
			System.out.println("1");
			return "리턴";
		}

		return "B";
	}

	public void checkMethod3() {
		System.out.println("C");
	}

	public static void main(String[] args) {

		System.out.println(ActionVariableEx6.checkMethod((byte) 65));
		method();
		ActionVariableEx7 a = new ActionVariableEx7();
		a.methodSec();
		System.out.println(checkMethod());
		System.out.println(checkMethod2((int) 'A' - 40));
		

	}
}
