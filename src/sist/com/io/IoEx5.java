package sist.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IoEx5 {
	public void consolCharStream() {
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("fileName:");
			bw = new BufferedWriter(new FileWriter(br.readLine().trim()));
			System.out.println("data:");
			bw.write(br.readLine());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(bw!=null)bw.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
	
	public void charFileCopy() {
		BufferedReader br = null;
		BufferedWriter fbw = null;
		BufferedReader fbr = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("OriginFile:");
			fbr = new BufferedReader(new FileReader(br.readLine().trim()));
			System.out.println("CopyFile:");
			fbw = new BufferedWriter(new FileWriter(br.readLine().trim()));
			String temp = "";
			while((temp = fbr.readLine())!=null) {
				fbw.write(temp);
				fbw.newLine();
			}
			System.out.println("FileCopySuccess!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(fbr!=null)fbr.close();
				if(fbw!=null)fbw.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
	}
	
	public void printWriterEx() {
		try(BufferedReader br = new BufferedReader(new FileReader(new File("d://asd.txt")));
				PrintWriter pw = new PrintWriter("d://asd222.txt");) {
			String temp = "";
			while((temp = br.readLine())!=null) {
				pw.println(temp);
			}
			System.out.println("FileCopySuccess!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		IoEx5 i = new IoEx5();
//		i.consolCharStream();
//		i.charFileCopy();
		i.printWriterEx();
	}
}
