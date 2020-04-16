/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shuffle;
import java.util.*;
/**
 *
 * @author Жулябин
 */
public class ShuffleTest {

   
    public static void main(String[] args) 
    {
      List <Integer> numbers = new ArrayList <> ();
      for (int i =1; i<= 49; i++)
          numbers.add (i);
      Collections.shuffle(numbers);
      List <Integer> winCombination = numbers.subList(0, 11);
      Collections.sort(winCombination);
      System.out.println(winCombination);
            }
    
}
