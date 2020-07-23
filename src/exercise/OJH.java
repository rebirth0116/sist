package exercise;

import java.util.Scanner;

class OJH {
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);

      int X = sc.nextInt();
      int i=0, j=1, k=0, n=0; //i, j는 분수 계산용, k, n은 분수 출력용

    
      while(true)
      {
        i=i+j;
        if (i<X)
        {
          j=j+1;
        }  
         else
          break;
      }
      
    k=X-i+j;
    n=j+1-k;
    /* 검증용 출력코드
    System.out.println("X="+X);
    System.out.println("i="+i);
    System.out.println("j="+j);
    System.out.println("k="+k);
    System.out.println("n="+n);
    */
      if(j%2==0)
      {
      System.out.println(k+"/"+n);
      }
      else
      {
        System.out.println(n+"/"+k);
      }
    }
  }
