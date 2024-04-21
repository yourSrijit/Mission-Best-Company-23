package TCS_NQT24.Digital;

import java.util.*;

public class Q22_findOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stone = sc.nextLine();
        String metal = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stone.length(); i++) {
            map.put(stone.charAt(i), map.getOrDefault(stone.charAt(i), 0) + 1);
        }
        int ans = 0;
        for (int i = 0; i < metal.length(); i++) {
            if (map.containsKey(metal.charAt(i))) {
                ans += map.get(metal.charAt(i));
            }
        }
        System.out.println(ans);
    }
}

/*
Alisha is very fond of collecting stones which contain different metals.
She wanted to keep a track of all the stones the collected which is also a
metal, so she made some code words for each stone and every
character represented a metal Individually. Now that she had many
stones it became really difficult for her to keep a track of it. Help Alisha in
solving this issue by writing a code where you count how many metals are
individually present in a given stone.

Note: stone is representing as a string and metals are represented as
characters of that string.

Input:
Take two strings as input one is the string stone and other is string metal

Output:
Each character of string metal is to be search is present in the string
stone or not. If it is there then count the number of times it has occurred
individually in string stone and print the count.

Sample Input:
Stone - "aAAbbbb
Metal = "a4"

Sample output:
3

Explanation: a has occurred once and A has occurred twice so total 3
 */
