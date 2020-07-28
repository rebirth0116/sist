package game.Omok;

public class Main {
	public static void main(String[] args) {
		Method m = new Method();
		m.setBoard(3);
		m.initBoard();
		while(true) {
			m.disp();
			m.setStone(0);
			m.disp();
			m.setStone(1);
		}
	}
}
