package treeset; 


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Администратор
 */
public class Item implements Comparable<Item> 
{
private String description;
private int partNumber;

public Item (String aDescription, int aPartNumber)
{
description = aDescription;
partNumber = aPartNumber;
}
public String getDescription()
{
return description;
}
public String toString ()
{
return "{description =" + description + ", partNumber = " + partNumber + "}";
}

public boolean equals (Object otherObject)
{
if (this == otherObject) return true;
if (otherObject == null) return false;
if (getClass() != otherObject.getClass()) return false;
Item other = (Item) otherObject;
return Objects.equals(description, other.description) &&
        partNumber == other.partNumber;
}
public int hashCosde ()
{
return Objects.hash(description, partNumber);
}
public int compareTo (Item other)
{
return Integer.compare(partNumber, other.partNumber);
}
        
        
}
