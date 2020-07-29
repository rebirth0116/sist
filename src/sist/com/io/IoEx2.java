package sist.com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class IoEx2 {
	public void bufferFileWrite() {
		BufferedReader br = null;
		BufferedOutputStream bos = null;
		String fileName ="";
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			//InputStreamReader를 통해 InputStream을 Reader에 넣을 수 있다.
			System.out.println("fileName:");
			fileName = br.readLine().trim();
			bos = new BufferedOutputStream(new FileOutputStream(fileName));
			System.out.println("data:");
			bos.write(br.readLine().trim().getBytes());
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(bos!=null)bos.close();
				//close메소드에 자동으로 flush 해주는 기능이 있다.
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void bufferFileRead(String path) {
		
		try(BufferedInputStream bis 
				= new BufferedInputStream(new FileInputStream(path))) {
			//try(){ 괄호 안에 넣으면 close안해도 된다.
			int temp = 0;
			while((temp=bis.read())!=-1) {
				Thread.sleep(10);
				System.out.print((char)temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		IoEx2 i = new IoEx2();
		i.bufferFileRead("d://Baskin31.java");
	}
}
