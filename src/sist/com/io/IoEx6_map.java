package sist.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class IoEx6_map {
	final static String PATH = "d:\\hashmapEx.data";
	HashMap<String, Product> map = new HashMap<String, Product>();
	private Scanner sc = new Scanner(System.in);
	
	public void objectWrite() {
		boolean isstop = false;
		while(!isstop) {
			Product p = new Product();
			System.out.println("ProductName");
			p.setProductName(sc.next());
			System.out.println("Price");
			p.setPrice(sc.nextInt());
			System.out.println("ProductCategory");
			p.setProductCategory(sc.next());
			System.out.println("ProductOrigin");
			p.setProductOrigin(sc.next());
			map.put(p.getProductName(), p);
			System.out.println("계속입력? y/n");
			String input = sc.next();
			if(input.equals("n"))isstop = true;
		}
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
			
			oos.writeObject(map);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void objectRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))){
			
			HashMap<String, Product> temp = (HashMap<String, Product>) ois.readObject(); 
			System.out.println("상품명을 입력하십시오.");
			System.out.println(temp.keySet());
			System.out.println(temp.get(sc.next()));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		IoEx6_map i = new IoEx6_map();
//		i.objectWrite();
		i.objectRead();
	}

}
