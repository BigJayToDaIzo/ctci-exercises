package ch1;
/*
Check Permutation: Given two strings, write a method to decide if one is
a permutation of the other.
*/
import ch1.helpers;
import java.util.HashMap;

import static ch1.helpers.stringToHashMap;

public class ctci_1_2
{   
    
    public static boolean checkPermutation(String str1, String str2)
    {
        //are strings same length? 
        if(str1.length() != str2.length()) 
        {
            return false;
        } else
        {
            //build hashmap of each string
            HashMap<Character, Integer> map1 = stringToHashMap(str1);
            HashMap<Character, Integer> map2 = stringToHashMap(str2);

            return map1.equals(map2);
        }
        
    }

}