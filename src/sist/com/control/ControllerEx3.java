package sist.com.control;

public class ControllerEx3 {
	static int i;
	public void loopEx1() {
		for( i = 0; i<5;++i) {
			System.out.println(i);
		}
		System.out.println("check"+i);
		

	}
	
	public void loopEx2() {
		int sum = 0, even = 0, odd = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				even+=i;
			}else odd+=i;
			sum+=i;
		}
		System.out.println(sum+" "+even+" "+odd);
	}

	public void loopEx3(int a) {
		if(a==5)return;
		System.out.println(a);
		loopEx3(a+1);
	}
	
	public void loopEx3(double a) {
		int i = 0, j = 0;
		while(true) {
			System.out.print(i);
			System.out.println();

			j=0;
			while(true) {
				System.out.print(j);
				if(j==3)break;
				j++;
			}
			System.out.println();
			if(i==5)break;
			i++;
		}
	}
	
	public void loopTest() {
		int i=2, j=1;
		while(true) {
			j=1;
			while(true) {
				System.out.println(i+" * "+j+" = "+i*j);
				if(j==9) break;
				j++;
			}
			System.out.println("-------------");
			if(i==9)break;
			i++;
		}
	}
	//마름모 그리기
	public void draw() {
	
		for(int i = 1; i<=5;i++) {
			for(int j =0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k =0; k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>0;i--) {
			for(int j=5-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=2*i-1;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//정사각형 그리기
	public void draw2() {
		for(int i = 0;i<5;i++) {
			for(int j = 0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//직각삼각형 그리기
	public void draw3() {
		for(int i = 0; i<5; i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//직각삼각형 반대
	public void draw4() {
		for(int i = 0;i<5;i++) {
			for(int j = 4-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void game(int last) {
		int a=1;
		while(a<=last) {
			String check = Integer.toString(a);
			if(check.contains("3")||check.contains("6")||check.contains("9"))System.out.println("¦");
			else System.out.println(a);
			a++;
		}
	}
	
	public void ranAvg(int num) {
		int sum = 0;
		int x = 0;
		while(x<num) {
			sum+=Math.random()*100;
			x++;
		}
		System.out.println(sum/num);
	}
	public static void main(String[] args) {
		ControllerEx3 c = new ControllerEx3();
		c.loopEx1();
		c.loopEx2();
		c.loopEx3(0);
		c.loopEx3(0.0);
		c.loopTest();
		c.draw();
		c.draw2();
		c.draw3();
		c.draw4();
		c.game(40);
		System.out.println();
		c.ranAvg(30);
	}
}
