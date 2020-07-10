package sist.com.obj.core3;

public class StrObject {
	private char[]value;
	private int i;

	public StrObject(char[] value) {
		super();
		this.value = value;
	}
	public StrObject(int i) {
		this.i = i;
	}
	
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(obj instanceof String) {
			char [] v=((String)obj).toCharArray();
			if(value.length!=v.length) return false; //글자 수 다름
//			if(this.value.hashCode()!=v.hashCode())return false; //.hashCode의경우 주소값을 가지고 하는 것
			for(int i = 0; i<value.length; i++) {
				if(value[i]!=v[i])return false; //글자 하나하나 비교하면서 다를경우 false
			}
			return true;
		}
		
		
		if(obj instanceof Integer){
			Integer i = ((Integer)obj);
			if(this.i == i)return true;
		}
		
		return false;
	}
	
	
	
	 
	public static void main(String[] args) {
		char[] v1 = {'A', 'b', 'C', 'D'};
		char[] v2 = {'o', 'p', 'Q', 'R'};
		StrObject s1 = new StrObject(v1);
		StrObject s2 = new StrObject(v2);
		StrObject i1 = new StrObject(1);
		int i = 1;
//		System.out.println(s1.equals("AbCD"));
		System.out.println(i1.equals(i));
		
		
		
		
	}
}
