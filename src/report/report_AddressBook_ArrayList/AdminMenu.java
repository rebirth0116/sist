package report.report_AddressBook_ArrayList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class AdminMenu extends Calculator{
	Scanner sc = new Scanner(System.in);
	static ArrayList<Person> people = new ArrayList<Person>();;
	public static int cnt ;
	public static ClientManageMenu cmm;
	
	public void add() {
		
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
		
		people.add(person); //생성한 Person 객체를 객체배열에 추가
		
	}
	
	public void deleteSelect() {
		while(true) {
			System.out.println("몇번째");
			int temp = sc.nextInt();
			if(temp>0&&temp<=people.size()) { //입력값이 유효데이터범위내에 있는지 확인
			people.remove(temp-1); //배열은 0부터이므로 -1
			return;
			}
			System.out.println("다시입력하시오.");
		}
	}
	
	public void delete(int n) {
		people.remove(n);
	}
	
	public void disp() {
		Iterator<Person> itr = people.iterator();
		for(int i = 0; i<people.size(); i++) {
			System.out.println("Person " + (i+1) + itr.next());
		}
		
		System.out.println("자료 갯수 = " + people.size() + " 나이평균 = " + getAvg(people, getSum(people, people.size()))); 
		
	}
	public boolean emptyCheck() { //유효데이터가 있는지 검사
		if(people.size()==0) {
			System.out.println("입력된 데이터가 없습니다.");
			return true;
		} 
		return false;
	}
	
	public void sortMenu() {
		while(true) {
			if(people.size() == 1) {
				System.out.println("데이터가 1개이므로 정렬할 필요가 없습니다.");
				return;
			}
			System.out.println("1.내림차순||2.오름차순||3.돌아가기");
			int temp = sc.nextInt();
			switch(temp) {
			case 1:
			case 2:
				sortByAge(temp);
				return;
			case 3:
				return;
			default:
				System.out.println("다시 입력하시오.");
			}
		}
	}
	
	public void sortByAge(int num) {
		Person temp;
		for(int i =0; i<people.size(); i++) {
			for(int j = 0; j<people.size()-1; j++) {
				if(num==1) {
					if(people.get(i).getAge()>people.get(j).getAge()) { //내림차순정렬
						temp = people.get(i);
						people.set(i, people.get(j));
						people.set(j, temp);
					}
				}else if(num==2) {
					if(people.get(i).getAge()<people.get(j).getAge()) { //오름차순정렬
						temp = people.get(i);
						people.set(i, people.get(j));
						people.set(j, temp);
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
			if(temp>0&&temp<=people.size()) { //입력값이 유효데이터범위내에 있는지 확인
			modify(temp-1); //배열은 0부터이므로 -1
			return;
			}
			System.out.println("다시입력하시오.");
		}
	}
	public void modify(int n) {
		while(true) {
			System.out.println("1.이름수정||2.나이수정||3.국적수정||4.돌아가기");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("수정할 값");
				people.get(n).setName(sc.next());
				return;
			case 2:
				System.out.println("수정할 값");
				people.get(n).setAge(sc.nextInt());
				return;
			case 3:
				System.out.println("수정할 값");
				people.get(n).setNation(sc.next());
				return;
			case 4:
				return;
			default:
				System.out.println("다시 입력하시오.");
				break;
			}
			
		}
	}
	
	public void searchMenu() {
		while(true) {
			System.out.println("1.이름으로검색||2.나이로검색||3.국적으로검색||4.돌아가기");
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
			case 4:
				return;
			default :
				System.out.println("다시입력하시오.");
			}
		}
	}
	
	public void searchName(String str) {
		for(int i = 0; i<people.size(); i++) {
			if(people.get(i).getName().equals(str)) {
				System.out.println(people.get(i).toString());
			}
		}
	}
	public void searchAge(int n) {
		for(int i = 0; i<people.size(); i++) {
			if(people.get(i).getAge()==n) {
				System.out.println(people.get(i).toString());
			}
		}
	}
	public void searchNation(String str) {
		for(int i = 0; i<people.size(); i++) {
			if(people.get(i).getNation().equals(str)) {
				System.out.println(people.get(i).toString());
			}
		}
	}
	public static ClientManageMenu clientManageMenuGetInstance() { //싱글톤패턴
		return cmm==null?new ClientManageMenu():cmm;
	}
	public void menu() throws IOException {
		while (true) {
			System.out.println("====================================================================");
			System.out.println("1.추가||2.제거||3.나이순정렬||4.출력||5.검색||6.수정||7.회원관리||8.메인메뉴로돌아가기");
			System.out.println("====================================================================");
			switch (sc.nextInt()) {
			case 1:
				add();
				break;
			case 2:
				if(emptyCheck())break;
				deleteSelect();
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
