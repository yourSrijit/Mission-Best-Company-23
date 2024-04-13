package TCS_NQT24.TakeUForward.String;

import java.util.*;

public class Q1_findMaxFreqString {
    static String ans = " ";
    static int maxCount = 0;

    public static void findHighFreq(String str) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {

            if (e.getValue() > 1) {
                count++;
            }
        }

        if (count > maxCount) {
            ans = str;
            maxCount = count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" +");
        for (int i = 0; i < arr.length; i++) {
            findHighFreq(arr[i]);
        }

        if (ans != " ") {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}

/*
Find word with highest number of repeated letters in string

Problem Statement: Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.

Examples:

Example 1:
Input: string=”abcdefghij google microsoft”
Output: google
Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words

Example 2:
Input: string = “cameron blue”
Output: -1
Explanation: No word has more than 1 letter.
 */