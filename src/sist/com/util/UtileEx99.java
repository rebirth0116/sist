package sist.com.util;

import java.util.List;

public class UtileEx99 {
	
	/*
	 * public <Z>void add(Z...a){ for(Z i : a) { System.out.println(i); } }
	 */
	public <Z>List<Z> add(Z...a){
		return ArrayUser.asListEx(a);
	}
	
	public static void main(String[] args) {
		UtileEx99 u=new UtileEx99();
		System.out.println(u.add(10,20,30).get(0));
	}
}