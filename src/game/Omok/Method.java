package game.Omok;

import java.util.Scanner;

public class Method {
	static Scanner sc = new Scanner(System.in);
	private String[][] board;
	static int num;
	static int count;
	
	
	
	
	
	public void setBoard(int num) {
		this.num = num;
		//크기 num x num 보드판만들기
		board = new String[num][num];
	}
	
	public void setStone(int player) {
		int x = -1, y = -1;
		//돌놓기
		if(player%2==0) {
			while(true) {
				System.out.println("player "+((player%2)+1)+" turn");
				System.out.println("input the location");
				System.out.print("x = ");
				x = sc.nextInt();
				if(x>=board.length) {
					System.out.println("범위초과");
					continue;
				}
				System.out.print("y = ");
				y = sc.nextInt();
				if(y>=board[0].length) {
					System.out.println("범위초과");
					continue;
				}
				if(!(board[x][y].equals("[@]")) && !(board[x][y].equals("[o]"))) {
					board[x][y] = "[@]";
					if(sameCheck(x, y, num))return;
					break;
				}else {
					System.out.println("다시입력하시오");
					disp();
				}
			}
		}else {
			while(true) {
				System.out.println("player "+((player%2)+1)+" turn");
				System.out.println("input the location");
				System.out.print("x = ");
				x = sc.nextInt();
				if(x>=board.length) {
					System.out.println("범위초과");
					continue;
				}
				System.out.print("y = ");
				y = sc.nextInt();
				if(y>=board.length) {
					System.out.println("범위초과");
					continue;
				}
				if(!(board[x][y].equals("[@]")) && !(board[x][y].equals("[o]"))) {
					board[x][y] = "[o]";
					if(sameCheck(x, y, num))return;
					break;
				}
				else {
					System.out.println("다시입력하시오");
					disp();
				}
			}
		}
	}
	
	public void disp() {
		//보드판 출력
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public void initBoard() {
		//보드판 초기화
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				board[i][j] = "[ ]";
			}
		}
	}
	public boolean sameCheck(int x, int y, int num) {
		count++;
		if(count>num) {
			System.out.println("================");
			System.out.println("GameSet");
			System.out.println("================");
			return true;
		}
		if(x>0&&board[x-1][y].equals(board[x][y])) {
			sameCheck(x-1, y, num);
		}else if(x+1<board.length &&board[x+1][y].equals(board[x][y])) {
			sameCheck(x+1, y, num);
		}else if(y>0&&board[x][y-1].equals(board[x][y])) {
			sameCheck(x, y-1, num);
		}else if(y+1<board.length&&board[x][y+1].equals(board[x][y])) {
			sameCheck(x, y+1, num);
		}else if(x>0&&y>0&&board[x-1][y-1].equals(board[x][y])) {
			sameCheck(x-1, y-1, num);
		}else if(x+1<board.length&&y+1<board.length&&board[x+1][y+1].equals(board[x][y])) {
			sameCheck(x+1, y+1, num);
		}else if(x+1<board.length&&y>0&&board[x+1][y-1].equals(board[x][y])) {
			sameCheck(x+1, y-1, num);
		}else if(x>0&&y+1<board.length&&board[x-1][y+1].equals(board[x][y])) {
			sameCheck(x-1, y+1, num);
		}
		return false;
	}
	
//	public void checkWin(int x, int y, int num) {
//		//승체크
//		//x좌표, y좌표, 돌몇개놓아야이기는지
//		String mark = "";
//		if(num==0) {
//			mark =  "[@]";
//		}else mark = "[o]";
//				
//		while(true) {
//			
//			
//			
//		}
//		
//	}
	
}
