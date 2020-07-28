package report.report_AddressBook_ArrayList;

import java.io.IOException;
import java.util.Iterator;

public class ClientManageMenu extends Main{
	public void menu() throws IOException{
		while(true) {
			System.out.println("==============================================");
			System.out.println("1.회원목록||2.회원추가||3.회원탈퇴처리||4.관리자메뉴로돌아가기");
			System.out.println("==============================================");
			switch(sc.nextInt()) {
			case 1:
				if(isClientEmpty()) break;
				clientDisp();
				break;
			case 2:
				clientSignUp();
				break;
			case 3:
				if(isClientEmpty()) break;
				clientDelete();
				break;
			case 4:
				return;
			default:
				System.out.println("다시 입력하시오");
			}
		}
	}
	
	public void clientDisp() {
		
		Iterator<Client> itr = clients.iterator();
		for(int i = 0; i<clients.size(); i++) {
			System.out.println("Client "+(i+1)+" "+ itr.next());
		}
		//iterator 사용
	}
	
	
	public boolean isClientEmpty() { //회원있는지 없는지 확인
		if(clients.size()==0) {
			System.out.println("가입회원이 없습니다.");
			return true;
		}
		return false;
	}
	
	public void clientDelete() {
		System.out.println("몇번째?");
		int temp = sc.nextInt();
		if(temp>=clients.size()) {
			System.out.println("목록을 참고하여 다시 입력해주십시오.");
			return;
		}
		clients.remove(temp-1);
		System.out.println("탈퇴 처리가 완료되었습니다.");
	}
}
//회원탈퇴
