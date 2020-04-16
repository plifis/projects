/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;
import java.util.*;
/**
 *
 * @author Администратор
 */
public class PriorityQueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        PriorityQueue <GregorianCalendar> pq = new PriorityQueue <> ();
       
        pq.add (new GregorianCalendar (1906, Calendar.DECEMBER, 9));
        pq.add (new GregorianCalendar (1855, Calendar.JULY, 16));
        pq.add (new GregorianCalendar (1903, Calendar.MAY, 8));
        pq.add (new GregorianCalendar (1910, Calendar.NOVEMBER, 24));
        
        System.out.println("Iterraring over elements....");
        for (GregorianCalendar date : pq)
            System.out.println(date.get(Calendar.YEAR));
// TODO code application logic here
System.out.println("REmoving elemnts...");
while (!pq.isEmpty())
    System.out.println(pq.remove().get(Calendar.YEAR));

    }
    
}
