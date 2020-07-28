package report.report_AddressBook_ArrayList;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Client> clients = new ArrayList<Client>();
	static AdminMenu am;
	static ClientMenu cm;
	
	
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
			adminMenuGetInstance().menu(); //싱글톤패턴
		}else System.out.println("관리자 ID와 PW를 확인하십시오.");
	}
	
	public static AdminMenu adminMenuGetInstance() { //싱글톤패턴
		if(am == null) {
			am = new AdminMenu();
		}
		return am;
	}
	
	
	public void clientLoginMenu() throws IOException {
		System.out.println("==================================");
		System.out.println("1.회원가입||2.로그인||3.회원탈퇴||4.돌아가기");
		System.out.println("==================================");
		switch(sc.nextInt()) {
		case 1: 
			clientSignUp();
			break;
		case 2:
			clientLogIn();
			break;
		case 3:
			clientSignOut();
		case 4:
			return;
		default:
			System.out.println("다시 입력하시오.");
			return;
		}
	}
	
	public boolean isDuplicateId(String str) {
		for(int i = 0; i<clients.size(); i++) {
			if(clients.get(i).getId().equals(str)) {
				System.out.println("이미 등록된 아이디입니다.");
				return true;
			}
		}
		return false;
	}
	
	public void clientSignOut() {
		System.out.println("탈퇴를 원하는 계정의 ID와 PW를 입력해주십시오.");
		System.out.println("ID :");
		String getId = sc.next();
		System.out.println("PW :");
		String getPw = sc.next();
		for(int i = 0; i<clients.size(); i++) {
			if(clients.get(i).getId().equals(getId) && clients.get(i).getPw().equals(getPw)) {
				clients.remove(i);
				System.out.println("회원탈퇴가 완료되었습니다.");
			}else System.out.println("계정 정보를 다시 확인하십시오.");
		}
	}
	
	public void clientSignUp() throws IOException {
		System.out.println("회원 가입");
		
		Client client = new Client();
		while(true) {
			System.out.print("ID : ");
			String str = sc.next();
			if(isDuplicateId(str)) return;	//중복 아이디 체크
			client.setId(str);
			if(client.getId().length()<7) break;
			System.out.println("아이디는 6자 이하로 생성해주십시오.");
		}
		while(true) {
			System.out.print("PW : ");
			client.setPw(sc.next());
			if(client.getPw().length()<12) break;
			System.out.println("패스워드는 11자 이하로 생성해주십시오.");
		}
		clients.add(client);
	}
	
	public void clientLogIn() throws IOException {
		if(clients.isEmpty()) {
			System.out.println("등록된 회원 정보가 없습니다.");
			return;
		}
		System.out.println("회원 로그인");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		for(int i =0; i<clients.size(); i++) {
			if(id.equals(clients.get(i).getId()) && pw.equals(clients.get(i).getPw())) {
				System.out.println("로그인 되었습니다.");
				clientMenuGetInstance().menu(); //싱글톤패턴
				return;
			}
		}
		System.out.println("ID와 PW를 확인하십시오.");
	}
	
	public static ClientMenu clientMenuGetInstance() { //싱글톤패턴
		return cm==null?new ClientMenu():cm;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main m = new Main();
		m.menu();
	}
}
