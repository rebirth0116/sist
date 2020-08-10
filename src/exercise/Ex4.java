package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex4 {
	static int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void binarySearch() throws IOException {
		int input = Integer.parseInt(br.readLine());
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(input<arr[mid]) {
				left = mid + 1;
			}else if(input>arr[mid]) {
				right = mid-1;
			}else {
				bw.write(mid+"");
				//bufferedWriter의 경우 write 할 때 뒤에 문자열을 붙여야 출력이 된다.
				// ->이유?
				bw.close();
				br.close();
				break;
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		binarySearch();
	}
}
