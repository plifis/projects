
package rounding;

import java.util.Arrays;
import java.util.Scanner;


public class Rounding {

    public static void main(String[] args) 
    {
    Scanner sc= new Scanner (System.in); 
    double [][] rou = new double [12][2];
    int [] result = new int [12];
    double d1;
    double d2;
    int i;
    int j;
    for (i=0; i< rou.length; i++)
        {
         for (j=0; j<=1; j++)
            {
             rou [i][j]= sc.nextInt();
            }
         d1 = rou [i][0]/rou [i][1];
         result [i] = (int) Math.round(d1);
        }
    String strArr = Arrays.toString(result);
    System.out.print(strArr);
    }
    
}
