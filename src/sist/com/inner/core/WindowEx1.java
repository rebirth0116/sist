package sist.com.inner.core;

import java.util.ArrayList;

public class WindowEx1 extends ArrayList{
	private int x;
	
	
	public WindowEx1() {
		new AbstractMouseAdapter() {
			
			@Override
			public void mousePress() {
				x = 100;
//				this.x = 100; //오류
				WindowEx1.this.x = 200;
				// TODO Auto-generated method stub
				System.out.println("mousePress");
			}
		}.mousePress();;
	}
	

	
	

}
