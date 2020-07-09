package sist.com.obj.core1;

public class SuperMain {
	
	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		sc.superClassMethod();
		
		SubClass su = new SubClass();
		su.subClassMetho();
		su.superClassMethod();
		
		SuperClass sc2 = new SubClass();
		
		SubClass su2 = (SubClass)sc2;
		
		Object o1 = new String("as");
		Integer i = new Integer(3);
		System.out.println(o1 instanceof Double);
		System.out.println(i instanceof Object);
				
		
	}
	
	
}
