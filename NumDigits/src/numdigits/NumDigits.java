
package numdigits;

import java.util.Scanner;


public class NumDigits 
{
    public static void main(String[] args) 
    {
      Integer [] intArr = new Integer [5];  
      Scanner sc = new Scanner (System.in);
      int A;
      int B;
      int C;
      int sum;
      for (int i=0; i<intArr.length; i++)
      {
          A = sc.nextInt();
          B = sc.nextInt();
          C = sc.nextInt();
          sum = A*B+C;
      }
    }   
}
