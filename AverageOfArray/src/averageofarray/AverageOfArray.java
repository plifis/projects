package averageofarray;

import java.util.Arrays;

import java.util.Scanner;
public class AverageOfArray 
{ 
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        int fig;
        int x=11;
        int z=0;  
        double strSum=0;
        int [] allSum = new int [x];
        for (int y=0; y<x; y++)
        {
          while ((fig = sc.nextInt())!=0 )
            {
            strSum = strSum+fig;
           
            z++;
            }
        double d =   Math.round(strSum/z);
        allSum [y]= (int) d;
        z=0;
        strSum=0;
        }   
        String str= Arrays.toString(allSum);
        System.out.print(str);
   }
}
