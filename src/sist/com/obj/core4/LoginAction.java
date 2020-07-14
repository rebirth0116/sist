package sist.com.obj.core4;

public class LoginAction extends Action{
	public LoginAction() {
		super();
	}

	public LoginAction(String path, boolean redirect) {
		super(path, redirect);
	}

	public ActionForward execute() {
		System.out.println("LoginAction");
		return new ActionForward(getPath(), isRedirect());
	}
	
	
	
}
