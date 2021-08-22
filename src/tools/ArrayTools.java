/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ArrayTools {
    /**
     * It method oprint the content of a list
     * @param list It is the list to be print.
     */
    public static void print( ArrayList<String> list)
    {
        if( list == null)
        {
            return;
        }
        if( list.size() < 0){
            System.out.println("    - No element to show.");
            return;
        }
        for( Object e: list )
        {
            System.out.println("    - "+e );
        }
    }    
    /**
     * It add a string to a list of strings, if the another string equalt to the string to be added then
     * the string the new string is not added.
     * @param list it is the list of string.
     * @param str It is the string to be added.
     */
    public static void addString( ArrayList<String> list, String str )
    {
        if( list == null )
        {
            return;
        }
        if( str == null )
        {
            return;
        }
        for( String e : list )
        {
            if( e.equals(str) )
            {
                return;
            }
        }
        list.add(str);
    } 
    
}
