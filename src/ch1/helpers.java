package ch1;
import java.util.HashMap;

public class helpers {

    public static HashMap stringToHashMap(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++)
        {
            char c1 = str.charAt(i);
            if (!map.containsKey(c1)) {
                map.put(c1, 1);
            } else {
                map.put(c1, map.get(c1) + 1);
            }
        }
        return map;
    }

}
