
package minimumofthree;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumOfThree {
   
    public static void main(String[] args) 
    {
   Scanner sc = new Scanner (System.in);
   int [][] minThree = new int [24][3];
   int [] result = new int [24];
   int i; 
   int j;
 
   for (i=0; i<minThree.length; i++)
   {
       for (j=0; j<3; j++)
       {
       minThree [i][j] = sc.nextInt();
       if  (minThree [i][0]> minThree[i][1]) 
         {
            if (minThree [i][1]> minThree [i][2])
               {
                result[i]=minThree [i][2];
               }
            else 
               {
                result[i]=minThree [i][1];
               }
         }
       else 
       {
           if (minThree [i][0]> minThree [i][2])
           {
           result [i] = minThree [i][2];
           }
           else 
           {
           result [i] = minThree [i][0];
           }
       }
       }    
 String strArr = Arrays.toString(result);
   System.out.print(strArr);
   }
   String strArr = Arrays.toString(result);
   System.out.print(strArr);      
       
    }
    
}
