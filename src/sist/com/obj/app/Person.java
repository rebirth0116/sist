package sist.com.obj.app;

public class Person {
	private String name, nation;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
	}
	public Person(String name, String nation, int age) {
		this.name = name;
		this.nation = nation;
		this.age = age;
	}
	@Override
	public String toString() {
		return " [name=" + name +  ", age=" + age + ", nation=" + nation + "]";
	}
	
	
}
