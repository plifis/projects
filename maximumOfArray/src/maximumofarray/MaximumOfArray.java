
package maximumofarray;

import java.util.Scanner;

public class MaximumOfArray {

    public static void main(String[] args) 
    {
    Scanner sc= new Scanner (System.in); 
    int [] mOa = new int [300];
    int min;
    int max;
    int i;
    for (i=0; i<300; i++)  
    {
    mOa[i] = sc.nextInt();
    }
    min = mOa[0];
    max = mOa[0];
    for (i=1; i<300; i++)  
        {
        if (mOa[i]>max)
            {
             max = mOa[i];
            }
        if (mOa[i]<min) 
            {
            min = mOa[i];
            }
        }
    
    System.out.println(max +" "+ min);
    }
    
}
