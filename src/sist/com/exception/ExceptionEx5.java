package sist.com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//Exception try catch finally throw, throws
public class ExceptionEx5 {

	public void exception1() {
		File file = new File("d:\\kor.txt");
		try {
			file.createNewFile(); //d 드라이브에 kor.txt 생성
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void exception2(String path) {
		File file = new File(path);
//		System.out.println(file.canExecute());
//		System.out.println(file.getTotalSpace());
//		file.mkdir(); //path에 d:\\aaa 로 입력받으면, d드라이브에 aaa라는 폴더 생성
		for(String s : file.list()) {
			System.out.println(s);
		} //path에 있는 파일 목록
	}
	
	public void exception3() throws FileNotFoundException, InterruptedException{
		Scanner sc = new Scanner(new File("C:\\Users\\rebir\\eclipse-workspace\\Sist\\src\\sist\\com\\array\\ArrayEx11.java"));
		while(sc.hasNext()) {
			Thread.sleep(100);
			System.out.println(sc.nextLine()); //nextLine->한줄씩, next->공백별로
			//해당 파일의 내용을 한줄씩 읽어 1초간격으로 출력
		}
	}
	public void exception4() {
		byte[] data = new byte[10];
		try {
			System.out.println("Data:");
			int cnt = (System.in.read(data)); //항상 입력받은 첫 글자의 아스키코드 출력 
			//int c = read(); -> 선조에서 선언한 추상메소드를 후손에서 오버라이드 하고 그 오버라이드한 메소드를 선조에서 부를 수 있다.
			System.out.println("cnt = "+cnt);
			for(byte b : data) {
				System.out.println(b); //데이터 갯수 데이터 13 10 (13->엔터 10->개행) (cmd에서 알
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws FileNotFoundException, InterruptedException{
		ExceptionEx5 e = new ExceptionEx5();
//		e.exception1();
//		e.exception2("d:\\");
//		e.exception3();
		e.exception4();
	}
}
