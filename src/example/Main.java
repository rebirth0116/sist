package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int n, cnt;
	static String temp;

	public static String[] sameDelete(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr[i] = "";
					cnt++;
				}
			}
		}
		String[] output = new String[n-cnt];
		for(int i = 0; i<arr.length;i++) {
			for(int j = i; j<n-cnt;j++) {
				if(!(arr[i].isEmpty())) {
					output[j]=arr[i];
					break;
				}
			}
		}
		return output;
	}

	public static void checkNum(String[] arr) {
		// 글자수대로
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() > arr[j].length()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

//		 사전순서
		
	}

	public static void checkDic(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].length() == arr[i + 1].length()) {
				for(int j= 0; j<arr[i].length();j++) {
					if(arr[i].charAt(j)>arr[i+1].charAt(j)) {
						temp = arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
			}
		}

	}

	public static void printAns(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void deleteNull(String[] arr) {
		for(int i = 0; i<arr.length;i++) {
			
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		sameDelete(arr);
//		Arrays.sort(arr);
//		checkNum(arr);
//		deleteNull(arr);
		printAns(arr);
		
		

	}

}
