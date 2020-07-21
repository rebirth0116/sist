package sist.com.inner.core2;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex extends Frame{
	
	public Ex() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("dd");
				System.exit(0);
			}
		});
//		this.setBounds(100, 100, 300, 300);
		this.setBounds(new Rectangle(new Point(1, 1), new Dimension(400, 300)));
		this.setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Ex e = new Ex();
	}

}
