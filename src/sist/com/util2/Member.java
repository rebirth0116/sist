package sist.com.util2;

public class Member {
	private String id;
	private String name;
	private String address;
	private String hobby;
	public Member() {
		super();
	}
	public Member(String id, String name, String address, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobby = hobby;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", address=" + address + ", hobby=" + hobby + "]";
	}
	
}
