package sist.com.window;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayOutEx2 extends JFrame{
	private JButton[] jButton = new JButton[20];
	private JPanel[] jPanels = new JPanel[4]; 
	
	
	public void initMenu() {
		for(int i = 0; i< jButton.length; i++) {
			jButton[i] = new JButton("Btn".concat((i+1)+""));
			if(i>3)continue;
//			jPanels[i] = new JPanel();
			//panel은 기본적으로 flow Layout이다.
			//이번엔 전부 borderLayout을 쓰기로 했으므로 변경
			jPanels[i] = new JPanel(new BorderLayout());
		}
		borderLayPro();
	}
	
	public void borderLayPro() {
		jPanels[0].add("North",jButton[0]);
		jPanels[0].add("West",jButton[1]);
		jPanels[0].add("Center",jButton[2]);
		jPanels[0].add("East",jButton[3]);
		jPanels[0].add("South",jButton[4]);
		
		jPanels[1].add("North",jButton[5]);
		jPanels[1].add("West",jButton[6]);
		jPanels[1].add("Center",jButton[7]);
		jPanels[1].add("East",jButton[8]);
		jPanels[1].add("South",jButton[9]);
		
		jPanels[2].add("North",jButton[10]);
		jPanels[2].add("West",jButton[11]);
		jPanels[2].add("Center",jButton[12]);
		jPanels[2].add("East",jButton[13]);
		jPanels[2].add("South",jButton[14]);
		
		jPanels[3].add("North",jButton[15]);
		jPanels[3].add("West",jButton[16]);
		jPanels[3].add("Center",jButton[17]);
		jPanels[3].add("East",jButton[18]);
		jPanels[3].add("South",jButton[19]);
		
//		this.setLayout(new FlowLayout());
		this.setLayout(new GridLayout(2,2));
		
		this.add(jPanels[0]);
		this.add(jPanels[1]);
		this.add(jPanels[2]);
		this.add(jPanels[3]);
	}
	
	public LayOutEx2() {
		initMenu();
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LayOutEx2();
	}
}
