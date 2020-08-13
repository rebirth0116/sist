package sist.com.window;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayOutEx4 extends JFrame implements ActionListener{
	JButton[] jButtons = new JButton[10];
	String[] str = {"Java","Oracle","Xml","Spring","JQuery","Ajax","Css","a","b","c"};
	JPanel jp1, jp2, jp3;
	CardLayout cardLayout = new CardLayout();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		String command = e.getActionCommand();
//		//현재 버튼의 라벨을 String 형태로 받는 것.
//		if(command.equals("Java")) {
//			cardLayout.show(this, "b");
//			//자바라는 버튼을 눌렀을 때, b 화면이 나타나게
//		}
//		if(command.equals("Spring")) cardLayout.show(this, "c");
//		if(command.equals("c")) cardLayout.show(this, "a");
		
//		cardLayout.next(this);
//		//아무거나 눌러도 다음 화면으로 넘어가게
		
//		cardLayout.previous(this);
//		//아무거나 눌러도 이전 화면으로 넘어가게
		
		cardLayout.previous(this.getContentPane());
		//JFrame의 경우 이렇게 사용해야 한다.
	}
	
	public void initLayEx() {
		this.setLayout(cardLayout);
		for(int i =0 ; i<jButtons.length; i++) {
			jButtons[i] = new JButton(str[i]);
			jButtons[i].addActionListener(this);
		}
		jp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		//우측정렬
		jp1.add(jButtons[0]);
		jp1.add(jButtons[1]);
		jp1.add(jButtons[2]);
		
		jp2 = new JPanel(new BorderLayout());
//		jp2.add("South",jp1);
		//이 경우 jp1이 jp2의 하단부에 위치하게 되어 결과적으로 버튼들이 좌하단에 위치하게된다.
		jp2.add(jButtons[3],BorderLayout.NORTH);
//		jp2.add("North",jButtons[3]); 과 같음.
		jp2.add(jButtons[4],BorderLayout.CENTER);
		jp2.add(jButtons[5],BorderLayout.SOUTH);
		jp2.add(jButtons[6],BorderLayout.EAST);
		jp2.add(jButtons[7],BorderLayout.WEST);
		//이 경우 jp1이 붙은 frame 위에 jp2를 붙이기 때문에 jp1의 버튼들은 보이지 않는다.
		
		
		jp3 = new JPanel(new GridLayout(1,2));
		//1행 2열 공간배치
		jp3.add(jButtons[8]);
		jp3.add(jButtons[9]);
		
		
		this.add("a",jp1);
//		this.add("Center",jp1); 와 같다.
		this.add("b",jp2);
		this.add("c",jp3);
		//카드 레이아웃은 이름을 줘서 그것을 통해 찾아가는 레이아웃
		//이 경우 jp3는 c라는 이름을 가지고 있다.
	}
	
	public LayOutEx4() {
		initLayEx();
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				//JFrame이 아니므로 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 사용 불가
				//그렇기 때문에 x 눌러도 종료가 안됨
				//윈도우 리스너를 달아야 함
			}
		});
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new LayOutEx4();
	}
}
