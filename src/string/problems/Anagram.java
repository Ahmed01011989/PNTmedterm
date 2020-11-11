package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a = "ANGEL";
        String b = "GLEAN";

        boolean anagram = checkIfStringsAreAnagram(a,b);

        if (anagram){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }



    }

    private static boolean checkIfStringsAreAnagram(String a, String b) {

        char[] firstArray = a.toCharArray();
        char[] secondArray = b.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }
}