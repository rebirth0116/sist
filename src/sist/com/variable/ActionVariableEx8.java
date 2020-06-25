package sist.com.variable;


public class ActionVariableEx8 {

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

	public void charMethod(int data) {
		// System.out.printf("char = %c, int = %d\n",data,data);

		System.out.printf("%d %o %x %b %s %s %f\n", data, data, data, 5 > 3, "Aaa", Integer.toBinaryString(data),
				10.1512);
	}

	public void charMethod(char data) {
		System.out.printf("char = %c, int = %d\n", data, (int) data);
	}

	public static void main(String[] args) {
		ActionVariableEx8 a = new ActionVariableEx8();
		a.dataValueCheck(8, 9);
		a.charMethod(10);
		// a.charMethod('A');
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
