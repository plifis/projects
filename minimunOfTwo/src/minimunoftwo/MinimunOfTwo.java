
package minimunoftwo;

import java.util.Arrays;
import java.util.Scanner;

public class MinimunOfTwo {

   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int [][] mOt = new int [25] [2];
        int [] result = new int [2];
        int i;
        int j;
        for (i=0; i< mOt.length; i++)
        {
          for (j=0;  j<=1; j++)  
            {
            mOt [i][j] = sc.nextInt();
            }
          if (mOt [i][0]>mOt [i][1])
             {
               result [i] = mOt [i][1];
             }
          else 
            {
             result[i] = mOt [i][0];
            }
        }
        String srArray = Arrays.toString(result);
        System.out.print(srArray);
    }
    
}
