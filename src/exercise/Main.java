package exercise;

public class Main {
	static int i;
	static int result;
	static int temp;
	static int sum;

	public static void main(String[] args) {
		for(int i = 1; i<=5000; i++) {
			if(!isGenerator(i)) sum+=i;
		}
		System.out.println(sum);

	}
	
	public static boolean isGenerator(int a) {
		for (i = 0; i <= a; i++) {
			temp = sum(i);
			if (i + temp <= a) {
				if (i + temp == a) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int sum(int a) {
		result = 0;
		while (a > 0) {
			result += a % 10;
			a /= 10;
		}
		return result;
	}

}