package sist.com.exception;

public abstract class Test {
  public abstract void read();
  
  public void read(int a) {
	  read();
	  System.out.println(a);
  }
}
