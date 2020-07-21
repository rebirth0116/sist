package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baskin31 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] arr = new int[31];
	static int last, get;
	
	public static int comPush(int num) {
		if(num==1)return 2;
		
		
		for(int i = 1; i<=3; i++) {
			if((num+i+2)%4==0) {
				return num+i;
			}
		}
//필승코드
		if(num>=23 && num<=25)return 26;
		if(num >= 27) {
		return 30;
		}
		else {
			int ran = (int)(Math.random()*3)+1;
			return num + ran;
		}
	}
	
	public static void firstInit() {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	public static void dispArr(int start, int end) {
		int temp = 0;
		int temp2 = 0;
		for(int i = 0; i<arr.length; i++) {
			if(start == arr[i]) {
				temp = i;
				break;
			}
		}
		for(int i = temp; i<arr.length; i++) {
			if(end == arr[i]) {
				temp2 = i;
				break;
			}
		}
		System.out.print("com : ");
		for(int i = temp+1; i<=temp2; i++) {
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static boolean isCheat(int num) {
		if(num - last>3 || num<=last) {
			System.out.println("법규를 준수하십시오.");
			return true;
		}
		return false;
	}
	
	public static void play() throws NumberFormatException, IOException {
		while(true) {
			do {
				System.out.println((last+1) + "부터" + (last+3) +"까지의 숫자중 하나를 입력하십시오.");
				get = Integer.parseInt(br.readLine());
				}while(isCheat(get));
				last = get;
				int temp = comPush(get);
				if(last == temp && last != 1) {
					System.out.println("YOU WIN");
					return;
				}
				dispArr(last, temp);
				last = temp; 
				if(last==30) {
					System.out.println("YOU LOSE");
					return;
			}
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		firstInit();
		play();
	}
}
