package ch1;

public class ctci_1_3
{
    public static String urlify(char[] str)
    {
        String url = "";
        for (Character c : str)
        {
            if(Character.isWhitespace(c))
            {
               url += "%20";
            }else
            {
                url += Character.toString(c);
            }
        }

        return url;
    }
}
