package TCS_NQT24.Digital;


import java.util.*;

public class Q10_LongestSubstringWithoutRepeatingChar {
    public static int findMaxChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = findMaxChar(str);
        System.out.println(ans);

    }
}


/*
Longest Substring Without Repeating Character
Given a string s,Find the length of the longest substring without repeating character.

Example 1
input : s="abcabcbb"
output=3
Explanation: The answer is 'abc' with the length of 3
 */