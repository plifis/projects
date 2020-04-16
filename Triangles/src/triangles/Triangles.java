
package triangles;

import java.util.Arrays;
import java.util.Scanner;


public class Triangles {

  
    public static void main(String[] args) 
    {
    Integer [] intArr = new Integer [2];
    Scanner sc = new Scanner (System.in);
    int A;
    int B;
    int C;
    for (int i=0; i<intArr.length; i++)
        {
         A=sc.nextInt();
         B=sc.nextInt();
         C=sc.nextInt();
         if ( A+B>C || A+C>B || B+C>A)
         {
         intArr[i] =1;
         }
         else 
         {
         intArr[i] =0;
         }
        }
    
    String str = Arrays.toString(intArr);
    System.out.println(str);
    }
    
}
