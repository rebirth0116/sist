package sist.com.obj.core4;

public class Font {
	private String color;
	private int size;
	private String face;
	private static Font font;
	
	
	public Font() {
		this.color = "red";
		this.size = 7;
		this.face = "굴림";
	}
	
	public static Font getInstance() {
		return font = font==null?new Font():font;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
		@Override
	public String toString() {
		return "Font [color=" + color + ", size=" + size + ", face=" + face + "]";
	}
	
	
}
