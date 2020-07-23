package sist.com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilEx3 {
	
	public void listMethod() {
		Double[] dValue = {99.5, 76.8, 87.9, 45.6, 99.9};
//		List<Double> list = Arrays.asList(dValue);
		ArrayList<Double> duList = new ArrayList<Double>(Arrays.asList(dValue));
		
		duList.clear();
		duList.add(10.2);
		duList.add(0, 20.3);
		
		System.out.println(duList);
	}
	
	public static void main(String[] args) {
		UtilEx3 u = new UtilEx3();
		u.listMethod();
	}
}
