package com.company;

import ch1.*;

public class Main {

    public static void main(String[] args) {
        //problem 1 tests
        System.out.println("input str: helo " + ctci_1_1.isUnique("helo"));
        System.out.println("input str: hello " + ctci_1_1.isUnique("hello"));

        //problem 2 tests
        System.out.println("string1: permutation string2: noitatumrep");
        System.out.println(ctci_1_2.checkPermutation("permutation", "noitatumrep"));
        System.out.println("string1: permutation string2: permutatiop");
        System.out.println(ctci_1_2.checkPermutation("permutation", "permutatio"));

        //problem 3 tests
        System.out.println("input str: 'input with spaces'");
        System.out.println(ctci_1_3.urlify("input with spaces".toCharArray()));

        //problem 4 tests
        System.out.println("input str: 'aabbccd'");
        System.out.println(ctci_1_4.isPermuPalindrome("aabbccd"));
        System.out.println("input str: 'aabcddee'");
        System.out.println(ctci_1_4.isPermuPalindrome("aabcddee"));

    }
}
