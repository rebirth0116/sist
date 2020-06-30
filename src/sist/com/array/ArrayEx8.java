package sist.com.array;

public class ArrayEx8 {
	int cnt = 0;
	int count = -1;

	public int [] add(int[] m, int data) {
		if(cnt>=m.length) {
			return increment(m);
		}
		m[cnt++] = data;
		return null;
	}

	public void delete(int[] arr, int num, char state) {

		int index = search(arr, num);
		if (index == -1) return;
			for (int i = index; i < arr.length; i++) {
				if(i+1 >= arr.length) {
					arr[i]=0;
					break;
				}
				else {
				arr[i] = arr[i + 1];
				arr[i + 1] = 0;
				}
			}
		cnt--;
		if(state == 'a')
			delete(arr, num, state);
	}

	public int search(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				return i;
		}
		return -1;
	}

	public void modify(int[] arr, int before, int after, char state) {
		int index = search(arr, before);
		if(index==-1) return;
		arr[index] = after;
		if(state == 'a')
			modify(arr, before, after, state);
	}

	public void disp(int[] m) {
		for (int i : m) {
//			if(i==0)continue;
			System.out.printf("%5d", i);
		}
		System.out.println();
	}
	
	public int [] increment(int[] input) {
		int[] output = new int[input.length*2];
		System.arraycopy(input, 0, output, 0, input.length);
		return output;
	}
	public static void main(String[] args) {
		ArrayEx8 a = new ArrayEx8();
		int[] m = new int[5];//[][][][][]
		
		
		for (int i = 0; i < m.length+1; i++) {
			  int []ii=a.add(m, (i+1)*10);
			  if(ii!=null)m=ii;
			
		}
		a.disp(m);
		}

	
}

//
//// 전부 다
//public int[] search(int[] arr, int num, char a) {
//	int[] index = new int[5];
//	int c = 0;
//	for (int i = 0; i < arr.length; i++) {
//		if (arr[i] == num) {
//			index[c++] = i;
//			count++;
//		}
//	}
//	return index;
//}
//
////public void delete(int[] arr, int num, char a) {
////	count = -1;
////	int[] index = search(arr, num, a);
////	if (count < 0) {
////		System.out.println("해당 숫자가 배열에 없습니다.");
////		return;
////	} else {
////		for (int i = count; i >= 0; i--) {
////			for (int j = index[i]; j < index.length; j++) {
////				if(j+1 >= index.length) {
////					arr[j] = 0;
////					break;
////				}
////				arr[j] = arr[j + 1];
////				arr[j + 1] = 0;
////			}
////		}
////	}
////}
//
//public void delete(int[] arr, int num, char a) {
//	count = -1;
//	int[] index = search(arr, num, a);
//	if (count < 0) {
//		return;
//	} else {
//		for (int i = count; i >= 0; i--) {
//			for (int j = index[i]; j < index.length; j++) {
//				if(j+1 >= index.length) {
//					arr[j] = 0;
//					break;
//				}
//				arr[j] = arr[j + 1];
//				arr[j + 1] = 0;
//			}
//		}
//	}
//}
//
//public void modify(int[] arr, int num, int change, char a) {
//	count = -1;
//	int[] index = search(arr, num, a);
//	if (count < 0) {
//		System.out.println("해당 숫자가 배열에 없습니다.");
//		return;
//	} else {
//		for (int i = count; i >= 0; i--) {
//			arr[index[i]] = change;
//		}
//	}
//
//}

