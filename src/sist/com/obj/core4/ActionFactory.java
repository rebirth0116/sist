package sist.com.obj.core4;

public class ActionFactory {
	static ActionFactory actionFactory;
	
	public static ActionFactory getInstance() {
		if(actionFactory == null) {
			actionFactory = new ActionFactory();
		}
		return actionFactory;
	}
	//null일 때만 객체를 하나 생성함 -> 메모리 관리에 용이 => 싱글톤 패턴
	
	
	
	public Action getAction(String command) {
		if(command.equals("login")) {
			return new LoginAction("loginView.txt", true);
		}else if(command.equals("list")) {
			return new ListAction("listView.txt", false);
		}
		return null;
	}
}
