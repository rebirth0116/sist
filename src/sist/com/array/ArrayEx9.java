package sist.com.array;

import java.util.Scanner;

//stack - 선입후출
//empty, isFull, push, pop, peek
public class ArrayEx9 {
	Scanner sc = new Scanner(System.in); // system.in = 콘솔에서부터 가져오는 것
	int[] m = new int[5];
	int top = -1; // 0이든 -1이든 상관없음. index를 선위증가(-1)인지 후위증가(0)인지.

	public void menu() {
		while (true) {
			System.out.println("1.Push 2.Pop 3.Peek 4.List 5.Exit");
			switch (sc.nextInt()) {
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				peek();
				break;
			case 4:
				list();
				break;
			case 5:
				return;
			default:
				break;
			}
		}
	}
	
	public boolean isEmpty() { //boolean의 경우 method명 시작을 is로 시작해야 한다.
		return top==-1;
	}
	public boolean isFull() {
		return top==m.length-1;
	}
	public void increment() {
		int[] temp = new int[m.length*2];
		System.arraycopy(m, 0, temp, 0, m.length);
		m = temp;
	}
	public void push() {
		System.out.println("Push: ");
		int data = sc.nextInt();
		if(isFull()) {
			increment();
		}
		m[++top] = data;  //top이 0인 경우 top++로
		disp();
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Empty");
			return;
		}
		else {
			System.out.printf("%d removed\n",m[top]);
			m[top--] = 0;
		}
		disp();
	}
	public void peek() {
//		if(isEmpty())return;
//		System.out.println(m[top]);
		System.out.println(isEmpty()?"Empty":m[top]);
	}
	public void list() {
		if(isEmpty()) {
			System.out.println("Empty");
		}else disp();
	}
	public void disp() {
		for(int i = top; i>=0; i--) {
			System.out.printf("%-5d",m[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayEx9 a = new ArrayEx9();
		a.menu();
	}
}
