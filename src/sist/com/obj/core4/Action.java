package sist.com.obj.core4;

public abstract class Action {
	private String path;
	private boolean redirect;
	
	
	
	public Action() {
		super();
	}



	public Action(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}



	public boolean isRedirect() {
		return redirect;
	}



	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}



	public abstract ActionForward execute();
}
