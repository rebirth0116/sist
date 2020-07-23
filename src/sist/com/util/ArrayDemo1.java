package sist.com.util;

public class ArrayDemo1<E> {
	Object[] elementData;
	static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	public ArrayDemo1() {
		elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		System.out.println(elementData.length);
//		elementData[0] = 10; //실제 메모리가 할당되어있지 않아 불가능.
		//그냥 Object[] elementData 만 했을 경우엔 해당 변수에 null이 들어가 있어 elementData.length에서 오류발생.
		//{}를 넣게 되면 실제 메모리가 할당되어있지않아 0번째가 존재하지 않는다.
		//즉, 해당 주소는 존재하나 데이터가 들어갈 수 있는 공간이 없는 것.
	}
	public void add(E obj) { 
		//E = element의 약자
		//parameter의 type을 E로 할 경우 public class ArrayDemo -> ArrayDemo<E>로 변환해야 함.
		
	}
	public static void main(String[] args) {
		ArrayDemo1<Double> a = new ArrayDemo1<Double>(); //elementData
	}
}
