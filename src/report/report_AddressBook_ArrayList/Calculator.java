package report.report_AddressBook_ArrayList;

import java.util.ArrayList;

public class Calculator {
	
	public int getSum(ArrayList<Person> people, int cnt) {
		int sum = 0;
		for(int i = 0; i<cnt; i++) {
			sum+=people.get(i).getAge();
		}
		return sum;
	}
	
	public double getAvg(ArrayList<Person> p, int sum) {
		double avg = 0;
		
		avg = (Math.round((double)sum/p.size()*100)/100.0); 
		//소수점 둘째자리까지 표시하기위해 100곱한 후 반올림하여 int형으로 만들고 다시 double형으로 전환하기위해 100.0으로 나눈다.
		
		return avg;
	}
	
}
