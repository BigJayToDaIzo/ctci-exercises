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
            if(str.indexOf(i, i + 1) == -1) return false;

        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println("string1: abcdefg");
        System.out.println(isUnique("abcdefg"));
        System.out.println("string2: abcdcba");
        System.out.println(isUnique("abcdcba"));

    }
}