package sist.com.obj.core4;

import java.util.Scanner;

public class ServletAction {
	Scanner sc = new Scanner(System.in);
	public void menu() {
		String command = null;
		while(true) {
			System.out.println("1.Login 2.List 3.Delete");
			switch(sc.nextInt()) {
			case 1:
				command = "login";
				break;
			case 2:
				command = "list";
				break;
			case 3:
				command = "delete";
				break;
			default :
				break;
			} //switch
			Action action = ActionFactory.getInstance().getAction(command);
			ActionForward af = action.execute();
			if(af.isRedirect()) {
				System.out.println("direct" + af.getPath());
			}else {
				System.out.println("undirect" + af.getPath());
			}
		} //while
	}
	
	public static void main(String[] args) {
		ServletAction s = new ServletAction();
		s.menu();
	}
}
