package sist.com.window;

import java.awt.Dialog;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontDialog extends Dialog{
	
	MemoJang memoJang;
	
	public FontDialog(MemoJang memoJang) {
//		super();//에러남 (Dialog 클래스에 기본생성자가 없다.)
		super(memoJang);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				FontDialog.this.dispose();
			}
			
			
		});
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		
	}
}
