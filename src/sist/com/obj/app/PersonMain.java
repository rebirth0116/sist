package sist.com.obj.app;

import java.util.Scanner;

public class PersonMain {
	Scanner sc = new Scanner(System.in);
	Person[] people = new Person[1];
	int cnt ;
	
	public void increment(Person[] p) {
		Person[] temp = new Person[p.length*2];
		System.arraycopy(p, 0, temp, 0, p.length);
		people = temp;
	}
	
	public void add() {
		if(cnt>=people.length) {
			increment(people);
		}
		
		Person person = new Person(); //이름 나이 국적
		while(true) {
			System.out.print("이름 : ");
			person.setName(sc.next());
			if(person.getName().length()<5) break;
			System.out.println("다시 입력하시오");
		}
		while(true) {
			System.out.print("나이 : ");
			person.setAge(sc.nextInt());
			if(person.getAge()>0 && person.getAge()<200) break;
			System.out.println("다시 입력하시오");
		}
		while(true) {
			System.out.print("국적 : ");
			person.setNation(sc.next());
			if(person.getNation().length()<10) break;
			System.out.println("다시 입력하시오");
		}
		
		people[cnt++] = person;
		
	}
	
	public void delete(int n) {
		for(int i = n-1; i<cnt-1; i++) {
			people[i] = people[i+1];
		}
		people[--cnt] = new Person();
	}
	
	public void disp() {
		for(int i = 0; i<cnt; i++) {
			System.out.println(people[i].toString());
		}
	}
	public boolean emptyCheck() {
		if(cnt==0) {
			System.out.println("입력된 데이터가 없습니다.");
			return true;
		}else return false;
	}
	
	public void sortMenu() {
		while(true) {
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
					if(people[i].getAge()>people[j].getAge()) {
						temp = people[i];
						people[i] = people[j];
						people[j] = temp;
					}
				}else if(num==2) {
					if(people[i].getAge()<people[j].getAge()) {
						temp = people[i];
						people[i] = people[j];
						people[j] = temp;
					}
				}
			}
		}
	}
	
	public void modifySelect() {
		while(true) {
			System.out.println("몇번째");
			int temp = sc.nextInt();
			if(temp>0&&temp<=cnt) {
			modify(temp-1);
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
			System.out.println("1.seachName||2.searchAge||3.searchNation");
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
	public void menu() {
		while (true) {
			System.out.println("================================================================");
			System.out.println("1.add||2.delete||3.sortByAge||4.disp||5.search||6.modify||7.quit");
			System.out.println("================================================================");
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
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("다시 입력하시오");
			}
		}
	}

	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		pm.menu();
	}
}
