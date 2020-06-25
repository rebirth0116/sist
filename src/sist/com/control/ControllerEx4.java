package sist.com.control;

//of, if else, if elseif else, switch case default
//for while dowhile break continue
public class ControllerEx4 {

	public void forEx1(int cnt) {
		for (int i = 0; i < cnt; i++) {
			if ((i % 2 == 0)) {
				continue;
			}
			if (i == 3)
				break;
			System.out.println("hi");
		}
	}

	public void forEx2() {
		int cnt=0;
		for (int i = 1; i < 9; i++) {
			for (int j = 2; j <= 9; j++) {
				++cnt;
			}

		}
	}

	public static void main(String[] args) {
		ControllerEx4 c = new ControllerEx4();
		c.forEx1(5);
		c.forEx2();

	}

}
