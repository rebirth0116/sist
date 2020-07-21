package upgrade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		Menu menu = new Menu();
		while(true) {
			menu.mainMenu();
			switch(Integer.parseInt(br.readLine())) {
			case 1:
				new Upgrade().upgradeMenu();
				break;
			case 2:
				new Store().storeMenu();
				break;
			case 3:
				return;
			default :
				System.out.println("다시 입력해주십시오.");
				break;
			}
		}
	}
	
}
