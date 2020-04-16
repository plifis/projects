
package fahrenheittocelsius;

import java.util.Arrays;
import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) 
    {
    Scanner sc =new Scanner (System.in);
    int fahMin = 32;
    int fahMax = 212;
    int celMin = 0;
    int celMax = 100;
    double oneFah = (double) (fahMax-fahMin)/(celMax-celMin);
    System.out.print(oneFah);
    double [] fahArr = new double [35];
    int [] celArr = new int [35];
    
    for (int i=0; i<fahArr.length; i++) 
    {
    fahArr [i] = sc.nextDouble();
    celArr [i] = (int) Math.round((fahArr [i]-32)/ oneFah);
    }
    String strArr = Arrays.toString(celArr);
    System.out.print(strArr);
    }
    
}
