package sist.com.array;

import java.util.Scanner;

public class Calendar {
	Scanner sc = new Scanner(System.in);
	int year, month;
	int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
	String[] week = {"일","월","화","수","목","금","토"};
	int[][] cal = new int[6][7];
	int firstDay;
	
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
		System.out.println("            "+year + " "+month);
		firstDay = getCount()%7;
		fillCal(firstDay);
		disp();
	}
	
	public void checkWeek(int i) {
		System.out.println(week[i%7]);
	}
	
	public void fillCal(int n) {
		int temp = 0;
		int left = 1;
		for(int i = n; i<cal.length+1; i++) {
			cal[temp][i] = left++;
		}
		left++;
		for(temp = 1; temp<cal.length; temp++) {
			for(int i = 0; i<cal[temp].length; i++) {
				cal[temp][i] = left;
				if (left==lastDay[month-1])return;
				left++;
			}
		}
	}
	
	public void disp() {
		for(int i =0; i<7; i++) {
			System.out.print(week[i]+"        ");
		}
		System.out.println();
		for(int i = 0; i<cal.length; i++) {
			for(int j = 0; j<cal[i].length; j++) {
				if(cal[i][j]==0) {
					System.out.printf("%5s","");
					continue;
				}
				System.out.printf("%-5d",cal[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Calendar c = new Calendar();
		c.injectWeek();
	}
}
