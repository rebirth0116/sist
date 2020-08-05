package sist.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

//Stream --> 흐름
//io --> Input/Output [목적지로 흐른다]
//DATA [BYTE,CHAR,OBJECT]
public class IoEx6 {
	//ObjectStream 객체를 특정 목적지로 input/output
	//객체의 속성을 열거 [직렬화한다]
	private final String PATH = "d:\\product.dat";
	private Scanner sc = new Scanner(System.in);//콘솔로부터 scan한다.
	
	ArrayList<Product> ap = new ArrayList<Product>();
	
	public void writeObjectEx() {
		//객체생성하고 Stream객체를 통해서 write한다.
		
		
		while(true) {
			Product product = new Product();
			System.out.println("ProductName");
			product.setProductName(sc.next());
			System.out.println("Price");
			product.setPrice(sc.nextInt());
			System.out.println("ProductCategory");
			product.setProductCategory(sc.next());
			System.out.println("ProductOrigin");
			product.setProductOrigin(sc.next());
			ap.add(product);
			System.out.println("more? Y/N");
			String input;
			if((input = sc.next()).equals("N"))break;
			
			
		}
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
			oos.writeObject(ap);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void readObjectEx() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))){
			ArrayList<Product> output = (ArrayList<Product>) ois.readObject();
//			System.out.println(ois.readObject());
			for(int i = 0 ; i<output.size(); i++) {
				System.out.println(output.get(i));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		IoEx6 i = new IoEx6();
//		i.writeObjectEx();
		i.readObjectEx();
	}
	
	
}
