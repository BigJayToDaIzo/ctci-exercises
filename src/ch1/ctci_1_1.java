package ch1;
/*
Is Unique: Implement an algorithm to determine if a string has all unique
characters.  What if you cannot use additional data structures?
*/

public class ctci_1_1
{
    public static boolean isUnique(String str)
    {
        for (int i = 0; i < str.length() - 1; i++)
        {
            int temp = str.indexOf(i, i + 1);
            if(str.indexOf(str.charAt(i), i + 1) != -1)
            {
               return false;
            }
        }
        return true;
    }

}