package vowelcount;

import java.util.Arrays;
import java.util.Scanner;

public class VowelCount 
{
    
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner (System.in); 
    String [] str = new String [16];
    int [] qty = new int [16];
    int q=0; 
    int i;
    char [] abc = {'a', 'o', 'u', 'i', 'e', 'y'};
    int z;
    int y;
    //счетчик строк
    for (i=0; i<str.length; i++)
    {  
        str [i] = sc.nextLine();
        String sTs = str [i];
        // счетчик симолов в строке
        for(z=0; z<sTs.length(); z++)
        {       
            //счетчик проверяемых символов
            for (y=0; y<abc.length; y++)
           {   
            if (sTs.charAt(z) == abc[y])    
            {
               q++;
            }     
           }
        }
    qty[i]=q;
    q=0;
    }
    String strArr = Arrays.toString(qty);
    System.out.println(strArr);
    
    }
    
}