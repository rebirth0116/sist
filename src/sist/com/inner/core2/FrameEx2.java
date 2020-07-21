package sist.com.inner.core2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameEx2 extends Frame{
	static String str;
	static int cnt;
	
	public FrameEx2() {
		
		
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyTyped(e);
//				System.out.print("타타탁");
				System.out.println((int)(Math.random()*10000));
				cnt++;
//				cnt();
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				System.out.println((int)(Math.random()*10000));
				cnt++;
//				System.out.print("타");
				cnt++;
//				cnt();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyReleased(e);
//				System.out.print("탁");
				cnt++;
//				cnt();
			}
			
		});
		
		
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("악");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("으");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("악");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("으으");
			}
			
			
		});
		
		
		Button b1 = new Button("asd");
		Button b2 = new Button("qwe");
		this.setLayout(null);
		b1.setBounds(new Rectangle(new Point(50, 50), new Dimension(150, 150)));
		b2.setBounds(new Rectangle(new Point(300, 300), new Dimension(150, 150)));
		//this.add(b1);
		//this.add(b2);
		this.addWindowListener(new WindowAdapter() {
			
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				b1.setFocusable(false);
				b2.setFocusable(false);
				FrameEx2.this.setFocusable(true);
				FrameEx2.this.setFocusableWindowState(true);
				
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		this.setBackground(Color.CYAN);
		this.setBounds(new Rectangle(10, 10, 500, 500));
		this.setVisible(true);
		
	}
	
	public static void cnt() {
		if(cnt>=20) {
			System.out.println();
			cnt=0;
		}
	}
	
	public static void main(String[] args) {
		FrameEx2 f = new FrameEx2();
	}
}
