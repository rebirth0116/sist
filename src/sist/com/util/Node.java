package sist.com.util;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class Node {
	private Object data;
	private Node next;
	
	
	public Node() {
		
	}
	
	public Node(Object data) {
		super();
		this.data = data;
	}
	

	public Node(Node next) {
		super();
		this.next = next;
	}

	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}


	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	public static void main(String[] args) {
		Node node1 = new Node(); //heap에 data|next 생성
		node1.setData(10);
		node1.setNext(new Node(20));
		node1.getNext().setNext(new Node(30)); //node1의 다음의 next를 new Node(30)으로 설정.
		System.out.println(node1.getData()); //10
		System.out.println(node1.getNext().getData()); //20
		System.out.println(node1.getNext().getNext().getData()); //30
		
		
	}
}
