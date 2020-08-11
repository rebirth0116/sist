package sist.com.window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoJang extends JFrame implements ActionListener{

	JTextArea jTextArea; //텍스트에어리어
	JScrollPane jScrollPane; //수평 수직으로 나오는 것
	JMenuBar jmb;
	JMenu file, edit, source, window, help;
	JMenuItem newItem, closeItem, openItem, saveItem;
	JMenuItem copy, cut, paste;
	JMenuItem color, font;	
	//메뉴 - 메뉴바 - 아이템
	//메뉴바 - 파일 편집 보기 도움말
	//아이템 - 저장 다른이름으로저장 끝내기
	
	
	ImageIcon [] icon = new ImageIcon[4];
	String[] strFile = {"src/sist/com/window/newItem.gif","d:\\0806_icon\\closeItem.png","d:\\0806_icon\\openItem.gif","d:\\0806_icon\\saveItem.gif"};
//	String[] strFile = {"newItem.gif","closeItem.png","openItem.gif","saveItem.gif"};
	//  src/sist/com/window/newItem.gif         == 상대경로 (해당 소스파일과 같은 폴더에 넣어져 있을 경우 사용 가능)
	//  d:\\0806_icon\\closeItem.png            == 절대경로

	
	public void iconMake() {
		for (int i = 0; i< icon.length; i++) {
			icon[i] = new ImageIcon(strFile[i]);
		}
	}
	//strFile 에 있는 주소에 따라 ImageIcon배열 icon에 하나씩 넣는 메소드. 생성자에 추가하면 된다.
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser jFileChooser = new JFileChooser();
		Object obj = e.getSource();
		if(obj==newItem) {
			new MemoJang();
		}
		if(obj==closeItem) {
			this.dispose();
		}
		if(obj==openItem) {
//			jFileChooser.showOpenDialog(this);
//			//open을 실행 했을 때, 파일열기 창이 나오게 된다.
//			//showOpenDialog의 매개변수로 component가 지정되어 있다.
//			//this의 경우 component의 후손인 JFrame을 상속받고 있기에 component타입으로 사용이 가능하다.
			
			openEx();
		}
		if(obj==saveItem) {
			saveEx();
			
//			jFileChooser.showSaveDialog(this);
//			//save을 실행 했을 때, 파일저장 창이 나오게 된다.
		}
		
		if(obj==copy) {
			jTextArea.copy();
		}
		if(obj==cut) {
			jTextArea.cut();
		}
		if(obj==paste) {
			jTextArea.paste();
		}
		if(obj==color) {
			Color color = JColorChooser.showDialog(this, "ColorDialog", Color.RED);
			jTextArea.setBackground(color);
			// 배경 화면 색을 바꾸는데, 이 때 선택창의 초기 color가 red 이다.
		}
		if(obj==font) {
			new FontDialog(this);
		}
		
	}
	//메뉴를 눌렀을 때 액션 이벤트가 발생한다.
	
	public void initMenu() {
		jmb = new JMenuBar();
		file = new JMenu("File");
		file.add(newItem = new JMenuItem("NewItem",icon[0]));
		//newItem 이라는 JMenuItem타입의 변수에 이름을 NewItem로 지정하고 icon배열에 0번째에 있는 그림파일을 추가한다.
		newItem.addActionListener(this);
		//this에 있는 액션리스너 추가
		file.addSeparator();
		file.add(closeItem = new JMenuItem("CloseItem",icon[1]));
		closeItem.addActionListener(this);
		file.addSeparator();
		file.add(openItem = new JMenuItem("OpenItem",icon[2]));
		openItem.addActionListener(this);
		file.addSeparator();
		file.add(saveItem = new JMenuItem("SaveItem",icon[3]));
		saveItem.addActionListener(this);
		
		edit = new JMenu("Edit");
		edit.add(copy = new JMenuItem("Copy"));
		copy.addActionListener(this);//감지자
		edit.addSeparator();
		edit.add(cut = new JMenuItem("Cut"));
		cut.addActionListener(this);
		edit.addSeparator();
		edit.add(paste = new JMenuItem("Paste"));
		paste.addActionListener(this);
		
		source = new JMenu("Source");
		
		window = new JMenu("Window");
		window.add(color = new JMenuItem("Color"));
		color.addActionListener(this);
		window.addSeparator();
		window.add(font = new JMenuItem("Font"));
		font.addActionListener(this);
		
		help = new JMenu("Help");
		jmb.add(file);
		jmb.add(edit);
		jmb.add(source);
		jmb.add(window);
		jmb.add(help);
		this.setJMenuBar(jmb);
		//메뉴바 안에 메뉴 안에 아이템
		
	}//저장 열기
	
	public void saveEx() {
		JFileChooser jFileChooser = new JFileChooser();
		//이 부분을 싱글톤 패턴으로 하면 될듯
		//메소드가 끝나면 인스턴스가 사라지기 때문에 싱글톤까지 사용할 필요는 없다.
		int state = jFileChooser.showSaveDialog(MemoJang.this);
		//저장 창 띄우는 부분
//		System.out.println(state);
//		//저장 창에서 저장을 누르면 0, 취소를 누르면 1
		
		if(state == JFileChooser.APPROVE_OPTION) {
			saveProcess(jFileChooser);
		}

	}
	
	public void saveProcess(JFileChooser jFileChooser) {
//		System.out.println(jFileChooser.getSelectedFile());
//		//저장 창에서 설정한 파일의 주소가 반환된다.
		
		try (PrintWriter pw = new PrintWriter(jFileChooser.getSelectedFile())){
			pw.print(jTextArea.getText());
			//textArea에 있는 text들을 쓴다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void openEx() {
		JFileChooser jFileChooser = new JFileChooser();
		int state = jFileChooser.showOpenDialog(MemoJang.this);
		if(state == JFileChooser.APPROVE_OPTION) {
			openProcess(jFileChooser);
		}
	}
	public void openProcess(JFileChooser jFileChooser) {
		try (BufferedReader br = new BufferedReader(new FileReader(jFileChooser.getSelectedFile()))){
			String temp = null;
			while((temp = br.readLine())!=null) {
				jTextArea.append(temp);
//				jTextArea.append("\n\r");
				//윗 줄을 추가하지 않으면, 빈칸 없이 한줄로 출력된다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeState(int state) {
		if(state==JOptionPane.OK_OPTION) {
			//JOptionPane.OK_OPTION는 0으로 지정되어있다.
			saveEx();
			System.exit(0);
		}else if(state == JOptionPane.NO_OPTION) {
			//JOptionPane.NO_OPTION
			System.exit(0);
			//전체 다 종료
		}
	}
	
	public MemoJang() {
		iconMake();
		initMenu();
		this.addWindowListener(new WindowAdapter() {
			//Adapter = Anonymous Class

			@Override
			public void windowClosing(WindowEvent e) {
				JFileChooser jFileChooser = new JFileChooser();
				// TODO Auto-generated method stub
//				System.out.println(jTextArea.getDocument().getLength());
				//textArea에 들어있는 문자가 없으면 길이가 0이므로 0 출력, 나머지는 0이아닌값 출력
				if(jTextArea.getDocument().getLength()>0) {
//					JOptionPane.showMessageDialog(MemoJang.this, "저장");
					//여기서 showMessageDialog 첫번째 요소에 this 를 쓸 수 없다.
					// 이유 -> 내부 클래스에서의 this 가 들어가기 때문.
					//메세지 박스
					
					int result = JOptionPane.showConfirmDialog(MemoJang.this, "변경 내용을 저장하시겠습니까?");
					//종료 시 선택 메세지 창이 실행된다.
					//예 -> 저장 창 실행
					//아니오 -> 전부 종료
					//취소 -> 메세지 박스만 삭제
					//result의 경우 예 = 0, 아니오 = 1, 취소 = 2
					changeState(result);
				}
				else {
					System.exit(0);
					// 0 -> 정상종료, 나머지 -> 비정상 종료
				}
			}
		});
		
		jTextArea = new JTextArea(10, 50);
		jScrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(jScrollPane);
		this.setBounds(300, 200, 800, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//HIDE_ON_CLOSE가 default로 설정되어있다. 종료했을 때, 실제로 완전히 종료되는 것이 아니라, 숨어있음.
		//이것을 EXIT_ON_CLOSE로 설정하면 무조건 종료되도록 설정이 가능하다.
		//DO_NOTHING_ON_CLOSE로 설정하면 아무 일도 일어나지 않도록 설정이 가능하다.
	}
	
	public static void main(String[] args) {
		MemoJang m = new MemoJang();
	}
}
//				 _______
//    /\__/\     |     |
//=<=<|>오 <|>=>= < 야옹 |
//    \/ \/      |_____|
