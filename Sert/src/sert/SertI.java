/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sert;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Жулябин
 */
public class SertI {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
    {
        ArrayList <InfoSert> SS = new ArrayList ();
        {
        Scanner sc = new Scanner (System.in);
        String qstn = null;
        do
        {
        System.out.println("Введите номер сертификата соответствия:");
        String scNS = sc.next();
        System.out.println("Введите наименование продукта:");
        String scNP = sc.next();
        System.out.println("Введите дату окончания ГГГГ:");
        Integer scYr = sc.nextInt();
        System.out.println("Введите дату окончания ММ:");
        Integer scMh = sc.nextInt();
        System.out.println("Введите дату окончания ДД:");
        Integer scDd = sc.nextInt();
        SS.add(new InfoSert (scNS, scNP, new GregorianCalendar (scYr, scMh, scDd)));
        System.out.print ("Продолжить ввод? Y/N");
        qstn = sc.next();
        }
        while (qstn.equals("Y"));
        }
        SimpleDateFormat sd = new SimpleDateFormat ("dd,mm,yyyy");
        //вывод  в консоль
        for (InfoSert s : SS)
        {
        System.out.println("Сертификаты соответствия " + s.numSert + " " + s.namePro+
                " " + s.dateExp.get(Calendar.DAY_OF_MONTH)+ "."
                +s.dateExp.get(Calendar.MONTH)+ "." + s.dateExp.get(Calendar.YEAR));       
        } 
       //вывод в файл
        PrintWriter outF = new PrintWriter ( new OutputStreamWriter
        (new FileOutputStream("javaSS.txt", true), "UTF-8"));
        
        for (InfoSert s : SS)
        {
        outF.println("Сертификаты соответствия " + s.numSert + " " + s.namePro+
                " " + s.dateExp.get(Calendar.DAY_OF_MONTH)+ "."
                +s.dateExp.get(Calendar.MONTH)+ "." + s.dateExp.get(Calendar.YEAR));
        System.out.print(s);
       } 
        outF.close ();
    }
    
}
