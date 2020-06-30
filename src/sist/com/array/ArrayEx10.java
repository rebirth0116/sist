package sist.com.array;

import java.util.Scanner;

public class ArrayEx10 {
	Scanner sc = new Scanner(System.in);
	int[] m = { 95, 100, 27, 45, 99 };

	public void print() {
		while (true) {
			System.out.println("1.Sort 2.Insert 3.Delete");
			switch (sc.nextInt()) {
			case 1:
				sortArray();
				disp();
				break;
			case 2:
				// insert();
				break;
			case 3:
//				delete();
				break;
			default:
				return;
			}
		}
	}

	public void sortArray() {
		while (true) {
			System.out.println("1.Selection 2.Bubble 3.Disp");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("1.Asc 2.Desc");
				selectionSort(sc.nextInt() == 1 ? 1 : 2);
				break;
			case 2:
				System.out.println("1.Asc 2.Desc");
				bubbleSort(sc.nextInt() == 1 ? 1 : 2);
				break;
			case 3:
				disp();
				break;
			default:
				return;
			}
		}
	}

	public void selectionSort(int order) {
		int temp = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				if (order == 1) {
					if (m[i] < m[j]) {
						swap(i,j);
					}
				} else {
					if (m[i] > m[j]) {
						swap(i,j);
					}
				}
			}
		}

	}

	public void bubbleSort(int order) {
		int temp = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length - i - 1; j++) {
				if (order == 1) {
					if (m[j] < m[j + 1]) {
						swap(j, j+1);
					}
				} else {
					if (m[j] > m[j + 1]) {
						swap(j, j+1);
					}
				}
			}
		}

	}

	public void disp() {
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
	}
	public void swap(int i, int j) {
		int temp;
		temp = m[i];
		m[i] = m[j];
		m[j] = temp;
	}

	public static void main(String[] args) {
		ArrayEx10 a = new ArrayEx10();
		a.print();
	}
}
