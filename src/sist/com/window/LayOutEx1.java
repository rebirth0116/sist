package sist.com.window;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayOutEx1 extends JFrame{
	
	private JButton[] jbtn1 = new JButton[100];
	//버튼을 받을 수 있는 크기 5짜리 배열
	
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
		}
	}
	public LayOutEx1() {
		initButton();
		borderLayoutEx();
//		flowLayoutEx();
//		gridLayoutEx();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new LayOutEx1();
	}
	
}
