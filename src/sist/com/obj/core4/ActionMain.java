package sist.com.obj.core4;

public class ActionMain {

	
	public static void main(String[] args) {
		LoginAction loginaction = new LoginAction();
		loginaction.execute();
		ListAction listaction = new ListAction();
		listaction.execute();
		DeleteAction deleteaction = new DeleteAction();
		deleteaction.execute();
		
		
	}
}
