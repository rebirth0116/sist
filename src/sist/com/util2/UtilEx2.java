package sist.com.util2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UtilEx2 {
	Scanner sc = new Scanner(System.in);
	ArrayList<Member> list = new ArrayList<Member>();

	public void print() {
		while (true) {
			System.out.println("1.Add 2.Delete 3.Info 4.List 5.modify");
			switch (sc.nextInt()) {
			case 1:
				memberAdd();
				break;
			case 2:
				memberDelete();
				break;
			case 3:
				memberInfo();
				break;
			case 4:
				memberList();
				break;
			case 5:
				memberModify();
			default:
				break;
			}
		}
	}

	public UtilEx2() {
		list.add(new Member("a", "b", "c", "d"));
	}

	public boolean idCheck(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id))
				return true;
		}
		return false;
	}

	public void memberAdd() {
		Member member = new Member();
		String id = null;
		do {
			System.out.println("Id:");
			id = sc.next();
			member.setId(id);
		} while (idCheck(id));
		System.out.println(member.getId());

		System.out.println("name");
		String name = sc.next();
		member.setName(name);
		System.out.println("adress");
		String address = sc.next();
		member.setAddress(address);
		System.out.println("hobby");
		String hobby = sc.next();
		member.setHobby(hobby);
		list.add(member);
	}

	public void memberDelete() {
		//~~님 삭제
		System.out.println("who:");
		String temp = sc.next();
		System.out.println(list.remove(searchName(temp)).getName() + "님 삭제되었습니다.");
	}
	
	public void memberInfo() {
		//id 받아 해당 정보 출력
		System.out.println("id:");
		String temp = sc.next();
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId().equals(temp)) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void memberList() {
//		for (Member m : list) {
//			System.out.println(m);
//		}
		Iterator<Member>itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
	public int searchName(String name) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				return i;
			}
		}return -1;
	}
	public void memberModify() {
		System.out.println("modify who:");
		System.out.println("name:");
		int index = searchName(sc.next());
		System.out.println("modify what");
		System.out.println("1.name 2.id 3.address 4.hobby");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("to what");
			list.get(index).setName(sc.next());
			break;
		case 2:
			System.out.println("to what");
			list.get(index).setId(sc.next());
			break;
		case 3:
			System.out.println("to what");
			list.get(index).setAddress(sc.next());
			break;
		case 4:
			System.out.println("to what");
			list.get(index).setHobby(sc.next());
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		UtilEx2 u = new UtilEx2();
		u.print();
	}

}
