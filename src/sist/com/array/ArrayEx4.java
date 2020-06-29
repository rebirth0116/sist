package sist.com.array;

public class ArrayEx4 {
	static int number = 5;
	static int[] sorted = new int[5];

	public void checkMaxMin(int[] arr) {
		int max = 0, min = arr[0]; // min에 integer.maxvalue 를 넣어도 되지만, 배열의 첫번째 값을 넣으면 족므이라도 더 빨라진다.
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}

		System.out.println("최대:" + max + " 최소:" + min);
	}

	public void bubbleSort(int[] arr) {
		// 버블정렬 = 바로 옆에 있는것과 비교
		// 뒤에서 하나씩 확정해가며 정렬
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void insertionSort(int[] arr) {
		// 삽입정렬은 필요할 때만 위치를 변경. 거의 정렬된 상태에서는 어느 정렬보다 빠르다.
		// 바로 앞의 것과 비교하면서 바로앞이 자신보다 작을때까지 변환
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			int j = i;
			while (arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}

	public void disp(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------");
	}

	public void printMax(int[] arr, int i) {
		System.out.println("배열에서 " + i + "번째로 큰 수는 " + arr[arr.length - i] + "이다.");
	}

	public void mergeSort(int[] a, int m, int n) {
		if (m < n) {
			int middle = (m + n) / 2;
			mergeSort(a, m, middle);
			mergeSort(a, middle + 1, n);
			merge(a, m, middle, n);
		}
	}

	public void merge(int[] a, int m, int middle, int n) {
		int i = m, j = middle + 1, k = m;
		while (i <= middle && j <= n) {
			if (a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			} else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}

		if (i > middle) {
			for (int t = j; t <= n; t++) {
				sorted[k] = a[t];
				k++;
			}
		} else {
			for (int t = i; t <= middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}

		for (int p = m; p <= n; p++) {
			a[p] = sorted[p];
		}

	}

	// 평균구하기
	public double getAvg(int[] arr) {
		int sum = 0;
		double avg;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;

		return avg;
	}

	// 평균과 비교
	public void avgCount(int[] x) {
		double avg = getAvg(x);
		int[] value = new int[2];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > avg) {
				value[0]++;
			} else if (x[i] > avg) {
				value[1]++;
			}
		}
		System.out.println("평균:" + avg);
		System.out.println("평균보다 높은 점수를 가진 사람의 수:" + value[0]);
		System.out.println("평균보다 낮은 점수를 가진 사람의 수:" + value[1]);
	}

	// 로또 1-45 중복없이 6자리 출력
	public void printLotto() {
		int[] lotto = new int[6];
		boolean check = true;
		int temp = getRanNum();

		for (int i = 0; i < lotto.length; i++) {
			do {
				temp = getRanNum();
				check = checkSame(temp, lotto,i);

			} while (check);
			lotto[i] = temp;
		}
		disp(lotto);
	}

	// 1-45 랜덤 숫자 생성
	public int getRanNum() {
		return (int) (Math.random() * 45) + 1;
	}

	// 배열에 같은 숫자 있는지확인. 같은 수가 있으면 true 반환
	public boolean checkSame(int n, int[] arr, int m) {
		boolean check = true;

		for (int i = 0; i < m+1; i++) {
			if (n == arr[i]) {
				check = true;
				break;
			} else
				check = false;
		}

		return check;
	}

	// 대소문자 상관없이 알파벳역순으로 출력
	public void charDemo() {
		char c[] = { 'A', 'b', 'c', 'D', 'F' };
		demoSort(c);
		System.out.println(c);
	}

	public char[] demoSort(char[] c) {
		char temp = ' ';
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = 0; j < c.length - 1; j++) {
				if (charToInt(c[j]) < charToInt(c[j + 1])) {
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		return c;
	}

	//대소문자 상관없이 int형으로 변환 (a,A = 0)
	public int charToInt(char c) {
		int i = 0;
		
		if (c >= 'a' && c <= 'z') {
			i = c - 'a';
		} else if (c >= 'A' && c <= 'Z')
			i = c - 'A';

		return i;
	}

	public static void main(String[] args) {
		ArrayEx4 a = new ArrayEx4();
		int[] input = { 30, 20, 50, 40, 70 };
//		a.checkMaxMin(input);
//		a.disp(input);
//		a.bubbleSort(input);
//		a.insertionSort(input);
//		a.mergeSort(input, 0, number-1);
//		a.disp(input);
//		a.printMax(input, 2);
		a.printLotto();
//		a.avgCount(input);
//		a.charDemo();
	}
}
