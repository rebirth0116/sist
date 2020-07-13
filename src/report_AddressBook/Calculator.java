package report_AddressBook;

public class Calculator {
	
	public int getSum(Person[] people, int cnt) {
		int sum = 0;
		for(int i = 0; i<cnt; i++) {
			sum+=people[i].getAge();
		}
		return sum;
	}
	
	public double getAvg(Person[] p, int sum) {
		double avg = 0;
		
		avg = ((double)Math.round((double)sum/AdminMenu.cnt*100)/100);
		
		return avg;
	}
	
}
