package upgrade;

import java.util.Scanner;

public class Store {
	static Scanner sc = new Scanner(System.in);
	public void storeMenu() {
		while(true) {
			System.out.println("############################");
			System.out.println("## 1.구매 || 2.판매 || 3.나가기 ##");
			System.out.println("############################");
			switch(sc.nextInt()) {
			case 1:
				//buy();
				break;
			case 2:
				//sell();
				break;
			case 3:
				return;
			default:
				System.out.println("다시입력하십시오.");
				break;
			}
			
		}
	}
	
	public void buy() {
		
	}
	public void sell() {
		
	}
	
	
}
