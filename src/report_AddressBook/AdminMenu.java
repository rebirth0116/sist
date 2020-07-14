package report_AddressBook;

import java.io.IOException;
import java.util.Scanner;


public class AdminMenu extends Calculator{
	Scanner sc = new Scanner(System.in);
	static Person[] people = new Person[1];
	public static int cnt ;
	public static ClientManageMenu cmm;
	
	
	
	public void increment(Person[] p) {
		Person[] temp = new Person[p.length*2];
		System.arraycopy(p, 0, temp, 0, p.length);
		people = temp;
	}
	
	public void add() {
		if(cnt>=people.length) {
			increment(people);
		}
		
		Person person = new Person(); //새로운 이름 나이 국적 가진 Person 객체 생성
		while(true) {
			System.out.print("이름 : ");
			person.setName(sc.next());
			if(person.getName().length()<5) break;
			System.out.println("다시 입력하시오.");
		}
		while(true) {
			System.out.print("나이 : ");
			person.setAge(sc.nextInt());
			if(person.getAge()>0 && person.getAge()<200) break;
			System.out.println("다시 입력하시오.");
		}
		while(true) {
			System.out.print("국적 : ");
			person.setNation(sc.next());
			if(person.getNation().length()<10) break;
			System.out.println("다시 입력하시오.");
		}
		
		people[cnt++] = person; //생성한 Person 객체를 객체배열에 추가
		
	}
	
	public void delete(int n) {
		for(int i = n-1; i<cnt-1; i++) { //데이터 덮어쓰면서 하나씩 앞당기기
			people[i] = people[i+1];
		}
		cnt--; //유효객체길이 조절
	}
	
	public void disp() {
		for(int i = 0; i<cnt; i++) {
			System.out.println("Person " + (i+1)  + people[i].toString());
		}
		System.out.println("자료 갯수 = " + cnt + " 나이평균 = " + getAvg(people, getSum(people, cnt))); 
	}
	public boolean emptyCheck() { //유효데이터가 있는지 검사
		if(cnt==0) {
			System.out.println("입력된 데이터가 없습니다.");
			return true;
		} 
		return false;
	}
	
	public void sortMenu() {
		while(true) {
			if(cnt == 1) {
				System.out.println("데이터가 1개이므로 정렬할 필요가 없습니다.");
				return;
			}
			System.out.println("1.내림차순||2.오름차순");
			int temp = sc.nextInt();
			if(temp == 1 || temp == 2) {
				sortByAge(temp);
				return;
			}
			System.out.println("다시 입력하시오.");
		}
		
	}
	
	public void sortByAge(int num) {
		Person temp;
		for(int i =0; i<cnt; i++) {
			for(int j = 0; j<cnt-1; j++) {
				if(num==1) {
					if(people[i].getAge()>people[j].getAge()) { //내림차순정렬
						temp = people[i];
						people[i] = people[j];
						people[j] = temp;
					}
				}else if(num==2) {
					if(people[i].getAge()<people[j].getAge()) { //오름차순정렬
						temp = people[i];
						people[i] = people[j];
						people[j] = temp;
					}
				}
			}
		}
		System.out.println("정렬이 완료되었습니다.");
	}
	
	public void modifySelect() {
		while(true) {
			System.out.println("몇번째");
			int temp = sc.nextInt();
			if(temp>0&&temp<=cnt) { //입력값이 유효데이터범위내에 있는지 확인
			modify(temp-1); //배열은 0부터이므로 -1
			return;
			}
			System.out.println("다시입력하시오.");
		}
	}
	public void modify(int n) {
		while(true) {
			System.out.println("1.이름수정||2.나이수정||3.국적수정");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("수정할 값");
				people[n].setName(sc.next());
				return;
			case 2:
				System.out.println("수정할 값");
				people[n].setAge(sc.nextInt());
				return;
			case 3:
				System.out.println("수정할 값");
				people[n].setNation(sc.next());
				return;
			default:
				break;
			}
			
		}
	}
	
	public void searchMenu() {
		while(true) {
			System.out.println("1.이름으로검색||2.나이로검색||3.국적으로검색");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("찾을 값");
				searchName(sc.next());
				return;
			case 2:
				System.out.println("찾을 값");
				searchAge(sc.nextInt());
				return;
			case 3:
				System.out.println("찾을 값");
				searchNation(sc.next());
				return;
			default :
			}
		}
	}
	
	public void searchName(String str) {
		for(int i = 0; i<cnt; i++) {
			if(people[i].getName().equals(str)) {
				System.out.println(people[i].toString());
			}
		}
	}
	public void searchAge(int n) {
		for(int i = 0; i<cnt; i++) {
			if(people[i].getAge()==n) {
				System.out.println(people[i].toString());
			}
		}
	}
	public void searchNation(String str) {
		for(int i = 0; i<cnt; i++) {
			if(people[i].getNation().equals(str)) {
				System.out.println(people[i].toString());
			}
		}
	}
	public static ClientManageMenu clientManageMenuGetInstance() { //싱글톤패턴
		return cmm==null?new ClientManageMenu():cmm;
	}
	public void menu() throws IOException {
		while (true) {
			System.out.println("===================================================================");
			System.out.println("1.추가||2.제거||3.나이순정렬||4.출력||5.검색||6.수정||7.회원관리||8.메인메뉴로돌아가기");
			System.out.println("===================================================================");
			switch (sc.nextInt()) {
			case 1:
				add();
				break;
			case 2:
				if(emptyCheck())break;
				System.out.println("몇번째");
				delete(sc.nextInt());
				break;
			case 3:
				if(emptyCheck())break;
				sortMenu();
				break;
			case 4:
				if(emptyCheck())break;
				disp();
				break;
			case 5:
				if(emptyCheck())break;
				searchMenu();
				break;
			case 6: 
				if(emptyCheck())break;
				modifySelect();
				break;
			case 7:
				clientManageMenuGetInstance().menu(); //싱글톤패턴
				break;
			case 8:
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("다시 입력하시오.");
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		AdminMenu a = new AdminMenu();
		a.menu();
	}
}
