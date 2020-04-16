
package sumloop;

import java.util.Scanner;


public class SumLoop {

public static void main(String[] args) 
{
 System.out.print("Введите число");   
Scanner sc = new Scanner (System.in);
int [] sl = new int [35]; 
int result = 0;
 for (int i =0; i<35; i++) 
    {
    
    sl [i] = sc.nextInt();
    result = result+ sl[i];
    }    
   System.out.print("Сумма " + result+ " " );
    
    }
    
}
