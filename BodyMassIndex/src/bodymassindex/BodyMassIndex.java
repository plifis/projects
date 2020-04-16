package bodymassindex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class BodyMassIndex {

 
    public static void main(String[] args) 
    {
      double BMI;
      int weight;
      double height;
      String [] category = new String [] {"under", "normal", "over", "obese"};
      Scanner sc = new Scanner (System.in);
      int i = sc.nextInt();
      String [] str = new String [i];
       for (int x=0; x<=i-1; x++)
       {
       weight = sc.nextInt();
       height = sc.nextDouble();
       BMI = weight/(height*height);
            if (BMI<18.5)
            {
            str [x]= category [0];
            }
            else 
            {
                if (18.5<= BMI & BMI<25.0)
                        {
                        str [x] = category[1];
                        }
                else 
                    {
                        if (25.0<= BMI & BMI<30.0)
                        {
                        str [x] = category [2];
                        }
                        else {
                              if (30.0 <= BMI)
                              {
                                  String s = category [3];                                  
                                  str [x] = s;//category [3];
                              }
                             }
                    }    
            }  
       }
    String strArr = Arrays.toString(str);
    System.out.println(strArr);
    }   
}