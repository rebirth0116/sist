package sist.com.window;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginEx extends JFrame implements ActionListener{

	JTextField[] jt = new JTextField[2];
	JButton[] jb = new JButton[2];
	JLabel[] jl = new JLabel[2];
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String temp = e.getActionCommand();
		System.out.println(temp);
		if(temp.equals("로그인")) {
			showNew();
		}
		if(temp.equals("종료")) {
			System.exit(0);
		}
	}
	
	public void showNew() {
		JFrame jf = new JFrame();
		jf.setBounds(100,100,500,500);
		jf.setVisible(true);
	}
	
	public void initFrame() {
		jb[0] = new JButton("로그인");
		jb[1] = new JButton("종료");
		jl[0] = new JLabel("ID");
		jl[1] = new JLabel("PW");
		for(int i = 0; i < jt.length; i++) {
			jt[i] = new JTextField(20);
		}
		
		JPanel jp = new JPanel();
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JPanel jp3 = new JPanel();
		jp.setLayout(new GridLayout(3,1));
		jp1.add(jl[0]);
		jp1.add(jt[0]);
		jp2.add(jl[1]);
		jp2.add(jt[1]);
		jp3.add(jb[0]);
		jp3.add(jb[1]);
		jb[0].addActionListener(this);
		jb[1].addActionListener(this);
		
		jp.add(jp1);
		jp.add(jp2);
		jp.add(jp3);
		
		this.add(jp);
	}
	
	public LoginEx() {
		initFrame();
		this.setTitle("로그인");
		this.pack();
		this.setResizable(false);
		this.setLocation(800, 300);
//		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new LoginEx();
	}

}
