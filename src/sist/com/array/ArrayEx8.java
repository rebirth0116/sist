package sist.com.array;

public class ArrayEx8 {
	int cnt = 0;
	int count = -1;

	public void add(int[] m, int data) {
		m[cnt++] = data;
	}

	public void delete(int[] arr, int num) {
		
		int index = search(arr, num);
		
		
		
		for(int i = index; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
			arr[i+1] = 0;
		}
		
	}
	
	public int search(int[] arr, int num) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num) return i;
		}
		return -1;
	}
	
	public void modify(int[] arr, int before, int after) {
		int index = search(arr, before);
		arr[index] = after;
	}

	
	//전부 다 
	public int[] search(int[] arr, int num, char a) {
		int[] index = new int[5];
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				index[c++] = i;
				count++;
			}
		}
		return index;
	}

	public void delete(int[] arr, int num, char a) {
		count = -1;
		int[] index = search(arr, num, a);
		if (count < 0) {
			System.out.println("해당 숫자가 배열에 없습니다.");
			return;
		} else {
			for (int i = count; i >= 0; i--) {
				for(int j = index[i]; j<index.length-1; j++) {
					arr[j] = arr[j+1];
					arr[j+1]=0;
				}
			}
		}
	}
	
	public void modify(int[] arr, int num, int change, char a) {
		count = -1;
		int[] index = search(arr, num, a);
		if (count < 0) {
			System.out.println("해당 숫자가 배열에 없습니다.");
			return;
		} else {
			for (int i = count; i >= 0; i--) {
				arr[index[i]]=change;
			}
		}

	}
	

	public void disp(int[] m) {
		for (int i : m) {
//			if(i==0)continue;
			System.out.printf("%5d", i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayEx8 a = new ArrayEx8();
		int[] m = new int[5];
		a.add(m, 10);
		a.disp(m);
		a.add(m, 20);
		a.disp(m);
		a.add(m, 20);
		a.disp(m);
		a.add(m, 30);
		a.disp(m);
		a.add(m, 10);
		a.disp(m);
		a.delete(m, 10);
		a.disp(m);
		a.modify(m, 20, 30);
		a.disp(m);
		a.modify(m, 30, 40, 'a');
		a.disp(m);
		a.delete(m, 40, 'a');
		a.disp(m);

	}
}
