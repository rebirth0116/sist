package package2;

import java.util.ArrayList;

import package1.Super;

public class InstanceClass {
	public InstanceClass() {
		ArrayList list;
	}
	
	public static void main(String[] args) {
		Super s = new Super();
		s.publicData = 400;
	}

}
