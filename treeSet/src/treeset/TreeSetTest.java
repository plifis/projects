/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeset;
import java.util.*;
/**
 *
 * @author Администратор
 */
public class TreeSetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
SortedSet <Item> parts = new TreeSet <>();
parts.add(new Item ("toaster", 1234));
parts.add(new Item ("Widget", 4562));
parts.add(new Item ("Modem", 9912));
System.out.println(parts);

SortedSet <Item> sortByDescription = new TreeSet <> (new Comparator <Item>()
{public int compare (Item a, Item b)
{
    String descrA = a.getDescription();
    String descrB = b.getDescription();
    return descrA.compareTo(descrB);
}
});

sortByDescription.addAll(parts);
System.out.println(sortByDescription);
// TODO code application logic here
    }
    
}
