package sist.com.obj.app;

import java.util.Scanner;

public class BookMain {
	Scanner sc = new Scanner(System.in);
	Book[] bookArray;
	static int cnt = 0;

	public void injection(int i) {	
		System.out.println("author:");
		bookArray[i].setAuthor(sc.next());
		System.out.println("price:");
		bookArray[i].setPrice(sc.nextInt());
		System.out.println("bookName:");
		bookArray[i].setBookName(sc.next());
		System.out.println("publisher:");
		bookArray[i].setPublisher(sc.next());
		System.out.println("isbn:");
		bookArray[i].setIsbn(sc.next());
	}

	public void sortByPrice(Book[] bookArray) {
		Book temp = new Book();
		for(int i = 0; i<bookArray.length; i++) {
			for(int j = i; j<bookArray.length; j++) {
				if(bookArray[i].getPrice()>bookArray[j].getPrice()) {
					temp = bookArray[i];
					bookArray[i] = bookArray[j];
					bookArray[j] = temp;
				}
			}
		}
	}
	
	public void disp(Book[] bookArray) {
		System.out.println("저자 가격 책이름 출판사 isbn");
		for(int i = 0; i<cnt; i++) {
			//cnt까지 출력하면데이터가 존재하는 부분까지만 출력할 수 있다
			System.out.println(bookArray[i].toString());
		}
	}
	
	public void deleteArray(int n, Book[] bookArray) {
		for(int i = n-1; i<bookArray.length-1; i++) {
			bookArray[i] = bookArray[i+1];
		}
		bookArray[bookArray.length-1] = new Book();
		cnt--;
	}
	
	public Book[] increment(Book[] bookArray) {
		Book[] temp = new Book[bookArray.length*2];
		for(int i = 0; i<temp.length; i++) {
			temp[i] = new Book();
		}
		System.arraycopy(bookArray, 0, temp, 0, bookArray.length);
		return temp;
	}
	
	public void addArray(Book[] bookArray) {
		if(cnt>=bookArray.length) {
			this.bookArray = increment(bookArray); 
			//this.를 붙이지 않으면 매개변수 bookArray를 변환하기에 주의
			addArray(this.bookArray);
		}else {
			injection(cnt++);
		}
	}
	
	
	public static void main(String[] args) {
		BookMain bm = new BookMain();
		int n = 0;
		
		while(true) {
			System.out.println("============================================");
			System.out.println("1.초기입력||2.삭제||3.입력||4.출력||5.가격정렬||6.종료");
			System.out.println("============================================");
			switch(bm.sc.nextInt()) {
			case 1: 
				System.out.println("how many");
				n = bm.sc.nextInt();
				cnt = n;
				bm.bookArray = new Book[n];
				for(int i = 0; i<n; i++) {
					bm.bookArray[i] = new Book(); 
					//bookArray에 들어갈 인스턴스 bookArray[i]생성. 생성하지않으면 주소값들이 null 이므로 오류발생
					bm.injection(i);	
				}
				break;
			case 2:
				if(cnt>0) {
					System.out.println("arraynumber");
					n = bm.sc.nextInt();
					if(n<=bm.bookArray.length) {
						bm.deleteArray(n, bm.bookArray);
					}else System.out.println("array is not exist");
				}else System.out.println("array is already empty");
				break;
			case 3:
				bm.addArray(bm.bookArray);
				break;
			case 4:
				if(cnt>0) {
					bm.disp(bm.bookArray);
				}else System.out.println("array is empty");
				break;
			case 5:
				if(cnt>0) {
					System.out.println("정렬 전");
					bm.disp(bm.bookArray);
					bm.sortByPrice(bm.bookArray);
					System.out.println("정렬 후");
					bm.disp(bm.bookArray);
				}else System.out.println("array is empty");
				break;
			case 6:
				return;
			default :
				System.out.println("다시입력하시오");
				break;
				
				
			}
		}
		
	}
}
