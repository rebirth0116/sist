package sist.com.obj.core4;

public class FontMain {

	
	
	public static void main(String[] args) {
//		Font f = new Font();
//		System.out.println(f.getColor());
//		f.setColor("blue");
//		System.out.println(f.getColor());
		
		Font.getInstance().setColor("yellow");
		System.out.println(Font.getInstance());
	}
	
}
