package sist.com.obj.basic;

public class ObjectEx8 {
	private String name = "abc";
	private static final int AGE = 3;
	private static String nation;
	
	public ObjectEx8 () {
	}
	public ObjectEx8 (String name) {
		this.name = name;
	}
	public String getname() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void setNation(String nation) {
		ObjectEx8.nation = nation;  //static 변수는 this. 사용이 안되므로 
	}
	public static String getNation() {
		return ObjectEx8.nation;
	}
	public static void setFinal(int a) {
		final int finalVal;
		finalVal = a;
		System.out.println(finalVal);
	}
	
	
	
	public static void main(String[] args) {
		ObjectEx8 o1 = new ObjectEx8();
		ObjectEx8 o2 = new ObjectEx8("efg");
		ObjectEx8 o3 = new ObjectEx8();
		System.out.println(o3.name);
		o3.setName("aaa");
		System.out.println(o1.name);
		System.out.println(o2.name);
		System.out.println(o3.name);
		o1.setNation("lll");
		System.out.println(o1.getNation());
		o2.setNation("222");
		System.out.println(o1.getNation());  //nation은 static이므로 o1에서 set하고 o2에서 set하는것 둘 다 같은 nation을 set시킨다.
		setFinal(3);
		setFinal(2);
		System.out.println(ObjectEx5.value);
	}
}
