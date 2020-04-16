
package sumdigits;

import java.util.Arrays;
import java.util.Scanner;


public class SumDigits {


    public static void main(String[] args) 
    {
    Integer [] intArr = new Integer [11];
    Scanner sc = new Scanner (System.in);
    int A;
    int B;
    int C;
    for (int i=0; i<intArr.length;i++)
    {
     A= sc.nextInt();
     B= sc.nextInt();
     C= sc.nextInt();
     int X = A*B+C;
     intArr[i] = 0;
     for (int z=X; z>0;)
     {
     int div = z%10; 
     intArr[i] += div;    
     int q = z/10;
     z=q;
     }     
    }   
    String strArr = Arrays.toString(intArr);
    System.out.println(strArr);
    }
    
}
