package ch1;

import java.util.HashMap;
import java.util.Map;
import static ch1.helpers.stringToHashMap;

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
        //build hashmap of string
        HashMap<Character, Integer> map = stringToHashMap(str);
        for(Map.Entry<Character, Integer> pair: map.entrySet())
        {
            if(pair.getValue() == 1) singleCharFound += 1;
            if(singleCharFound > 1) return false;
            if(pair.getValue() != 1 && pair.getValue() % 2 != 0) return false;

        }
        return true;

    }

}
