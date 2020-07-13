package report_AddressBook;


import java.io.IOException;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	static Client[] clients = new Client[1];
	int cnt;
	
	public void menu() throws IOException  {
		while(true) {
		System.out.println("==============================");
		System.out.println("1.관리자전용||2.회원전용||3.프로그램종료");
		System.out.println("==============================");
		switch(sc.nextInt()) {
		case 1: 
			adminLogin();
			break;
		case 2:
			clientLoginMenu();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("다시입력하시오.");
			break;
		}
		}
	}
	
	public void adminLogin() throws IOException {
		System.out.println("관리자 로그인");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		if(id.equals(Admin.getId()) && pw.equals(Admin.getPw())) {
			new AdminMenu().menu();
		}else System.out.println("관리자 ID와 PW를 확인하십시오.");
	}
	
	public void clientLoginMenu() throws IOException {
		System.out.println("=================================");
		System.out.println("1.회원가입||2.로그인||3.초기화면으로돌아가기");
		System.out.println("=================================");
		switch(sc.nextInt()) {
		case 1: 
			clientSignUp();
			break;
		case 2:
			clientLogIn();
			break;
		case 3:
			return;
		default:
			System.out.println("다시 입력하시오.");
			return;
		}
	}
	
	public void increment(Client[] p) {
		Client[] temp = new Client[p.length*2];
		System.arraycopy(p, 0, temp, 0, p.length);
		clients = temp;
	}
	public void clientSignUp() throws IOException {
		System.out.println("회원 가입");
		if(cnt>=clients.length) {
			increment(clients);
		}
		
		Client client = new Client();
		while(true) {
			System.out.print("ID : ");
			client.setId(sc.next());
			if(client.getId().length()<7) break;
			System.out.println("아이디는 6자 이하로 생성해주십시오.");
		}
		while(true) {
			System.out.print("PW : ");
			client.setPw(sc.next());
			if(client.getPw().length()<12) break;
			System.out.println("패스워드는 11자 이하로 생성해주십시오.");
		}
		clients[cnt++] = client;
	}
	
	public void clientLogIn() throws IOException {
		if(cnt==0) {
			System.out.println("등록된 회원 정보가 없습니다.");
			return;
		}
		System.out.println("회원 로그인");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		for(int i =0; i<clients.length; i++) {
			if(id.equals(clients[i].getId()) && pw.equals(clients[i].getPw())) {
				new ClientMenu().menu();
				return;
			}
		}
		System.out.println("ID와 PW를 확인하십시오.");
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main m = new Main();
		m.menu();
	}
}
