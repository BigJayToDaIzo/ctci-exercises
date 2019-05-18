package ch1;

import java.util.HashMap;
import java.util.Map;

public class ctci_1_4 {
    /*
    Given a string, write a function to check to check if it is a permutation
    of a palindrome.  A palindrome is a word or phrase that is the same forwards
    and backwards.  A permutation is a rearrangement of letters.  The palindrome
    does not need to be limited to just dictionary words.  You can ignore casing
    and non-letter characters.
     */
    public static boolean isPermuPalindrome(String str)
    {
        int singleCharFound = 0; //can be center char, must not exceed 1
        boolean moddableByTwo = true; //non even counts of letters breaks palindrome
        //build hashmap of string
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);

            } else
            {
                map.put(c, 1);

            }
        }
        for(Map.Entry<Character, Integer> pair: map.entrySet())
        {
            if(pair.getValue() == 1) singleCharFound += 1;
            if(singleCharFound > 1) return false;
            if(pair.getValue() != 1 && pair.getValue() % 2 != 0) return false;

        }
        return true;

    }

}
