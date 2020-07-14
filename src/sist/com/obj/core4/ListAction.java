package sist.com.obj.core4;
//목록을 보여주는 액션
public class ListAction extends Action{
	

	public ListAction() {
		super();
	}

	public ListAction(String path, boolean redirect) {
		super(path, redirect);
	}

	@Override
	public ActionForward execute() {
		// TODO Auto-generated method stub
		System.out.println("ListAction");
		return new ActionForward(getPath(), isRedirect());
	}

}
