package sist.com.inner.core2;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//설계도(속성+기능) interface --> abstract class --> InstanceClass
public class FrameEx extends Frame{
	public FrameEx() {
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
//		this.setBounds(100, 100, 500, 500);
		this.setBounds(new Rectangle(new Point(100, 100), new Dimension(500, 500)));
		this.setVisible(true);
		
	}
	
	


	public static void main(String[] args) {
		FrameEx f = new FrameEx();
		
		
	}
}

//
//@Override
//public void windowOpened(WindowEvent e) {
//	// TODO Auto-generated method stub
//	System.out.println("windowOpened");
//}
//
//
//@Override
//public void windowClosing(WindowEvent e) {
//	// TODO Auto-generated method stub
////	System.out.println("asd");
//	System.exit(0);
//}
//
//
//@Override
//public void windowClosed(WindowEvent e) {
//	// TODO Auto-generated method stub
//	
//}
//
//
//@Override
//public void windowIconified(WindowEvent e) {
//	// TODO Auto-generated method stub
//	System.out.println("windowIconfied");
//}
//
//
//@Override
//public void windowDeiconified(WindowEvent e) {
//	// TODO Auto-generated method stub
//	System.out.println("windowDeiconfied");
//}
//
//
//@Override
//public void windowActivated(WindowEvent e) {
//	// TODO Auto-generated method stub
//	System.out.println("windowActivated");
//}
//
//
//@Override
//public void windowDeactivated(WindowEvent e) {
//	// TODO Auto-generated method stub
//	System.out.println("windowDeactivated");
//}
