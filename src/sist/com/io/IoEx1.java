package sist.com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//io --> Byte, Character, Object
//Target(목적지)
public class IoEx1 {

	public void consoleByteStream() {
		System.out.print("Test");
		//out의 목적지 -> consol
		
		BufferedOutputStream bos = null;
		try { //IOException
			bos = new BufferedOutputStream(new FileOutputStream(new File("d:\\abc.txt")));
			//다형성 -> 업캐스트
			//BufferedOutputStream은 기본적으로 8192바이트. full되지 않아도 flush 메소드를 통해 내보낼 수 있다.
			bos.write("hi".getBytes()); //write는 바이트배열을 받는다. "hi"라는 String을 getBytes로 바이트배열화시킨다.
			bos.flush();

		}catch(Exception e) {
			
		}
	}
	
	public void consoleByteStream2() {

		int data;
		try {
			System.out.print("data:");
			while((data = System.in.read())!='q') {
				//하나씩 검사?
				System.out.println((char)data);
				//왜 출력 후 밑에 세칸 빈칸
			}
		}catch(Exception e) {
			
		}
	}
	
	public void consoleByteStream3() {
		System.out.println("data:");
		byte[] data = new byte[100];
		try {
			System.in.read(data);
			if(new String(data).trim().equals("asd")) {
				//data에는 엔터까지 들어가있음
				System.out.println("true");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void consoleByteStream4() {
		System.out.println("Value:");
		byte[] data = new byte[10];
		try {
			System.in.read(data, 0, data.length);
			for(byte b : data) {
				System.out.println(b);  
				//항상 뒤에 13, 10이 나옴 -> 10=LF(line feed==다음줄로) 13=CR(cariage return==제일처음칸으로)
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void consoleTofile() {
		byte[] fileName = new byte[50];
		byte[] data= new byte[100];
		FileOutputStream fos = null;
		try {
			System.out.println("FileName:");
			System.in.read(fileName);
			fos = new FileOutputStream(new File(new String(fileName).trim()));
			System.out.println("Data:");
			boolean isStop = false;
			while(!isStop) {
				System.in.read(data);
				if(new String(data).trim().equals("quite"))break;
				fos.write(new String(data).trim().getBytes());
				fos.write("\r\n".getBytes());
			}
//			fos.write(data); 빈공간이 있음
			System.out.println("FileWrite Success");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void fileToConsole() {
		byte[] fileName = new byte[50];
		byte[] data = new byte[1024];
		FileInputStream fis = null;
		try {
			System.out.println("fileName:");
			System.in.read(fileName, 0, fileName.length);
			fis = new FileInputStream(new String(fileName).trim());
			int temp = 0;
			//BOF(BeginOfFile)|[data]|EOF(EndOfFile)
			while((temp=fis.read())!=-1) {
				Thread.sleep(100);
				System.out.print((char)temp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
	public void fileCopyByte(String origin, String copy) {
		//copy는 byteStream만 가능하다. charStream은 2바이트이기 때문에 이상한 데이터가 사용됨.
		//용량 초과일 경우엔 exception 하면 된다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte[] data = new byte[1024];
		try {
			fis = new FileInputStream(origin);
			fos = new FileOutputStream(copy);
			int size = 0, temp = 0;
			while((temp=fis.read())!=-1) {
				//end of file = -1
				fos.write(temp);
				size++;
			}
			System.out.println(size + "byte fileCopySuccess");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	
	public static void main(String[] args) {
		IoEx1 i = new IoEx1();
//		i.consoleByteStream4();
//		i.consoleTofile();
//		i.fileToConsole();
//		i.fileCopyByte("D://Baskin31.java", "D://asd.txt");
	}
}
