package ch1;
/*
Check Permutation: Given two strings, write a method to decide if one is
a permutation of the other.
*/

import java.util.HashMap;
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
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(int i = 0; i < str1.length(); i++)
            {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);
                if(!map1.containsKey(c1))
                {
                    map1.put(c1, 1);
                } else
                {
                    map1.put(c1, map1.get(c1) + 1);
                }

                if(!map2.containsKey(c2))
                {
                    map2.put(c2, 1);
                } else
                {
                    map2.put(c2, map2.get(c2) + 1);
                }
                
            }
            return map1.equals(map2);
        }
        
    }

}