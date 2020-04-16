
package reversestring;

import java.util.Scanner;


public class ReverseString {

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     char [] revStr = null;
     int leng=0;
     int i;
     if (sc.hasNext())
        {
        leng++;
        
        }
    System.out.print(leng);
     for (i=leng; i<=0; i--)
        {
        revStr [i]= sc.next().charAt(i);
        }
     
     System.out.print(revStr.length);
    }
    
}
