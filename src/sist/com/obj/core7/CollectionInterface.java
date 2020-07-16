package sist.com.obj.core7;
//list, set
public interface CollectionInterface { //완전추상클래스
	public void add();
	public Object search(Object object);
	public boolean isFull();
	public boolean isEmpty();
	public Object getParent();
	public Object getChild();
}
