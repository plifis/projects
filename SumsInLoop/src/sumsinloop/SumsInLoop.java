
package sumsinloop;

import java.util.Arrays;
import java.util.Scanner;

public class SumsInLoop {

    public static void main(String[] args)
    {
     System.out.print("Введите число");
     Scanner sc = new Scanner (System.in); 
     int [][] sIl = new int [13][2];
     int [] result = new int [13];
     int j;
     for (int i=0; i< sIl.length; i++)
     {
     for (j=0; j<=1; j++)
     {
     sIl [i][j] = sc.nextInt();
     }
     result [i] = sIl [i][0] + sIl[i][1];
     
     }
     String strArr = Arrays.toString(result);
    
     System.out.print("Сумма " + strArr);
    }
    
}
