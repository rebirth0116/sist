package report.report_AddressBook_ArrayList;

import java.io.IOException;
import java.util.Scanner;

public class ClientMenu extends AdminMenu{
	Scanner sc = new Scanner(System.in);
	public void menu() {
		
		while(true) {
			System.out.println("======================================");
			System.out.println("1.출력||2.검색||3.나이순정렬||4.메인메뉴로돌아가기");
			System.out.println("======================================");
			switch(sc.nextInt()) {
			case 1:
				if(emptyCheck())break;
				disp();
				break;
			case 2:
				if(emptyCheck())break;
				searchMenu();
				break;
			case 3:
				if(emptyCheck())break;
				sortMenu();
				break;
			case 4:
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("다시입력하시오.");
				break;
			}
		}
	}
	

	
	
	public static void main(String[] args) throws IOException {
		new AdminMenu().menu(); //테스트용
	}
}
