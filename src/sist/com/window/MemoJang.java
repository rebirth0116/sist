package sist.com.window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoJang extends JFrame implements ActionListener{

	JTextArea jTextArea; //텍스트에어리어
	JScrollPane jScrollPane; //수평 수직으로 나오는 것
	JMenuBar jmb;
	JMenu file, edit, source, window, help;
	JMenuItem newItem, closeItem, openItem, saveItem;
	//메뉴 - 메뉴바 - 아이템
	//메뉴바 - 파일 편집 보기 도움말
	//아이템 - 저장 다른이름으로저장 끝내wlqrk
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==newItem) {
			new MemoJang();
		}
		if(obj==closeItem) {
			this.dispose();
		}
	}
	//메뉴를 눌렀을 때 액션 이벤트가 발생한다.
	
	public void initMenu() {
		jmb = new JMenuBar();
		file = new JMenu("File");
		file.add(newItem = new JMenuItem("NewItem"));
		newItem.addActionListener(this);
		//this에 있는 액션리스너 추가
		file.addSeparator();
		file.add(closeItem = new JMenuItem("CloseItem"));
		closeItem.addActionListener(this);
		file.addSeparator();
		file.add(openItem = new JMenuItem("OpenItem"));
		openItem.addActionListener(this);
		file.addSeparator();
		file.add(saveItem = new JMenuItem("SaveItem"));
		saveItem.addActionListener(this);
		file.addSeparator();
		edit = new JMenu("Edit");
		source = new JMenu("Source");
		window = new JMenu("Window");
		help = new JMenu("Help");
		jmb.add(file);
		jmb.add(edit);
		jmb.add(source);
		jmb.add(window);
		jmb.add(help);
		this.setJMenuBar(jmb);
		//메뉴바 안에 메뉴 안에 아이템
		
	}
	
	
	public MemoJang() {
		initMenu();
		jTextArea = new JTextArea(10, 50);
		jScrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(jScrollPane);
		this.setBounds(300, 200, 800, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		MemoJang m = new MemoJang();
		
		
	}
}
//				 _______
//    /\__/\     |     |
//=<=<|>오 <|>=>= < 야옹   |
//    \/ \/      |_____|
