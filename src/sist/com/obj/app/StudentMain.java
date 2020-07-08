package sist.com.obj.app;

import java.util.Scanner;

public class StudentMain { // 총점 평균 석차 sort
	Scanner sc = new Scanner(System.in);
	Student[] students = new Student[1];
	int cnt;
	public void add() {
		if(cnt>students.length-1) {
			increment(students);
		}
		Student st = new Student();
		do {
		System.out.println("name:");
		st.setName(sc.next());
		}while(st.getName().length()>4);		
		do {
		System.out.println("kor:");
		st.setKor(sc.nextInt());
		}while(st.getKor()<0||st.getKor()>100);
		do {
		System.out.println("eng:");
		st.setEng(sc.nextInt());
		}while(st.getEng()<0||st.getEng()>100);
		do {
		System.out.println("mat:");
		st.setMat(sc.nextInt());
		}while(st.getMat()<0||st.getMat()>100);
		avgTotal(st);
		students[cnt++] = st;
		checkRank(students);
	}
	
	public void increment(Student[] s) {
		Student[] temp = new Student[s.length*2];
		System.arraycopy(students, 0, temp, 0, students.length);
		students = temp;
	}
	
	public void list() {
		for(int i = 0; i<cnt; i++) {
			System.out.println(students[i]);
		}
	}
	
	public void avgTotal(Student s) {
		
		s.setTotal(s.getEng()+s.getKor()+s.getMat());
		s.setAvg(Math.round(s.getTotal()/3.0*100)/100.0);
		// 5 5 4 의 경우 반올림을 쓰지않고 sum/3.0을 하면 4.6666...7이 나옴
		// 이 때, 이 수에 *100 한 후 math.round를 이용해 소수 첫째자리에서 반올림 해 int형으로 만듬
		// int형이기 때문에 마지막으로 /100.0 을 해주면 소수점 셋째자리에서 반올림한 값을 setAvg할 수 있다.
	}
	
	public void checkRank(Student[] s) {
		for(int i = 0; i<cnt; i++) {
			int rank = 1;
			for(int j = 0; j<cnt; j++) {
				if(s[i].getAvg()<s[j].getAvg())
					rank++;
			}
			s[i].setRank(rank);
		}
	}
	
	public void sortByRank(Student[] s) {
		Student temp;
		for(int i = 0; i<cnt; i++) {
			for(int j = 0; j<cnt-1-i; j++) {
				if(s[j].getRank()>s[j+1].getRank()) {
					temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
	}
	
	public void menu() {
		while (true) {
			System.out.println("1.Add||2.List||3.sortByRank||4.exit");
			switch (sc.nextInt()) {
			case 1: 
				add();
				break;
			case 2: 
				list();
				break;
			case 3:
				sortByRank(students);
				break;
			default:
				return;
			}
		}
	}
	

	public static void main(String[] args) {
		new StudentMain().menu();
	}
}
