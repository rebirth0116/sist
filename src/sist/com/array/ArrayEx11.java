package sist.com.array;

import java.util.Scanner;

public class ArrayEx11 {
	Scanner sc = new Scanner(System.in);
	int year, month;
	int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
	String[] week = {"일","월","화","수","목","금","토"};
	
	public boolean yunDal(int year) {
		return (year%4==0&&year%100!=0||year%400==0);
	}
	//2020/6/1
	public int getCount() {
		int cnt = (year-1)*365;
		for(int i = 1; i<year; i++) {
			if(yunDal(i)) cnt++;
		}//2019*365 + yunDal
		if(yunDal(year))lastDay[1]++;
		for(int i = 1; i<month; i++) {
			cnt+=lastDay[i-1];
		}
		return ++cnt;
	}
	
	public void injectWeek() {
		System.out.println("Year-->");
		year = sc.nextInt();
		System.out.println("Month-->");
		month = sc.nextInt();
		System.out.println(year + " "+month);
		checkWeek(getCount());
	}
	
	public void checkWeek(int i) {
		System.out.println(week[i%7]);
	}
	
	
	
	public static void main(String[] args) {
		ArrayEx11 a = new ArrayEx11();
		a.injectWeek();
	}
}
