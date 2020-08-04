package sist.com.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.Vector;

//io[LOCAL STREAM]
public class IoEx3 {
	//byteStream
	
	
	public void byteStreamEx1() {
		ByteArrayInputStream bis = null;
		ByteArrayOutputStream bos = null;
		byte[] b1 = {1,2,3,4,5,6,7,8,9,10};
		byte[] b2 = new byte[b1.length];
		try {
			bis = new ByteArrayInputStream(b1);
			bos = new ByteArrayOutputStream(b1.length);
			
			int data = 0;
			while ((data=bis.read())!=-1) {
				bos.write(data);
			}
//			System.out.println(bos.toString());
			System.out.println(bos.toByteArray()); //주소값
			b2 = bos.toByteArray();
			
			
			System.out.println(bos.toString());
//			//1번에 대한 아스키값이 없어서 깨짐

			
			for(byte b : b2) {
				System.out.println(b);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void byteStreamEx2() {
		ByteArrayInputStream bis = null;
		ByteArrayOutputStream bos = null;
		try {
			bis = new ByteArrayInputStream("qweasdzxc".getBytes());
			bos = new ByteArrayOutputStream();
			int data = 0;
			while((data = bis.read())!=-1) {
				bos.write(data);
			}
			
			System.out.println(bos.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void byteStreamEx3() {
//		try(PrintStream ps = new PrintStream("d://asd.txt")) {
		try(PrintStream ps = new PrintStream(new File("d://asd.txt"))) {
			//다른점?
			
			ps.write("qweasdzxcasdasd".getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void byteStreamEx4() {
		Vector<ByteArrayInputStream> vector = new Vector<ByteArrayInputStream>();
		SequenceInputStream sis=null;
		try {
			
			vector.add(new ByteArrayInputStream("asd".getBytes()));
			vector.add(new ByteArrayInputStream("qwe".getBytes()));
			vector.add(new ByteArrayInputStream("zxc".getBytes()));
			
//			System.out.println(vector); //주소값나옴.
			sis = new SequenceInputStream(vector.elements());
			
			int temp = 0;
			while((temp = sis.read())!=-1) {
				System.out.println((char)temp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			
		} finally {
			
			
//			//이 경우 어떻게 닫아야 하는지?
//			vector는 안닫아도 됨 -> 계속 받는게 아니므로?
//			for(int i = 0; i<vector.size(); i++) {
//				if(vector.get(i)!=null) {
//					try {
//						vector.get(i).close();
//			
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
			
			if(sis!=null)
				try {
					sis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	public static void main(String[] args) {
		IoEx3 i = new IoEx3();
		i.byteStreamEx4();
	}
}
