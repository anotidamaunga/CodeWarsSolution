/*
Description:
Take 2 strings s1 and s2 including only letters from a to z.
Return a new sorted string (alphabetical ascending), the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
 */

import java.util.Scanner;
import java.util.stream.Collectors;

public class TwotoOne {
    public static String longest (String s1, String s2) {
        return (s1 + s2)//concatenate the two strings
                .chars()//separate into strings
                .mapToObj(c -> String.valueOf((char)c))//make sure that each char value has an index in the new concatenated sentence
                .distinct()//make sure the char being added is unique and not already in the array
                .sorted()//sort the letters
                .collect(Collectors.joining());//join them into a string.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(longest(s1, s2));

    }

}
