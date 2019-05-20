package com.company;

import ch1.*;

public class Main {

    public static void main(String[] args) {
        //problem 1 tests
        /*System.out.println("Ch1 Problem 1:");
        System.out.println("input str: helo " + ctci_1_1.isUnique("helo"));
        System.out.println("input str: hello " + ctci_1_1.isUnique("hello"));
*/
        //problem 2 tests
        /*System.out.println("Ch1 Problem 2:");
        System.out.println("string1: permutation string2: noitatumrep");
        System.out.println(ctci_1_2.checkPermutation("permutation", "noitatumrep"));
        System.out.println("string1: permutation string2: permutatiop");
        System.out.println(ctci_1_2.checkPermutation("permutation", "permutatio"));*/

        //problem 3 tests
        /*System.out.println("Ch1 Problem 3:");
        System.out.println("input str: 'input with spaces'");
        System.out.println(ctci_1_3.urlify("input with spaces".toCharArray()));*/

        //problem 4 tests
        /*System.out.println("Ch1 Problem 4:");
        System.out.println("input str: 'aabbccd'");
        System.out.println(ctci_1_4.isPermuPalindrome("aabbccd"));
        System.out.println("input str: 'aabcddee'");
        System.out.println(ctci_1_4.isPermuPalindrome("aabcddee"));*/

        //problem 5 tests
        /*System.out.println("Ch1 Problem 5:");
        System.out.println("input str1: face input str2: face");
        System.out.println(ctci_1_5.oneAway("face", "face")); //true
        System.out.println("input str1: face input str2: bace");
        System.out.println(ctci_1_5.oneAway("face", "bace")); //true
        System.out.println("input str1: face input str2: fac");
        System.out.println(ctci_1_5.oneAway("face", "fac")); //true
        System.out.println("input str1: face input str2: faces");
        System.out.println(ctci_1_5.oneAway("face", "faces")); //true
        System.out.println("input str1: face input str2: baces");
        System.out.println(ctci_1_5.oneAway("face", "baces")); //false
        System.out.println("input str1: face input str2: bacesf");
        System.out.println(ctci_1_5.oneAway("face", "bacesf")); //false

        //problem 6 tests
        System.out.println("input str: abcde");
        System.out.println(ctci_1_6.stringCompress("abcde")); //str
        System.out.println("input str: abbcccddddeeeee");
        System.out.println(ctci_1_6.stringCompress("abbcccddddeeeee")); //compStr
        System.out.println("input str: aabbc");
        System.out.println(ctci_1_6.stringCompress("aabbc")); //str*/

        //problem 7 tests
        System.out.println("input matrix: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("expected output matrix: {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}");
        int[][] newMatrix = ctci_1_7.rotateMatrix(matrix);
        System.out.println(helpers.prettyPrintMatrix(newMatrix));

        System.out.println("input matrix: {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}," +
                "{16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}}");
        int[][] matrix2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        System.out.println("expected output matrix: {{21, 16, 11, 6, 1}, {22, 17, 12, 7, 2}," +
                " {23, 18, 13, 8, 3}, {24, 19, 14, 9, 4}, {25, 20, 15, 10, 5}}");
        int[][] newMatrix2 = ctci_1_7.rotateMatrix(matrix2);
        System.out.println(helpers.prettyPrintMatrix(newMatrix2));




    }
}
