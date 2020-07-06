package sist.com.obj.basic;

class Car{
	
}
//객체 --> 사물 그 자체 (this) --> 기능을 가지고있는 데이터
public class Person {

	
	public Person(String name) {
		//생성자 = 클래스 이름과 같고 반환형이없다.	
		System.out.println("Person(String)");
		this.name = name;
		
	}
	
	public Person() { //생성자 오버로드
		System.out.println("Person()");
	}
	
	public Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	public Person(String name, int age, double height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}
	
	private String name;
	private int age;
	private double height;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void disp() {
		System.out.println(this.name + " "+this.age+" "+this.height);
	}
	
	
	public static void main(String[] args) {
//		int data;
//		int[] m = {10, 20, 30, 40, 50}; //데이터만 들어갈 수 있음
		Person p1 = new Person("java", 25, 10.5); //데이터와 기능 둘 다 가질 수있음
//		p1.setName("asd");
//		System.out.println(p1.getName());
//		p1.name = "asdasd";
//		System.out.println(p1.name);
		Person p2 = new Person("oop", 20, 100.1);
		p2.disp();
	}
}

 