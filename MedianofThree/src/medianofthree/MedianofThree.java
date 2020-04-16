
package medianofthree;

import java.util.Arrays;
import java.util.Scanner;


public class MedianofThree 
{  
    public static void main(String[] args)
    {
     Scanner sc = new Scanner (System.in);
     int qSt; //количество строк
     int i=sc.nextInt();
     Integer [] arr = new Integer [i];
     for (int z=0; z<arr.length; z++) //заполнять массив медиан
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if ((a>b & a<c)|(a<b & a>c)){
            arr [z]=a;
            }
            else{ if ((b>a & b<c) | (b<a & b>c))
            {
            arr [z]=b;
            }
                else {if ((c>a & c<b) | (c<a & c>b))
                    {
                    arr [z]=c;
                    }
                     }
                }
        }
     String arrStr = Arrays.toString(arr);
     System.out.println(arrStr);
    }
    
}
