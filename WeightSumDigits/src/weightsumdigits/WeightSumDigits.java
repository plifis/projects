package weightsumdigits;
import java.util.Arrays;
import java.util.Scanner;

public class WeightSumDigits {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    int i= sc.nextInt();   
    StringBuilder sB = new StringBuilder ();
    int  [] arrInt = new int [i];
    for (int z=0; z<=i-1; z++) {
        Integer A = sc.nextInt();
        sB.append(A).reverse();
        A = Integer.parseInt(sB.toString());
        for (int y=0; y<=sB.length()-1; y++) {
            int div= A%10;
            arrInt [z] += div *(y+1);
            int ost=A/10;
            A =ost;
            }
    sB.setLength(0);
    String s = Arrays.toString(arrInt);
    System.out.print(s);
    }}}