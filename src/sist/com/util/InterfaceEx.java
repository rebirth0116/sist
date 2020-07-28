package sist.com.util;

public interface InterfaceEx {
	public void show();
	public default void message() {
		//8.0 이상부터 새로나온 문법 ("default")
		System.out.println("message");
	}
}
