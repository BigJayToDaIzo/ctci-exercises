package ch1;
import static ch1.helpers.stringToHashMap;
import java.util.HashMap;
import java.util.Map;

public class ctci_1_6 {
    /*
    Implement a method to perform basic string compression using the counts of
    repeated characters.  For example, the string 'aabcccccaaa' would become
    'a2b1c5a3'.  If the 'compressed' string would not become smaller than the
    original string, your method should return the original string.  You can
    assume the string has only uppercase and lowercase letters (a - z)
     */
    public static String stringCompress(String str)
    {
        String compString = "";
        //hashmap strings
        HashMap<Character, Integer> map = stringToHashMap(str);
        for(Map.Entry<Character, Integer> pair : map.entrySet())
        {
            compString += pair.getKey();
            compString += pair.getValue();
        }

        if(compString.length() > str.length()) return str;
        else return compString;
    }
}
