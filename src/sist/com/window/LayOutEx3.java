package sist.com.window;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LayOutEx3 extends JFrame implements TextListener,ActionListener{
	TextField tf;
	JButton jbtn;
	JPanel jPanel;
	JTextArea jTextArea;
	
	
	public void initLayEx() {
		jPanel = new JPanel();
		jPanel.add(tf = new TextField(50));
		tf.addTextListener(this);
		tf.addActionListener(this);
		jPanel.add(jbtn = new JButton("Input"));
		jbtn.addActionListener(this);
		this.add(new JScrollPane(jTextArea = new JTextArea()));
		jTextArea.setEditable(false);
		jTextArea.setBackground(Color.CYAN);
		this.add("South",jPanel);
	}
	
	
	public LayOutEx3() {
		initLayEx();
		
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("window Opened");
				jbtn.setEnabled(false);
				tf.requestFocus();
				//tf에 강제적으로 포커스를 줌으로써 프로그램이 실행되자마자 텍스트필드에 커서가 나타나게 한다.
			}
		});
		
		
		
		
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}



	public static void main(String[] args) {
		new LayOutEx3();
	}


	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(tf.getText().length());   //글자 쓸 때마다 감지해서 숫자 출력
	    jbtn.setEnabled(tf.getText().length() > 0 ? true : false);   //텍스트를 쓰면 input버튼을 활성화 시켜줌

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf || e.getSource()==jbtn) {
			jTextArea.append(tf.getText()+"\n");
			 //위쪽 지역으로 append시켜줌

			tf.setText("\0");
			//다 지워줌
			tf.requestFocus();
			//키 이벤트 받을 컴포넌트 강제 설정
			//버튼을 누르거나 엔터를 누르더라도 포커스가 다른곳으로 옮겨가지 않고, 다시 텍스트 필드로 돌아가 커서가 나타나게 함
			//텍스트 필드의 경우 엔터를 누르는 것이다. jTextField의 경우 엔터가 먹히지 않기에 이번 경우엔 textField로 설정.
			
		}
		
	}
}
