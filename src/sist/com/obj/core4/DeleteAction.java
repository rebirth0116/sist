package sist.com.obj.core4;

public class DeleteAction extends Action{
	private String path;
	private boolean redirect;
	
	

	public DeleteAction() {
		super();
	}



	public DeleteAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}



	@Override
	public ActionForward execute() {
		System.out.println("DeleteAction");
		return new ActionForward(path, redirect);
	}

}
