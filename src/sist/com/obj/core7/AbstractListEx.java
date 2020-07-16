package sist.com.obj.core7;

public abstract class AbstractListEx implements ListEx{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getChild() {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract Object search(Object object);
	public abstract boolean isFull();
	public abstract boolean isEmpty();
}
