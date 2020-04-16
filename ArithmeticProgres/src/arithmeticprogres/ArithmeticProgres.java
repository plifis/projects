package arithmeticprogres;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticProgres {


    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);  
    int A;
    int B;
    int N;     
    Integer [] intArr = new Integer [11]; 
    for  (int i=0; i<intArr.length; i++)
    {
    A=sc.nextInt();
    B=sc.nextInt();
    N=sc.nextInt();  
    intArr[i]=0;
    for  (int z=0; z<N; z++)
        {
        int X = A + z*B;
        intArr[i] += X;
    
        }
    
    }
    String strArr = Arrays.toString(intArr);
    System.out.println(strArr);    
    }
    
}