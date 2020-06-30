package sist.com.array;

public class ArrayEx8_2 {
	int cnt = 0;
	int x = 0;
	
	public void add(int[][] arr, int num) {
		if(cnt==arr[x].length) {
			x++;
			cnt = 0;
		}
		arr[x][cnt++] = num;
	}
	
	//여기부터 체크 
	public int search(int[][] arr, int num) {
		int index = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(arr[i][j]==num) return index;
				else index++;
			}
		}
		
		return -1;
	}
	
	public void modify(int[][] arr, int num, int change) {
		
	}
	
	public void delete (int[][] arr, int num) {
		
	}
	
	public void disp(int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		ArrayEx8_2 a = new ArrayEx8_2();
		int[][] arr = new int[2][3];
		
		a.add(arr, 10);
		a.add(arr, 20);
		a.add(arr, 30);
		a.add(arr, 40);
		a.add(arr, 50);
		a.add(arr, 60);
		a.disp(arr);
		System.out.println();
		
	}
	
}
