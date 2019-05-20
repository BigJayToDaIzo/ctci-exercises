package ch1;
import java.util.Map;
import java.util.HashMap;
import java.lang.Math;

import static ch1.helpers.stringToHashMap;

public class ctci_1_5 {
    /*
    There are three types of edits that can be performed on strings: insert a
    character, remove a character, or replace a character.  Given two strings,
    write a function to check if they are one or zero edits away from each
    other.
     */
    public static boolean oneAway(String str1, String str2)
    {
        //String to hashmaps
        int edits = 0;
        HashMap<Character, Integer> map1 = stringToHashMap(str1);
        HashMap<Character, Integer> map2 = stringToHashMap(str2);

        //each difference in string length is an edit.  i.e. str1.length = 2
        // and str2.length() = 4 equates to TWO edits.
        edits = Math.abs(str1.length() - str2.length());
        if(edits > 1) return false;

        //if lengths are within 1, check for matching values for each HashMap
        //iterate over smaller string to check for matches in longer string if
        //sizes are 1 off
        if(str1.length() <= str2.length())
        {
            for(Map.Entry<Character, Integer> pair : map1.entrySet())
            {
                //check existence of char
                if(!map2.containsKey(pair.getKey())) edits += 1;
                else if(map2.get(pair.getKey()) != pair.getValue()) edits += 1;
                if(edits > 1) return false;

            }

        } else
        {
            for(Map.Entry<Character, Integer> pair: map2.entrySet())
            {
                if(!map1.containsKey(pair.getKey())) edits += 1;
                else if(map1.get(pair.getKey()) != pair.getValue()) edits += 1;
                if(edits > 1) return false;

            }

        }
        return true;
    }
}
