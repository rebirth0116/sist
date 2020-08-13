package sist.com.window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayOutEx1 extends JFrame implements ActionListener{
	
	private JButton[] jbtn1 = new JButton[100];
	//버튼을 받을 수 있는 크기 5짜리 배열
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		System.out.println(((JButton)obj).getActionCommand());
		//버튼 누르는 대로 그 숫자 출력
		((JButton)obj).setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
		//누를 때마다 0-256의 랜덤한 rgb값으로 버튼 색 변경
		
	}
	
	
	public void initButton() {
		for(int i = 0; i< jbtn1.length; i++) {
			jbtn1[i] = new JButton(String.valueOf(i+1));
			//버튼 이름 1,2,3,4,5
		}
	}
	

	public void borderLayoutEx() {
		this.add("North",jbtn1[0]);
		this.add("South",jbtn1[1]);
		this.add("East",jbtn1[2]);
		this.add("West",jbtn1[3]);
		this.add(jbtn1[4]);
		//아무것도 안쓰는 것 = Center
		
	}
	public void flowLayoutEx() {
		this.setLayout(new FlowLayout());
		this.add(jbtn1[0]);
		this.add(jbtn1[1]);
		this.add(jbtn1[2]);
		this.add(jbtn1[3]);
		this.add(jbtn1[4]);
	}
	public void gridLayoutEx() {
		this.setLayout(new GridLayout(10,10));
		//10x10 배열로 버튼 생성
		
		for(int i =0; i< jbtn1.length; i++) {
			this.add(jbtn1[i]);
			jbtn1[i].addActionListener(this);
		}
	}
	public LayOutEx1() {
		initButton();
//		borderLayoutEx();
//		flowLayoutEx();
		gridLayoutEx();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new LayOutEx1();
	}
	
}
