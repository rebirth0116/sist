package sist.com.array;

import java.util.Arrays;
import java.util.Random;

//1차 | 다차 | 가변
public class ArrayEx7 {

	public void add(int[] data) {
		for (int i : data) {
			System.out.printf("%-5d", i);
		}
	}

	public int[] action(int... x) {
		return x;
	}

	public void checkData(int[] value) {
//		System.out.println((int) (Math.random() * 45) + 1);

//		for (int i = 0; i < value.length;) {
//			int temp = (int) (Math.random() * 45) + 1;
//			boolean state = false;
//			for (int j = 0; j < i; j++) {
//				if (value[j] == temp) {
//					state = true;
//					break;
//				}
//			}
//
//			if (!state) {
//				value[i] = temp;
//				i++;
//			}
//		}

		for (int i = 0; i < value.length; i++) {
			value[i] = (int) (Math.random() * 6) + 1;
			for (int j = 0; j < i; j++) {
				if (value[i] == value[j]) {
					i--;
				}
			}
		}

		print(value);
	}

	public void print(int[] data) {
		for (int i : data) {
			System.out.printf("%5d", i);
		}
		System.out.println();
	}

	
	public void randomProcess() {
		int[] i = new int[5];
		boolean[] b = new boolean[5];
		Random r = new Random();
		for(int j =0 ; j<b.length; j++) {
			i[j] = r.nextInt(10)+1;
			b[j] = r.nextBoolean();
		}
		System.out.println(Arrays.toString(i));
//		System.out.println(Arrays.toString(b));
	}
	
	public int[] getData() {
		
		
		return new int[] {10, 100};
	}
	
	public static void main(String[] args) {
		ArrayEx7 a = new ArrayEx7();
		int[] data = new int[6];
		int rs = a.getData()[0] + a.getData()[1];
		System.out.println(rs);
//		a.checkData(data);
//		a.randomProcess();

//		a.add(new int[] {10, 20, 30});
		/*
		 * int rs = a.action(10, 20, 30)[0] + a.action(10,20,30)[1];
		 * System.out.println(rs);
		 */
	}
}
