package sist.com.obj.core6;

import java.util.Scanner;

public class MessageMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MessageAction m = new MessageClass1();
		m.message();
		MessageAction m2 = new MessageClass2();
		m2.message();
		MessageAction m3 = null;
		switch(sc.nextInt()) {
		case 1:
			m3 = new MessageClass1();
			break;
		case 2:
			m3 = new MessageClass2();
			break;
			default: break;
			
		}
		m3.message();
	}
}
