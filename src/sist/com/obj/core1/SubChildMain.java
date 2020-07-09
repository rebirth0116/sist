package sist.com.obj.core1;

public class SubChildMain {

	public static void main(String[] args) {
//		SuperAction s1 = new SuperAction(); //  Object생성 -> SuperAction생성 => SuperAction(Object))
//		s1.superActionProcess();
//		
//		SubAction s2 = new SubAction(); //SubAction(SuperAction(Object()))
//		s2.subActionProcess();
//		s2.superActionProcess();
		
		SubChildAction s3 = new SubChildAction(1);
		// SubChildAction(SubAction(SuperAction(Object())))
//		s3.subActionProcess();
//		s3.subChildActionProcess();
//		s3.superActionProcess();
		System.out.println(s3.getSubChildActionData());
		System.out.println(s3.getSubActionData());
		System.out.println(s3.getSuperActionData());
	}
}
