
package arraycounters;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCounters {

 
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner (System.in);
      int m = sc.nextInt(); // длина теста
      int n = sc.nextInt(); // количество цифр
      int [] arr = new int [n];
      for (int y=1; y<=m; y++)
        {
         int a= sc.nextInt();
         arr[a-1]= arr[a-1]+1;
        }
    String strArr = Arrays.toString(arr);
    System.out.print(strArr);
    }
    
}