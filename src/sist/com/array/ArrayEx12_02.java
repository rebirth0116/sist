package sist.com.array;

import java.io.IOException;
import java.util.Scanner;

public class ArrayEx12_02 {
	static Scanner sc = new Scanner(System.in);
	static int x, y, arrCount;
	static int[][] arr;
	static int[] searched = new int[2];
	static int cnt;
	static int[][] changed;

	static boolean search(int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == num) {
					searched[0] = i;
					searched[1] = j;
					return true;
				}else count++;
			}
		}
		if(count==x*y) return false;
		else return true;
	}
	
	static void searchDisp(int num) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == num) {
					System.out.println(i+","+j);
				}
			}
		}
	}

	static void addFirst()  {
		cnt=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == arr.length && j == arr[i].length) {
					System.out.println("배열 작성 완료");
					return;
				} else {
					arr[i][j] = sc.nextInt();
				}
				cnt++;
			}
		}
	}

	static void disp() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	static void delete(int num) {
		if(!search(num)) {
			System.out.println("해당 값이 배열에 없습니다.");
			return;
		}
		
		for(int i = searched[0]; i<arr.length; i++) {
			for(int j = searched[1]; j<arr[i].length; j++) {
				if(i==arr.length-1 && j == arr[i].length-1){
					arr[i][j] = 0;
					break;
					}
				arr[i][j] = j==arr[i].length-1 ? arr[i+1][0] : arr[i][j+1];
				searched[1] = j==arr[i].length-1 ? 0 : searched[1]; 
				}
		}
		cnt--;
	}
	
	static void add(int n) {
		if(cnt==arrCount) {
			System.out.println("배열에 남은자리가 없습니다.");
			return;
		}
		arr[cnt/y][cnt%y] = n;
		cnt++;
	}
	
	static void changeArr() {
		System.out.println("행 수 입력:");
		x = sc.nextInt();
		System.out.println("열 수 입력:");
		y = sc.nextInt();
		if(arrCount!=x*y) {
			System.out.println("배열의 칸수가 맞지않습니다.");
			return;
		}
		changed = new int[x][y];
		arrCount = x*y;
		
		int a = 0;
		int b = 0;
		for(int i = 0; i<changed.length; i++) {
			for(int j = 0; j<changed[i].length; j++) {
				changed[i][j] = arr[a][b++];
				if(b==arr[0].length) {
					a++;
					b=0;
				}
			}
		}
		arr = changed;
		disp();
	}

	static void modify(int num, int input) {
		if(search(num)) {
		arr[searched[0]][searched[1]] = input;
		}else System.out.println("해당 값이 배열에 없습니다");
	}
	
	static void newArray() {
		System.out.println("만드려는 배열 행길이:");
		x = sc.nextInt();
		System.out.println("만드려는 배열 열길이:");
		y = sc.nextInt();
		arr = new int[x][y];
		arrCount = x*y;
		System.out.println("배열에 넣을 값 하나씩 입력");
		addFirst();
	}
	
	public static void main(String[] args)  {
		newArray();
		while (true) {
			System.out.println("=============================================================");
			disp();
			System.out.println("=============================================================");
			System.out.println("1.숫자 제거||2.배열 변환||3.삽입||4.위치찾기||5.수정||6.새배열만들기||");
			System.out.println("=============================================================");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("삭제할 값 입력:");
				delete(sc.nextInt());
				break;
			case 2:
				changeArr();
				break;
			case 3:
				System.out.println("추가할 값 입력:");
				add(sc.nextInt());
				break;
			case 4:
				System.out.println("찾을 숫자 입력");
				searchDisp(sc.nextInt());
				break;
			case 5:
				System.out.println("수정 대상 값 입력");
				int n1 = sc.nextInt();
				System.out.println("원하는 값 입력");
				int n2 = sc.nextInt();
				modify(n1, n2);
				break;
			case 6:
				newArray();
				break;
			default:
				 return;
			}

		}

	}
}


//int x = searched[0];
//int y = searched[1]+1;

//int i = searched[0];
//int j = searched[1];
//while(i<arr.length) {
//	while(j<arr[i].length) {
//		if(y>=arr[i].length) {
//			x++;
//			if(x>=arr.length) {
//				arr[i][j] = 0;
//				cnt--;
//				return;
//			}
//			y=0;
//			arr[i][j++] = arr[x][y++];
//		}else {
//			arr[i][j++] = arr[x][y++];
//		}
//		
//		if(i>=arr.length && j>=arr[i].length) {
//			arr[i][j] = 0;
//			cnt--;
//			return;
//		}
//	}
//	i++;
//	j = 0;
//}
