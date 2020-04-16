/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {    
    Scanner sc= new Scanner (System.in);
   System.out.print("Введите первое число");
   Integer i1 = sc.nextInt();     
   System.out.print("Введите второе число");
   Integer i2 = sc.nextInt();
   calculate CC = new calculate (i1, i2); 
   System.out.print("сумма" + CC.getSum());
}}   
class calculate {    
private final  Integer num1;
private final  Integer num2;
public  Integer sum;
public  calculate (Integer n1, Integer n2){
num1= n1;
num2= n2;   
}
public Integer getSum (){
        sum = num1 + num2;
        return sum;
        }}
      
      



