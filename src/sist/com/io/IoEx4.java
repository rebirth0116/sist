package sist.com.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//IO[STREAM] CharacterStream
public class IoEx4 {

	CharArrayReader cr = null;
	CharArrayWriter cw = null;
	char[] c1 = {'a','가','나','d'};
	char[] c2 = new char[c1.length];
	
	public void charEx1() {
		
		try {
			cr = new CharArrayReader(c1);
			cw = new CharArrayWriter();
			int data = 0;
			while((data = cr.read())!=-1) {
				System.out.println((char)data);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void charEx2() {
		CharArrayWriter cw = null;
		try (CharArrayReader cr = new CharArrayReader("가나다라".toCharArray())){
			cw = new CharArrayWriter();
			int data = 0;
			while((data = cr.read())!=-1) {
				cw.write((char)data);
			}
			
			System.out.println(cw.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void charEx3() {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("d://asd.txt");
			fw = new FileWriter(new File("d://asd2.txt"));
			int data = 0;
			while((data = fr.read())!=-1) {
				fw.write((char)data);
			}
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	
	public void charEx4() {
		//미완
		PrintWriter pw = null;
		try (FileReader fr = new FileReader("d://Baskin31.java")){
			int data = 0;
			while((data = fr.read())!=-1) {
//				Thread.sleep(100);
//				System.out.print((char)data);
				pw.write((char)data);
			}
			System.out.println(pw.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		IoEx4 i = new IoEx4();
		i.charEx4();
	}
}
