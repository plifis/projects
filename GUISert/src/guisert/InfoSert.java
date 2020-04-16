/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guisert;
import java.util.*;
/**
 *
 * @author Жулябин
 */
public class InfoSert extends ArrayList
{
public String numSert;
public String namePro;
public Date dateExp;

public InfoSert (String ns, String np, Date dateE)
{
numSert = ns;
namePro = np;
dateExp = dateE;
}

 public String getName ()
{
return namePro;
}
public String getNum ()
{
return numSert;
}
public Date getDate ()
{
return dateExp;
}

}
