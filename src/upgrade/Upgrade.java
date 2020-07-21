package upgrade;

import java.util.Scanner;

public class Upgrade {
	static Scanner sc = new Scanner(System.in);
	
	public void upgradeMenu() {
		while(true) {
			System.out.println("#################################");
			System.out.println("## 1.확률확인 || 2.강화시작 || 3.나가기 ##");
			System.out.println("#################################");
			switch(sc.nextInt()) {
			case 1:
				//checkRate();
				break;
			case 2:
				//startUpgrade();
				break;
			case 3:
				return;
			default:
				System.out.println("다시입력하십시오");
				break;
			}
		}
		
	}
	
	public void checkRate() {
		
	}
	
	public void startupgrade() {
		
	}
	
	
}
